/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import control.control;
import view.bantuan;
import view.kalkulator;
import view.recordingKambing;
import view.tambah;
import model.m_recordingKambing;

/**
 *
 * @author ASUS
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        control control;
        control = new control(new recordingKambing(),new kalkulator(),new bantuan(),new tambah(), new m_recordingKambing());
    }
    
}
