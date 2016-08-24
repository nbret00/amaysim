package com.nino.amaysim;

/**
 *
 * @author nbret00
 * 
 * This class takes care of booting up the embedded container with Spring
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Bootstrap {

    public static void main(String[] args) {
        SpringApplication.run(Bootstrap.class, args);
    }

}
