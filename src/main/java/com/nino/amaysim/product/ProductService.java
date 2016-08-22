/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nino.amaysim.product;

/**
 *
 * @author nbret00
 */
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ProductService {

    private static final String TEMPLATE = "Hello, %s!";

    @RequestMapping("/Product")
    public HttpEntity<Product> product(
            @RequestParam(value = "name", required = false, defaultValue = "World") String name) {

        Product greeting = new Product(String.format(TEMPLATE, name),"","","","",true,false,"","",true,"","");
        //greeting.add(linkTo(methodOn(ProductService.class).greeting(name)).withSelfRel());

        return new ResponseEntity<Product>(greeting, HttpStatus.OK);
    }
}