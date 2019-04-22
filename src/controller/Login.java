/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.M_auth;
import view.V_login;

/**
 *
 * @author zha
 */
public class Login {
    
    M_auth model;
    V_login view;
    
    public Login(M_auth model, V_login view) {
        this.model = model;
        this.view = view;
        
        view.setVisible(true);
    }
    
}
