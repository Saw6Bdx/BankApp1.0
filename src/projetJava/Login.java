/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetJava;

import utils.Check;

/**
 *
 * @author Mary
 */
public class Login {
    
    public Login(String login, String pwd) {
        
        Check.checkIsEmpty(login,"login");
        Check.checkIsEmpty(pwd,"pwd");
        
        this.login = login;
        this.pwd = pwd;
    }
    
    public String getLogin() {
        return this.login;
    }
    
    public String getPwd() {
        return this.pwd;
    }
    
    private String login, pwd;
}
