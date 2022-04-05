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
public class NodoSC {

    private Estudiante elemento;
    private NodoSC siguiente;

    public NodoSC() {
        this.siguiente = null;
    }

    /**
     * @return the elemento
     */
    public Estudiante getElemento() {
        return elemento;
    }

    /**
     * @return the siguiente
     */
    public NodoSC getSiguiente() {
        return siguiente;
    }

    /**
     * @param elemento the elemento to set
     */
    public void setElemento(Estudiante elemento) {
        this.elemento = elemento;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoSC siguiente) {
        this.siguiente = siguiente;
    }

}
