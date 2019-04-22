/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controller.Login;
import model.M_auth;
import view.V_login;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        M_auth m = new M_auth();
        V_login v = new V_login();
        Login c = new Login(m, v);
    }
    
}
