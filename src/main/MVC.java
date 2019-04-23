/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import model.M_user;
import view.login;
import view.daftar;
import view.lupa_password;
import controller.user;
/**
 *
 * @author ASUS
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        user control;
        control = new user(new login(), new daftar(), new lupa_password(),new M_user());
    }
    
}
