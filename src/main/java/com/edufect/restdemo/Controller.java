/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edufect.restdemo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Vishal
 */
@RestController
@CrossOrigin(allowedHeaders="*", value="*")
public class Controller {
    
    @GetMapping(value="/welcome1")
    public String welcomeEdufect(){
        return "welcome to edufect";
    }
    
    @GetMapping(value="/welcome2")
    public String welcomeTrisect(){
        return "welcome to trisect";
    }
    
    @GetMapping(value="/welcome3")
    public String welcomeNewgen(){
        return "welcome to Newgen";
    }
    
}
