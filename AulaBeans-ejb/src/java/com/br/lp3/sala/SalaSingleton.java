/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp3.sala;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import javax.ejb.Startup;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 *
 * @author 31240550
 */
@Singleton
@LocalBean
@WebListener
@Startup
public class SalaSingleton implements HttpSessionListener {
    private int cont = 0;
    
    @PostConstruct
    private void init() {
        System.out.println("Sala pronta");
    }

    @PreDestroy
    private void close() {
        System.out.println("Sala terminada");
    }
    
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        cont++;
        System.out.println("Usuários ativos:" + cont);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        cont--;
        System.out.println("Usuários ativos" + cont);
    }
    
}
