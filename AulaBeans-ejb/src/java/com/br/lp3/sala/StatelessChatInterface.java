/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp3.sala;

import javax.ejb.Local;

/**
 *
 * @author 31240550
 */
@Local
public interface StatelessChatInterface {

    void connect();

    void desconnect();

    void say(String msg);
    
}
