/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import model.M_user;
import view.login;
import view.register;
import view.forgotten_password;
import controller.users;
/**
 *
 * @author ASUS
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        users control;
        control = new users(new login(), new register(), new forgotten_password(),new M_user());
    }
    
}
