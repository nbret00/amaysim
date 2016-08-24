package com.nino.amaysim.product;
/**
 * @Author nbret00
 * 
 * A subset of Projuct class for minimal data
 * 
 **/
 
import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductHeader extends ResourceSupport {

    private final String code;
    private final String name;
    private final String description;
    private final String price;
    /*
    private final String expiry;
    private final boolean isPlan;
    private final boolean isUnlimited;
    private final String size;
    private final boolean is4G;
    private final boolean isAutoRenew;
    private final String termURL;
    private final String infoURL;
*/
    

    @JsonCreator
    public ProductHeader(
            @JsonProperty("code") String code, 
            @JsonProperty("name") String name,
            @JsonProperty("description") String description,
            @JsonProperty("price") String price
            
            /*,
            @JsonProperty("expiry") String expiry,
            @JsonProperty("isPlan") boolean isPlan,
            @JsonProperty("isUnlimited") boolean isUnlimited,
            @JsonProperty("size") String size,
            @JsonProperty("is4G") boolean is4G,
            @JsonProperty("isAutoRenew") boolean isAutoRenew,
            @JsonProperty("termURL") String termURL,
            @JsonProperty("infoURL") String infoURL
            */
            ) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.price = price;
        /*
        this.expiry = expiry;
        this.isPlan = isPlan;
        this.isUnlimited = isUnlimited;
        this.size = size;
        this.is4G = is4G;
        this.isAutoRenew = isAutoRenew;
        this.termURL = termURL;
        this.infoURL = infoURL;
        */
    }

    public String getCode() {
        return code;
    }
    
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }
    /*
    public String getExpiry() {
        return expiry;
    }

    public boolean isIsPlan() {
        return isPlan;
    }

    public boolean isIsUnlimited() {
        return isUnlimited;
    }

    public String getSize() {
        return size;
    }

    public boolean getIs4G() {
        return is4G;
    }

    public boolean isIsAutoRenew() {
        return isAutoRenew;
    }

    public String getTermURL() {
        return termURL;
    }

    public String getInfoURL() {
        return infoURL;
    }    
*/
}
