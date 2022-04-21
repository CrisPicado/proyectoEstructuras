/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Cris Picado
 */
public class Validaciones {

    /**
     * Validar Cedula
     *
     * @param pCedula
     * @return
     */
    public static boolean validarCedula(String pCedula) {
        int lengthId = pCedula.length();

        if (lengthId == 11) {
            if ((pCedula.substring(1, 2).equals("-")) && (pCedula.substring(6, 7).equals("-"))) {
                try {
                    int seg1 = Integer.valueOf(pCedula.substring(0, 1));
                    int seg2 = Integer.valueOf(pCedula.substring(2, 5));
                    int seg3 = Integer.valueOf(pCedula.substring(7, 10));
                    return true;
                } catch (Exception e) {
                    return false;
                }
            }
        }
        return false;
    }

    
    public static String formatoCedula(String cedula) {

        String seg1 = cedula.substring(0, 1);
        String seg2 = cedula.substring(1, 5);
        String seg3 = cedula.substring(5, 9);

        return seg1 + "-" + seg2 + "-" + seg3;

    }

    public static boolean validarCorreo(String correo) {
        // Patrón para validar el email
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        // El email a validar
        String pCorreo = correo;

        Matcher mather = pattern.matcher(pCorreo);

        if (mather.find() == true) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validarVacios(String cedula, String nombre, String apePa, String apeMa, String contacto, String correo){
        
        if(cedula.equals("") && nombre.equals("") && apePa.equals("") && apeMa.equals("") && contacto.equals("") && correo.equals("") ){
            return true;
        }else{
            return false;
        }
        
    }
    
}
