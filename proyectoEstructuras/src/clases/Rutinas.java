/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Cris Picado
 */
public class Rutinas {

    //Declaraciión de Nodos
    public NodoLS inicioLS;
    public NodoLD inicioLD;

    public NodoSC inicioSC;
    public NodoSC finSC;

    public NodoDC inicioDC;
    public NodoDC finDC;

    public NodoProfLS inicioLSP;
    public NodoProfLS finLSP;

    //inicialización de nodos
    public Rutinas() {
        this.inicioLS = null;
        this.inicioLD = null;
        this.inicioSC = null;
        this.inicioDC = null;
        this.inicioLSP = null;
    }

    //Validar estado vacio de estructuras
    public boolean estaLSVacia() {
        if (inicioLS == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean estaLDVacia() {
        if (inicioLD == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean estaSCVacia() {
        if (inicioSC == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean estaDCVacia() {
        if (inicioDC == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean vaciaLSP() {
        if (inicioLSP == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insertarLS(String ced, String nom, String apePA, String apeMa, int contacto, String tipoHorario, String horario) {//"No. Cédula","Nombre","Apellido Paterno","Apellido Materno","Contacto","Tipo Horario","Horario"
        Estudiante e = new Estudiante();
        e.setNumCedula(ced);
        e.setNombre(nom);
        e.setApePaterno(apePA);
        e.setApeMaterno(apeMa);
        e.setContacto(contacto);
        e.setHorario(horario);
        e.setTipoHorario(tipoHorario);
        NodoLS nuevo = new NodoLS();
        nuevo.setElemento(e);
        if (this.estaLSVacia()) {
            inicioLS = nuevo;
        } else if (Integer.parseInt(e.getNumCedula()) < Integer.parseInt(inicioLS.getElemento().getNumCedula())) {
            nuevo.setSiguiente(inicioLS);
            inicioLS = nuevo;
        } else if (inicioLS.getSiguiente() == null) {
            inicioLS.setSiguiente(nuevo);
        } else {
            NodoLS aux = inicioLS;
            while (Integer.parseInt(aux.getSiguiente().getElemento().getNumCedula()) < Integer.parseInt(e.getNumCedula())) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
        }

        JOptionPane.showMessageDialog(null, "Estudiante" + e.getNumCedula() + " - " + e.getNombre() + " " + e.getApePaterno() + " " + e.getApeMaterno() + " ha sido agregado a la lista!");

    }

    public void mostrarLS() {
        NodoLS actual = inicioLS;
        String str = "";
        if (!this.estaLSVacia()) {
            while (actual != null) {
                str += actual.getElemento().getNumCedula() + " " + actual.getElemento().getNombre() + " " + actual.getElemento().getApePaterno() + " " + actual.getElemento().getApeMaterno() + "<---\n";
                actual = actual.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La lista contiene el doble de todos los numeros de la lista Circular Simple: \n" + str, "Contenido de la lista", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se puede mostrar la lista", "Contenido de la lista vacio", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void insertarLSP(String cedula, String nombre, String apellidoP, String apellidoM, int telefono, String correo, String asignatura) {
        Profesores r = new Profesores();
        r.setCedula(cedula);
        r.setNombre(nombre);
        r.setApellidoP(apellidoP);
        r.setApellidoM(apellidoM);
        r.setTelefono(telefono);
        r.setCorreo(correo);
        r.setAsignatura(asignatura);
        NodoProfLS nuevo = new NodoProfLS();
        nuevo.setElemento(r);
        if (this.vaciaLSP()) {
            inicioLSP = nuevo;
        } else if (Integer.parseInt(r.getCedula()) < Integer.parseInt(inicioLSP.getElemento().getCedula())) {
            nuevo.setSiguiente(inicioLSP);
            inicioLSP = nuevo;
        } else if (inicioLSP.getSiguiente() == null) {
            inicioLSP.setSiguiente(nuevo);
        } else {
            NodoProfLS aux = inicioLSP;
            while (Integer.parseInt(aux.getSiguiente().getElemento().getCedula()) < Integer.parseInt(r.getCedula())) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
        }
        JOptionPane.showMessageDialog(null, "Profesor" + r.getCedula() + " - " + r.getNombre() + " " + r.getApellidoP() + " " + r.getApellidoM() + "ha sido agregado a la lista!");
    }

    public void mostrarLSP() {
        NodoProfLS actual = inicioLSP;
        String str = "";
        if (!this.vaciaLSP()) {
            while (actual != null) {
                str += actual.getElemento().getCedula() + " " + actual.getElemento().getNombre() + " " + actual.getElemento().getApellidoP() + " " + actual.getElemento().getApellidoM() + "<---\n";
                actual = actual.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La lista contiene el doble de todos los numeros de la lista Circular Simple: \n" + str, "Contenido de la lista", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se puede mostrar la lista", "Contenido de la lista vacio", JOptionPane.INFORMATION_MESSAGE);
        }
    }
} 
