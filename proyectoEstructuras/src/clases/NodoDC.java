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
public class NodoDC {

    private Estudiante elemento;
    private NodoDC siguiente;
    private NodoDC anterior;

    public NodoDC() {
        this.siguiente = null;
        this.anterior = null;
    }

    /**
     * @return the anterior
     */
    public NodoDC getAnterior() {
        return anterior;
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
    public NodoDC getSiguiente() {
        return siguiente;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoDC anterior) {
        this.anterior = anterior;
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
    public void setSiguiente(NodoDC siguiente) {
        this.siguiente = siguiente;
    }

}
