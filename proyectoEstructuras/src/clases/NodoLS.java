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
public class NodoLS {

    private Estudiante elemento;
    private NodoLS siguiente;

    public NodoLS() {
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
    public NodoLS getSiguiente() {
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
    public void setSiguiente(NodoLS siguiente) {
        this.siguiente = siguiente;
    }

}
