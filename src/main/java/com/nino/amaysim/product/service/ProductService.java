/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nino.amaysim.product.service;

/**
 *
 * @author nbret00
 */

import com.nino.amaysim.product.Product;
import com.nino.amaysim.product.ProductHeader;
import java.util.ArrayList;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class ProductService {

    @RequestMapping("/Products")
    public List<ProductHeader> products() {
        
        reloadProducts();
        List<ProductHeader> productheaderlist = new ArrayList<ProductHeader>(products.size());
        //List<Product> products_res = new ArrayList<Product>(products.size());
        Set<String> keys = products.keySet();
        for(String key: keys){
            Product iprod = (Product)products.get(key);
            ProductHeader iprodheader = iprod.productHeader();
            iprodheader.add(linkTo(methodOn(ProductService.class).product(key)).withSelfRel());
            productheaderlist.add(iprodheader);
        }

        return productheaderlist;
    }
    
    @RequestMapping("/Products/{Prod_ID}")
    public Product product(@PathVariable("Prod_ID") String prod_id){
        
        reloadProducts();
        
        Product prod = (Product)products.get(prod_id);
        prod.add(linkTo(methodOn(ProductService.class).products()).withRel("List All"));
        return prod;
    }
    
//------------------------------------------

    private Hashtable products = new Hashtable();
    private void reloadProducts(){
        products.clear();
        products.put("ult_small", new Product("ult_small","Unlimited 1GB","","24.90","30",true,true,"1024",true,true,"http://amaysim.com.au/terms-conditions/special-conditions-and-service-description-unlimited-1gb.pdf",""));
        products.put("ult_medium", new Product("ult_medium","Unlimited 2GB","","29.90","30",true,true,"2048",true,true,"",""));
        products.put("ult_large", new Product("ult_large","Unlimited 5GB","","44.90","30",true,true,"5120",true,true,"",""));
        products.put("ult_xlarge", new Product("ult_xlarge","Unlimited 8GB","","49.90","30",true,true,"8192",true,true,"",""));
    }
}