/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entrecodigos.controllers;

import com.entrecodigos.dao.prueba;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author samv
 */
@RestController("/catalogos")
public class catalogosControllers {
    
    @Autowired
    @Qualifier("objEditorialDao")
    private prueba p;
    
    @GetMapping("/inicio")
    public Object obtenerLink(){
      return this.p.getPrueba();
    }
}
