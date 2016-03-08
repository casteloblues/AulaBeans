/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp3.sala;

import javax.ejb.Stateless;

/**
 *
 * @author 31240550
 */
@Stateless
public class StatelessChat implements StatelessChatInterface {
    private String uname = "Anonymous";
    
    @Override
    public void connect() {
        System.out.println(uname + " entered the room");
    }

    @Override
    public void desconnect() {
        System.out.println(uname + " left the room");
    }

    @Override
    public void say(String msg) {
        System.out.println(uname + " said: " + msg);
    }
    
    
}
