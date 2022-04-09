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

    //Declaración de Nodos
    public static NodoLS inicioLS;
    public static NodoLS finLS;

    public static NodoLD inicioLD;
    public static NodoLD finLD;

    public static NodoSC inicioSC;
    public static NodoSC finSC;

    public static NodoDC inicioDC;
    public static NodoDC finDC;

    public static NodoProfLS inicioLSP;
    public static NodoProfLS finLSP;

    public static NodoP cima;

    //inicialización de nodos
    public Rutinas() {
        this.inicioLS = null;
        this.finLS = null;
        this.inicioLD = null;
        this.finLD = null;
        this.inicioSC = null;
        this.finSC = null;
        this.inicioDC = null;
        this.finDC = null;
        this.inicioLSP = null;
        this.cima = null;
    }

    //Validar estado vacio de estructuras
    public static boolean estaLSVacia() {
        if (inicioLS == null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean estaLDVacia() {
        if (inicioLD == null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean estaSCVacia() {
        if (inicioSC == null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean estaDCVacia() {
        if (inicioDC == null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean vaciaLSP() {
        if (inicioLSP == null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean estaPilaVacia() {
        if (cima == null) {
            return true;
        } else {
            return false;
        }
    }

    public static void insertarLS(String ced, String nom, String apePA, String apeMa, String contacto, String correo, String tipoHorario, String horario) {//"No. Cédula","Nombre","Apellido Paterno","Apellido Materno","Contacto","Tipo Horario","Horario"
        Estudiante e = new Estudiante();
        e.setNumCedula(ced);
        e.setNombre(nom);
        e.setApePaterno(apePA);
        e.setApeMaterno(apeMa);
        e.setContacto(contacto);
        e.setCorreo(correo);
        e.setHorario(horario);
        e.setTipoHorario(tipoHorario);
        NodoLS nuevo = new NodoLS();
        nuevo.setElemento(e);
        if (estaLSVacia()) {
            inicioLS = nuevo;
        } else if (e.getNumCedula().compareTo(inicioLS.getElemento().getNumCedula()) < 0) {
            nuevo.setSiguiente(inicioLS);
            inicioLS = nuevo;
        } else if (inicioLS.getSiguiente() == null) {
            inicioLS.setSiguiente(nuevo);
        } else {
            NodoLS aux = inicioLS;
            while ((aux.getSiguiente() != null) && (aux.getSiguiente().getElemento().getNumCedula().compareTo(e.getNumCedula())) < 0) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
        }

        JOptionPane.showMessageDialog(null, "Estudiante: " + e.getNumCedula() + " - " + e.getNombre() + " " + e.getApePaterno() + " " + e.getApeMaterno() + " ha sido agregado a la lista simple!");

    }

    public static void mostrarLS() {
        NodoLS actual = inicioLS;
        String str = "";
        if (!estaLSVacia()) {
            while (actual != null) {
                str += actual.getElemento().getNumCedula() + " " + actual.getElemento().getNombre() + " " + actual.getElemento().getApePaterno() + " " + actual.getElemento().getApeMaterno() + "<---\n";
                actual = actual.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La lista contiene el doble de todos los numeros de la lista simple: \n" + str, "Contenido de la lista", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se puede mostrar la lista", "Contenido de la lista vacio", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void eliminarRegistroLS(String cedula) {
        boolean encontrado = false;
        NodoLS aux = inicioLS;
        NodoLS anterior = null;

        if (!Rutinas.estaLSVacia()) {

            while (aux != null && encontrado != true) {

                if (aux.getElemento().getNumCedula().equals(cedula) ) {

                    if (aux == inicioLS) {
                        inicioLS = inicioLS.getSiguiente();
                    } else if (aux == finLS) {
                        anterior.setSiguiente(null);
                        finLS = anterior;
                    } else {
                        anterior.setSiguiente(aux.getSiguiente());
                    }
                    JOptionPane.showMessageDialog(null, "Datos eliminados correctamente");
                    encontrado = true;
                    

                }
                anterior = aux;
                aux = aux.getSiguiente();
            }
            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "Dato no encontrado , vehiculo consultado no existe");
            }
        } else {
            JOptionPane.showInputDialog(null, "No se puede mostrar la lista", "Contenido de la lista vacio", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void insertarLSP(String cedula, String nombre, String apellidoP, String apellidoM, String telefono, String correo, String asignatura) {
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
        if (vaciaLSP()) {
            inicioLSP = nuevo;
        } else if (r.getCedula().compareTo(inicioLSP.getElemento().getCedula()) < 0) {
            nuevo.setSiguiente(inicioLSP);
            inicioLSP = nuevo;
        } else if (inicioLSP.getSiguiente() == null) {
            inicioLSP.setSiguiente(nuevo);
        } else {
            NodoProfLS aux = inicioLSP;
            while ((aux.getSiguiente() != null) && (aux.getSiguiente().getElemento().getCedula().compareTo(r.getCedula()) < 0)) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
        }
        JOptionPane.showMessageDialog(null, "Profesor" + r.getCedula() + " - " + r.getNombre() + " " + r.getApellidoP() + " " + r.getApellidoM() + "ha sido agregado a la lista!");
    }

    public static void mostrarLSP() {
        NodoProfLS actual = inicioLSP;
        String str = "";
        if (!vaciaLSP()) {
            while (actual != null) {
                str += actual.getElemento().getCedula() + " " + actual.getElemento().getNombre() + " " + actual.getElemento().getApellidoP() + " " + actual.getElemento().getApellidoM() + "<---\n";
                actual = actual.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La lista contiene el doble de todos los numeros de la lista Circular Simple: \n" + str, "Contenido de la lista", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se puede mostrar la lista", "Contenido de la lista vacio", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void insertarLD(String ced, String nom, String apePA, String apeMa, String contacto, String correo, String horario, String tipoHorario) {
        Estudiante e = new Estudiante();
        e.setNumCedula(ced);
        e.setNombre(nom);
        e.setApePaterno(apePA);
        e.setApeMaterno(apeMa);
        e.setContacto(contacto);
        e.setCorreo(correo);
        e.setHorario(horario);
        e.setTipoHorario(tipoHorario);
        NodoLD nuevo = new NodoLD();
        nuevo.setElemento(e);
        if (Rutinas.estaLDVacia()) {
            inicioLD = nuevo;
            inicioLD.setSiguiente(null);
            inicioLD.setAnterior(null);
            finLD = nuevo;
        } else if (Integer.parseInt(e.getNumCedula()) < Integer.parseInt(inicioLD.getElemento().getNumCedula())) {
            inicioLD.setAnterior(nuevo);
            nuevo.setSiguiente(inicioLD);
            inicioLD = nuevo;
            inicioLD.setAnterior(finLD);
        } else if (Integer.parseInt(e.getNumCedula()) > Integer.parseInt(finLD.getElemento().getNumCedula())) {
            finLD.setSiguiente(nuevo);
            nuevo.setSiguiente(inicioLD);
            nuevo.setAnterior(finLD);
            finLD = nuevo;
            inicioLD.setAnterior(finLD);
        } else {
            NodoLD aux = inicioLD;

            while (Integer.parseInt(aux.getElemento().getNumCedula()) < Integer.parseInt(e.getNumCedula())) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            nuevo.setAnterior(aux);
            aux.setSiguiente(nuevo);
        }
        JOptionPane.showMessageDialog(null, "Estudiante: " + e.getNumCedula() + " - " + e.getNombre() + " " + e.getApePaterno() + " " + e.getApeMaterno() + " ha sido agregado a la lista doble!");

    }

    public static void llenarPila(String horario) {
        Dato d = new Dato();
        d.setHorario(horario);
        NodoP nuevo = new NodoP();
        nuevo.setElemento(d);
        if (Rutinas.estaPilaVacia()) {
            cima = nuevo;
        } else {
            nuevo.setSiguiente(cima);
            cima = nuevo;
        }
        System.out.println("elemento apilado");
    }

    public static void mostrarPila() {

        String s = "";

        NodoP actual = cima;

        if (!estaPilaVacia()) {

            while (actual != null) {
                s += actual.getElemento().getHorario() + "<--\n";
                actual = actual.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La pila contiene: \n\n" + s,
                    "Mostrar Pila", JOptionPane.PLAIN_MESSAGE);
        }

    }

}
