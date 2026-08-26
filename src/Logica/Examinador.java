/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author garci
 */
public class Examinador {

    public String ExaminadorTxt(JTextField atributo, String mensajeError) {
        String dato = atributo.getText();

        if (dato == null || dato.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, mensajeError);
            return null;
        }
        return dato;
    }

    public double ExaminadorDouble(JTextField atributo, String mensajeError) {
        String dato = atributo.getText();

        if (dato == null || dato.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, mensajeError);
            return 0;
        }
        try {
            return Double.parseDouble(dato);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, mensajeError);
            return 0;
        }
    }
    
    public int ExaminadorInt(JTextField atributo, String mensajeError) {
        String dato = atributo.getText();
        
        if(dato == null || dato.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, mensajeError);
            return 0;
        }
        try {
            return Integer.parseInt(dato);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, mensajeError);
            return 0;
        }
    }
}
