/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import model.m_user;
import view.v_login;
import view.v_registration;
import view.v_forgot_password;
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
        control = new users(new v_login(), new v_registration(), new v_forgot_password(),new m_user());
    }
    
}
