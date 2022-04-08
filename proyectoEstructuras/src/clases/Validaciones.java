/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

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
    
    
    

}
