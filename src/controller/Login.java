/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import model.M_auth;
import model.M_user;
import view.V_login;

/**
 *
 * @author zha
 */
public class Login {
    
    M_auth model;
    V_login login_view;
    
    public Login(M_auth model, V_login view) {
        this.model = model;
        this.login_view = view;
        M_user user = new M_user();
        String [] result = user.getUser(1);
        
        System.out.println(result[1]);
        
        view.setVisible(true);
        
        view.ClickLogin(new Masuk());
    }
    
    public class Masuk implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String email = login_view.getTf_email().getText();
            String password = login_view.getTf_password().getText();
            try {
                int[] result = model.authenticate(email, password);
                if(result[0] > 0) {
                    login_view.dispose();
                    switch(result[1]) {
                        case 1:
                            System.out.println("View Admin");
                            break;
                        case 2:
                            System.out.println("View Manajer");
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        default:
                            break;
                    }
                } else {
                    login_view.setAlertMessage("Username atau password salah");
                }
            } catch (SQLException error) {
                login_view.setAlertMessage("Username atau password salah");
            }
        }
    }
}
