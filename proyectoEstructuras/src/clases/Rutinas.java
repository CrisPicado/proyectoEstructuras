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
public class Rutinas {

    //Declaraciión de Nodos
    private NodoLS inicioLS;
    private NodoLD inicioLD;

    private NodoSC inicioSC;
    private NodoSC finSC;
    
    private NodoDC inicioDC;
    private NodoDC finDC;

    //inicialización de nodos
    public Rutinas() {
        this.inicioLS = null;
        this.inicioLD = null;
        this.inicioSC = null;
        this.inicioDC = null;
    }

    //Validar estado vacio de estructuras
    public boolean estaLSVacia(){
        if(inicioLS==null){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean estaLDVacia(){
        if(inicioLD==null){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean estaSCVacia(){
        if(inicioSC==null){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean estaDCVacia(){
        if(inicioDC==null){
            return true;
        }else{
            return false;
        }
    }
    
    public void insertarLS(){
        
        for (int i = 0; i < 20; i++) {
            Estudiante e = new Estudiante();
            
            NodoSC nuevo = new NodoSC();
            nuevo.setElemento(e);
            if (this.estaLSVacia()) {
                inicioSC = nuevo;
                finSC = nuevo;
                finSC.setSiguiente(inicioSC);
            }/*else if (e < inicioSC.getElemento()) {
                nuevo.setSiguiente(inicioSC);
                inicioSC = nuevo;
                finSC.setSiguiente(inicioSC);
            } else if (d.getNum() > finSC.getElemento()) {
                finSC.setSiguiente(nuevo);
                finSC = nuevo;
                finSC.setSiguiente(inicioSC);
            } else {
                NodoSC aux = inicioSC;
                while (aux.getSiguiente().getElemento().getNum() < d.getNum()) {
                    aux = aux.getSiguiente();
                }
                nuevo.setSiguiente(aux.getSiguiente());
                aux.setSiguiente(nuevo);
                finSC.setSiguiente(inicioSC);
            }
        }
        JOptionPane.showMessageDialog(null, "Se llenó la lista simple circular!");
    */
    }
    
    }
}
