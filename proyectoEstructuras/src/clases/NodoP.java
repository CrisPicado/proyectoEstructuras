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
public class NodoP {
    
    private Dato elemento;
    private NodoP siguiente;
    
    public NodoP(){
        this.siguiente=null;
    }

    /**
     * @return the elemento
     */
    public Dato getElemento() {
        return elemento;
    }

    /**
     * @return the siguiente
     */
    public NodoP getSiguiente() {
        return siguiente;
    }

    /**
     * @param elemento the elemento to set
     */
    public void setElemento(Dato elemento) {
        this.elemento = elemento;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoP siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
