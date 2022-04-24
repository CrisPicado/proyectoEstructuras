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
    
    //Nodos Lista Simple - Matematicas
    public static NodoLS inicioLS;
    public static NodoLS finLS;

    //Nodos Lista Doble - Estudios Sociales
    public static NodoLD inicioLD;
    public static NodoLD finLD;

    //Nodos Lista Simple Circular -  Espanol
    public static NodoSC inicioSC;
    public static NodoSC finSC;

    //Nodos Lista Doble Circular - Ciencias
    public static NodoDC inicioDC;
    public static NodoDC finDC;
 
    //Nodos Lista Simple - Profesores
    public static NodoProfLS inicioLSP;
    public static NodoProfLS finLSP;

    //Nodo pila - almacena horarios
    public static NodoP cima;

    //Cola Grupo Matematicas - Horario Matutino
    public static NodoC inicioCMatuMat;
    public static NodoC finCMatuMat;
    //Cola Grupo Matematicas - Horario Vespertino
    public static NodoC inicioCVesMat;
    public static NodoC finCVesMat;

    //Cola Grupo Matematicas - Horario Nocturno
    public static NodoC inicioCNocMat;
    public static NodoC finCNocMat;

    //Cola Grupo Estudios Sociales - Horario Matutino
    public static NodoC inicioCMatuES;
    public static NodoC finCMatuES;
    //Cola Grupo Estudios Sociales - Horario Vespertino
    public static NodoC inicioCVesperES;
    public static NodoC finCVesperES;

    //Cola Grupo Estudios Sociales - Horario Nocturno
    public static NodoC inicioCNocES;
    public static NodoC finCNocES;

    //Cola Grupo Espanol - Horario Matutino
    public static NodoC inicioCMatuE;
    public static NodoC finCMatuE;

    //Cola Grupo Espanol - Horario Vespertino
    public static NodoC inicioCVesperE;
    public static NodoC finCVesperE;

    //Cola Grupo Espanol - Horario Nocturno
    public static NodoC inicioCNocE;
    public static NodoC finCNocE;

    //Cola Grupo Ciencias - Horario Matutino
    public static NodoC inicioCMatuC;
    public static NodoC finCMatuC;

    //Cola Grupo Ciencias - Horario Matutino
    public static NodoC inicioCVesperC;
    public static NodoC finCVesperC;

    //Cola Grupo Ciencias - Horario Matutino
    public static NodoC inicioCNoC;
    public static NodoC finCNoC;

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
        this.finLSP = null;

        this.cima = null;

        this.inicioCMatuMat = null;
        this.finCMatuMat = null;

        this.inicioCVesMat = null;
        this.finCVesMat = null;

        this.inicioCNocMat = null;
        this.finCNocMat = null;

        this.inicioCMatuES = null;
        this.finCMatuES = null;

        this.inicioCVesperES = null;
        this.finCVesperES = null;

        this.inicioCNocES = null;
        this.finCNocES = null;

        this.inicioCMatuE = null;
        this.finCMatuE = null;

        this.inicioCVesperE = null;
        this.finCVesperE = null;

        this.inicioCNocE = null;
        this.finCNocE = null;

        this.inicioCMatuC = null;
        this.finCMatuC = null;

        this.inicioCVesperC = null;
        this.finCVesperC = null;

        this.inicioCNoC = null;
        this.finCNoC = null;

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

    public static boolean estaColaMatuMatVacia() {
        if (inicioCMatuMat == null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean estaColaVesperMatVacia() {
        if (inicioCVesMat == null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean estaColaNocMatVacia() {
        if (inicioCNocMat == null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean estaColaMatuESVacia() {
        if (inicioCMatuES == null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean estaColaVesperESVacia() {
        if (inicioCVesperES == null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean estaColaNocESVacia() {
        if (inicioCNocES == null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean estaColaMatuEVacia() {
        if (inicioCMatuE == null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean estaColaVesperEVacia() {
        if (inicioCVesperE == null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean estaColaNocEVacia() {
        if (inicioCNocE == null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean estaColaMatuCVacia() {
        if (inicioCMatuC == null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean estaColaVesperCVacia() {
        if (inicioCVesperC == null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean estaColaNoCVacia() {
        if (inicioCNoC == null) {
            return true;
        } else {
            return false;
        }
    }

    //////////************ Metodos para Lista Simple - Curso Matematicas ************//////////
    public static void insertarLS(String ced, String nom, String apePA, String apeMa, String contacto, String correo, String tipoHorario, String horario) {//"No. Cédula","Nombre","Apellido Paterno","Apellido Materno","Contacto","Tipo Horario","Horario"
        try {
            if (Validaciones.validarCorreo(correo) == false) {
                JOptionPane.showMessageDialog(null, "Error en ingreso de datos, favor revisar correo electronico!");
            } else if (existeLS(ced) == true) {
                JOptionPane.showMessageDialog(null, "Error: Estudiante existente en sistema! Favor validar.", "Estado registro - Matemáticas", JOptionPane.ERROR_MESSAGE);
            } else {

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

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Revisar correo electrónico, no cumple con formato", "Estado Insercion datos", JOptionPane.WARNING_MESSAGE);
        }

    }

    public static boolean existeLS(String pCed) {

        boolean siExiste = false;
        NodoLS aux = inicioLS;

        if (!Rutinas.estaLSVacia()) {

            while (aux != null && siExiste != true) {

                if (aux.getElemento().getNumCedula().equals(pCed)) {
                    siExiste = true;
                    return siExiste;
                } else {
                    siExiste = false;
                }
                aux = aux.getSiguiente();
            }
        }

        return siExiste;

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

                if (aux.getElemento().getNumCedula().equals(cedula)) {

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
            JOptionPane.showMessageDialog(null, "No se puede mostrar la lista", "Contenido de la lista vacio", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void editarRegistroLS(String cedula, String nombre, String apellidoP, String apellidoM, String correo, String contacto, String tipoHorario, String horarioDisponible) {

        try {
            if (Validaciones.validarCorreo(correo) == false) {
                JOptionPane.showMessageDialog(null, "Error en ingreso de datos, favor revisar correo electronico!");
            } else {
                String pCed = Validaciones.formatoCedula(JOptionPane.showInputDialog("Digite la cedula del estudiante a modificar: "));
                boolean encontrado = false;
                NodoLS aux = inicioLS;

                if (!Rutinas.estaLSVacia()) {

                    while (aux != null && encontrado != true) {

                        if (aux.getElemento().getNumCedula().equals(pCed)) {

                            if (Validaciones.validarCedula(cedula) == true && Validaciones.validarCorreo(correo) == true) {

                                aux.getElemento().setNumCedula(cedula);
                                aux.getElemento().setNombre(nombre);
                                aux.getElemento().setApePaterno(apellidoP);
                                aux.getElemento().setApeMaterno(apellidoM);
                                aux.getElemento().setContacto(contacto);
                                aux.getElemento().setCorreo(correo);
                                aux.getElemento().setTipoHorario(tipoHorario);
                                aux.getElemento().setHorario(horarioDisponible);
                                encontrado = true;
                            }
                        }
                        aux = aux.getSiguiente();
                    }
                    if (!encontrado) {
                        JOptionPane.showMessageDialog(null, "Dato no encontrado , estudiante consultado no existe");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede mostrar la lista", "Contenido de la lista vacio", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        } catch (Exception e) {
            //System.out.println("Revisar insertarLS" + e);
            JOptionPane.showMessageDialog(null, "Revisar correo electrónico, no cumple con formato", "Estado Insercion datos", JOptionPane.WARNING_MESSAGE);
        }

    }

    //////////************ Metodos para Lista Simple Profesores ************//////////
    public static void insertarLSP(String cedula, String nombre, String apellidoP, String apellidoM, String telefono, String correo, String asignatura) {
        try {
            if (Validaciones.validarCorreo(correo) == false) {
                JOptionPane.showMessageDialog(null, "Error en ingreso de datos, favor revisar correo electronico!", "Estado registro Profesores", JOptionPane.ERROR_MESSAGE);
            } else if (existeLSP(cedula) == true) {
                JOptionPane.showMessageDialog(null, "Error: Profesor existente en sistema! Favor validar.", "Estado registro Profesores", JOptionPane.ERROR_MESSAGE);
            } else {
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

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Revisar correo electrónico, no cumple con formato", "Estado Insercion datos", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static boolean existeLSP(String pCed) {

        boolean siExiste = false;
        NodoProfLS aux = inicioLSP;

        if (!Rutinas.vaciaLSP()) {

            while (aux != null && siExiste != true) {

                if (aux.getElemento().getCedula().equals(pCed)) {
                    siExiste = true;
                    return siExiste;
                } else {
                    siExiste = false;
                }
                aux = aux.getSiguiente();
            }
        }

        return siExiste;

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

    public static void eliminarRegistroLSP(String cedula) {
        boolean encontrado = false;
        NodoProfLS aux = inicioLSP;
        NodoProfLS anterior = null;

        if (!Rutinas.vaciaLSP()) {

            while (aux != null && encontrado != true) {

                if (aux.getElemento().getCedula().equals(cedula)) {

                    if (aux == inicioLSP) {
                        inicioLSP = inicioLSP.getSiguiente();
                    } else if (aux == finLSP) {
                        anterior.setSiguiente(null);
                        finLSP = anterior;
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
            JOptionPane.showMessageDialog(null, "No se puede mostrar la lista", "Contenido de la lista vacio", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void editarRegistroLSP(String cedula, String nombre, String apellidoP, String apellidoM, String telefono, String correo, String asignatura) {

        try {
            if (Validaciones.validarCorreo(correo) == false) {
                JOptionPane.showMessageDialog(null, "Error en ingreso de datos, favor revisar correo electronico!");
            } else {
                String pCed = Validaciones.formatoCedula(JOptionPane.showInputDialog("Digite la cedula del estudiante a modificar: "));
                boolean encontrado = false;
                NodoProfLS aux = inicioLSP;

                if (!Rutinas.vaciaLSP()) {

                    while (aux != null && encontrado != true) {

                        if (aux.getElemento().getCedula().equals(pCed)) {

                            if (Validaciones.validarCedula(pCed) == true && Validaciones.validarCorreo(correo) == true) {

                                aux.getElemento().setCedula(cedula);
                                aux.getElemento().setNombre(nombre);
                                aux.getElemento().setApellidoP(apellidoP);
                                aux.getElemento().setApellidoM(apellidoM);
                                aux.getElemento().setTelefono(telefono);
                                aux.getElemento().setCorreo(correo);
                                aux.getElemento().setAsignatura(asignatura);
                                encontrado = true;
                            } else {
                                JOptionPane.showMessageDialog(null, "Revisar correo electrónico, no cumple con formato", "Estado Insercion datos", JOptionPane.WARNING_MESSAGE);
                            }
                            aux = aux.getSiguiente();
                        }

                    }
                    if (!encontrado) {
                        JOptionPane.showMessageDialog(null, "Dato no encontrado , profesor consultado no existe");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede mostrar la lista", "Contenido de la lista vacio", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        } catch (Exception e) {
            //System.out.println("Revisar insertarLS" + e);
            JOptionPane.showMessageDialog(null, "Revisar correo electrónico, no cumple con formato", "Estado Insercion datos", JOptionPane.WARNING_MESSAGE);
        }

    }

    //////////************ Metodos para Lista Doble - Curso Estudios Sociales ************//////////
    public static void insertarLD(String ced, String nom, String apePA, String apeMa, String contacto, String correo, String tipoHorario, String horarioDisponible) {

        try {
            if (Validaciones.validarCorreo(correo) == false) {
                JOptionPane.showMessageDialog(null, "Error en ingreso de datos, favor revisar correo electronico!");
            } else if (existeLD(ced) == true) {
                JOptionPane.showMessageDialog(null, "Error: Estudiante existente en sistema! Favor validar.", "Estado registro Profesores", JOptionPane.ERROR_MESSAGE);
            } else {
                Estudiante e = new Estudiante();
                e.setNumCedula(ced);
                e.setNombre(nom);
                e.setApePaterno(apePA);
                e.setApeMaterno(apeMa);
                e.setContacto(contacto);
                e.setCorreo(correo);
                e.setTipoHorario(tipoHorario);
                e.setHorario(horarioDisponible);
                NodoLD nuevo = new NodoLD();
                nuevo.setElemento(e);
                if (Rutinas.estaLDVacia()) {
                    inicioLD = nuevo;
                    inicioLD.setSiguiente(null);
                    inicioLD.setAnterior(null);
                    finLD = inicioLD;
                } else if (e.getNumCedula().compareTo(inicioLD.getElemento().getNumCedula()) < 0) { // Integer.parseInt(e.getNumCedula()) < Integer.parseInt(inicioLD.getElemento().getNumCedula())
                    inicioLD.setAnterior(nuevo);
                    nuevo.setSiguiente(inicioLD);
                    inicioLD = nuevo;
                    inicioLD.setAnterior(finLD);
                } else if (e.getNumCedula().compareTo(finLD.getElemento().getNumCedula()) > 0) { // Integer.parseInt(e.getNumCedula()) > Integer.parseInt(finLD.getElemento().getNumCedula())
                    finLD.setSiguiente(nuevo);
                    nuevo.setSiguiente(null);
                    nuevo.setAnterior(finLD);
                    finLD = nuevo;

                } else {
                    NodoLD aux = inicioLD;

                    while (aux.getSiguiente().getElemento().getNumCedula().compareTo(e.getNumCedula()) < 0) { // Integer.parseInt(aux.getElemento().getNumCedula()) < Integer.parseInt(e.getNumCedula())
                        aux = aux.getSiguiente();
                    }
                    nuevo.setSiguiente(aux.getSiguiente());
                    nuevo.setAnterior(aux);
                    aux.setSiguiente(nuevo);
                }
                JOptionPane.showMessageDialog(null, "Estudiante: " + e.getNumCedula() + " - " + e.getNombre() + " " + e.getApePaterno() + " " + e.getApeMaterno() + " ha sido agregado a la lista doble!");
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Revisar correo electrónico, no cumple con formato", "Estado Insercion datos", JOptionPane.WARNING_MESSAGE);
        }

    }

    public static boolean existeLD(String pCed) {

        boolean siExiste = false;
        NodoLD aux = inicioLD;

        if (!Rutinas.estaLDVacia()) {

            while (aux != null && siExiste != true) {

                if (aux.getElemento().getNumCedula().equals(pCed)) {
                    siExiste = true;
                    return siExiste;
                } else {
                    siExiste = false;
                }
                aux = aux.getSiguiente();
            }
        }

        return siExiste;

    }

    public static void editarRegistroLD(String cedula, String nombre, String apellidoP, String apellidoM, String correo, String contacto, String tipoHorario, String horarioDisponible) {

        try {
            String pCed = Validaciones.formatoCedula(JOptionPane.showInputDialog("Digite la cedula del estudiante a modificar: "));
            boolean encontrado = false;
            NodoLD aux = inicioLD;

            if (!Rutinas.estaLDVacia()) {

                while (aux != null && encontrado != true) {

                    if (aux.getElemento().getNumCedula().equals(pCed)) {

                        if (Validaciones.validarCedula(pCed) == true && Validaciones.validarCorreo(correo) == true) {

                            aux.getElemento().setNumCedula(cedula);
                            aux.getElemento().setNombre(nombre);
                            aux.getElemento().setApePaterno(apellidoP);
                            aux.getElemento().setApeMaterno(apellidoM);
                            aux.getElemento().setContacto(contacto);
                            aux.getElemento().setCorreo(correo);
                            aux.getElemento().setTipoHorario(tipoHorario);
                            aux.getElemento().setHorario(horarioDisponible);
                            encontrado = true;
                        }

                    }
                    aux = aux.getSiguiente();
                }
                if (!encontrado) {
                    JOptionPane.showMessageDialog(null, "Dato no encontrado , estudiante consultado no existe");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se puede mostrar la lista", "Contenido de la lista vacio", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Revisar correo electrónico, no cumple con formato", "Estado Insercion datos", JOptionPane.WARNING_MESSAGE);

        }

    }

    public static void eliminarRegistroLD(String ced) {
        NodoLD aux = inicioLD;
        NodoLD anterior = null;

        if (!Rutinas.estaLDVacia()) {

            while (aux != null) {
                if (aux.getElemento().getNumCedula().equals(ced)) {
                    if (aux == inicioLD) {
                        inicioLD = inicioLD.getSiguiente();
                        JOptionPane.showMessageDialog(null, "Datos eliminados correctamente");
                    } else if (aux == finLD) {
                        anterior.setSiguiente(null);
                        finLD = anterior;
                        JOptionPane.showMessageDialog(null, "Datos eliminados correctamente");
                    } else {
                        anterior.setSiguiente(aux.getSiguiente());
                        aux.getSiguiente().setAnterior(aux.getAnterior());
                        JOptionPane.showMessageDialog(null, "Datos eliminados correctamente");
                    }

                }
                anterior = aux;
                aux = aux.getSiguiente();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se puede mostrar la lista", "Contenido de la lista vacio", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    //////////************ Metodos para Lista Simple Circular - Curso Espanol ************//////////
    public static void insertarLSC(String ced, String nom, String apePA, String apeMa, String contacto, String correo, String tipoHorario, String horario) {

        try {
            if (Validaciones.validarCorreo(correo) == false) {
                JOptionPane.showMessageDialog(null, "Error en ingreso de datos, favor revisar correo electronico!");
            } else if (existeLSC(ced) == true) {
                JOptionPane.showMessageDialog(null, "Error: Estudiante existente en sistema! Favor validar.", "Estado registro Profesores", JOptionPane.ERROR_MESSAGE);
            } else {
                Estudiante e = new Estudiante();
                e.setNumCedula(ced);
                e.setNombre(nom);
                e.setApePaterno(apePA);
                e.setApeMaterno(apeMa);
                e.setContacto(contacto);
                e.setCorreo(correo);
                e.setTipoHorario(tipoHorario);
                e.setHorario(horario);
                NodoSC nuevo = new NodoSC();
                nuevo.setElemento(e);
                if (Rutinas.estaSCVacia()) {
                    inicioSC = nuevo;
                    finSC = nuevo;
                    finSC.setSiguiente(inicioSC);
                } else if (e.getNumCedula().compareTo(inicioSC.getElemento().getNumCedula()) < 0) {
                    nuevo.setSiguiente(inicioSC);
                    inicioSC = nuevo;
                    finSC.setSiguiente(inicioSC);
                } else if (e.getNumCedula().compareTo(finSC.getElemento().getNumCedula()) > 0) {
                    finSC.setSiguiente(nuevo);
                    finSC = nuevo;
                    finSC.setSiguiente(inicioSC);
                } else {
                    NodoSC aux = inicioSC;
                    while (aux.getSiguiente().getElemento().getNumCedula().compareTo(e.getNumCedula()) < 0) {
                        aux = aux.getSiguiente();
                    }
                    nuevo.setSiguiente(aux.getSiguiente());
                    aux.setSiguiente(nuevo);
                    finSC.setSiguiente(inicioSC);
                }
                JOptionPane.showMessageDialog(null, "Estudiante: " + e.getNumCedula() + " - " + e.getNombre() + " " + e.getApePaterno() + " " + e.getApeMaterno() + " ha sido agregado a la Lista Circular Simple!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Revisar correo electrónico, no cumple con formato", "Estado Insercion datos", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static boolean existeLSC(String pCed) {

        boolean siEsta = false;
        NodoSC aux = inicioSC;

        if (!Rutinas.estaSCVacia()) {

            while (aux != inicioSC && siEsta != true) {

                if (aux.getElemento().getNumCedula().equals(pCed)) {
                    siEsta = true;
                    return siEsta;
                } else {
                    siEsta = false;
                }
                aux = aux.getSiguiente();
            }

        } else {
            return siEsta;
        }
        return siEsta;
    }

    public static void editarRegistroLSC(String cedula, String nombre, String apellidoP, String apellidoM, String correo, String contacto, String tipoHorario, String horarioDisponible) {

        try {

            if (Validaciones.validarCorreo(correo) == false) {
                JOptionPane.showMessageDialog(null, "Error en ingreso de datos, favor revisar correo electronico!");
            } else {
                String pCed = Validaciones.formatoCedula(JOptionPane.showInputDialog("Digite la cedula del estudiante a modificar: "));
                boolean encontrado = false;
                NodoSC aux = inicioSC;

                if (!Rutinas.estaSCVacia()) {

                    if (Validaciones.validarCedula(pCed) == true && Validaciones.validarCorreo(correo)) {

                        aux.getElemento().setNumCedula(cedula);
                        aux.getElemento().setNombre(nombre);
                        aux.getElemento().setApePaterno(apellidoP);
                        aux.getElemento().setApeMaterno(apellidoM);
                        aux.getElemento().setContacto(contacto);
                        aux.getElemento().setCorreo(correo);
                        aux.getElemento().setTipoHorario(tipoHorario);
                        aux.getElemento().setHorario(horarioDisponible);
                        encontrado = true;
                    }
                    aux = aux.getSiguiente();

                    while (aux != null && encontrado != true) {

                        if (aux.getElemento().getNumCedula().equals(pCed)) {

                            if (Validaciones.validarCedula(pCed) == true && Validaciones.validarCorreo(correo)) {

                                aux.getElemento().setNumCedula(cedula);
                                aux.getElemento().setNombre(nombre);
                                aux.getElemento().setApePaterno(apellidoP);
                                aux.getElemento().setApeMaterno(apellidoM);
                                aux.getElemento().setContacto(contacto);
                                aux.getElemento().setCorreo(correo);
                                aux.getElemento().setTipoHorario(tipoHorario);
                                aux.getElemento().setHorario(horarioDisponible);
                                encontrado = true;
                            }
                            aux = aux.getSiguiente();
                        }
                        if (!encontrado) {
                            JOptionPane.showMessageDialog(null, "Dato no encontrado , estudiante consultado no existe");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede mostrar la Lista Circular Simple", "Contenido de la lista vacio", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Revisar correo electrónico, no cumple con formato", "Estado Insercion datos", JOptionPane.WARNING_MESSAGE);
        }

    }

    public static void eliminarRegistroLSC(String cedula) {
        NodoSC aux = inicioSC;
        NodoSC anterior = null;
        boolean encontrado = false;

        if (!Rutinas.estaSCVacia()) {

            while (aux != null && encontrado != true) {

                if (aux.getElemento().getNumCedula().equals(cedula)) {
                    System.out.println("Estudiante encontrado");
                    if (aux == inicioSC) {
                        inicioSC = inicioSC.getSiguiente();
                        finSC.setSiguiente(inicioSC);
                    } else if (aux == finSC) {
                        anterior.setSiguiente(inicioSC);
                        finSC = anterior;
                    } else {
                        anterior.setSiguiente(aux.getSiguiente());
                    }
                    JOptionPane.showMessageDialog(null, "Datos eliminados correctamente!");
                    encontrado = true;
                }
                anterior = aux;
                aux = aux.getSiguiente();
            }
            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "Dato no encontrado , estudiante consultado no existe");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se puede mostrar la lista", "Contenido de la lista vacio", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public static void eliminarLSC(String ced) {
        NodoSC aux = inicioSC;
        NodoSC anterior = null;
        boolean encontrado = false;

        if (!Rutinas.estaSCVacia()) {

            do {
                if (aux.getElemento().getNumCedula().equals(ced)) {
                    if (inicioSC == inicioSC.getSiguiente()) {
                        inicioSC = null;
                    } else if (aux == inicioSC) {
                        inicioSC = inicioSC.getSiguiente();
                        finSC.setSiguiente(inicioSC);
                    } else if (aux == finSC) {
                        anterior.setSiguiente(inicioSC);
                        finSC = anterior;
                    } else {
                        anterior.setSiguiente(aux.getSiguiente());
                    }
                    JOptionPane.showMessageDialog(null, "Datos eliminados correctamente!");
                    encontrado = true;
                }
                anterior = aux;
                aux = aux.getSiguiente();
            } while (aux != inicioSC && encontrado != true);

            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "Dato no encontrado , estudiante consultado no existe");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se puede mostrar la lista", "Contenido de la lista vacio", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    //////////************ Metodos para Lista Doble Circular - Curso Ciencias ************//////////
    public static void insertarLDC(String ced, String nom, String apePA, String apeMa, String contacto, String correo, String horario, String tipoHorario) {
        try {

            if (Validaciones.validarCorreo(correo) == false) {
                JOptionPane.showMessageDialog(null, "Error en ingreso de datos, favor revisar correo electronico!");
            } else if (existeLDC(ced) == true) {
                JOptionPane.showMessageDialog(null, "Error: Estudiante existente en sistema! Favor validar.", "Estado registro Profesores", JOptionPane.ERROR_MESSAGE);
            } else {

                Estudiante e = new Estudiante();
                e.setNumCedula(ced);
                e.setNombre(nom);
                e.setApePaterno(apePA);
                e.setApeMaterno(apeMa);
                e.setContacto(contacto);
                e.setCorreo(correo);
                e.setHorario(horario);
                e.setTipoHorario(tipoHorario);
                NodoDC nuevo = new NodoDC();
                nuevo.setElemento(e);
                if (Rutinas.estaDCVacia()) {
                    inicioDC = nuevo;
                    finDC = nuevo;
                    finDC.setSiguiente(inicioDC);
                    inicioDC.setAnterior(finDC);
                } else if (e.getNumCedula().compareTo(inicioDC.getElemento().getNumCedula()) < 0) {
                    nuevo.setSiguiente(inicioDC);
                    inicioDC = nuevo;
                    finDC.setSiguiente(inicioDC);
                    inicioDC.setAnterior(finDC);
                } else if (e.getNumCedula().compareTo(finDC.getElemento().getNumCedula()) > 0) {
                    finDC.setSiguiente(nuevo);
                    finDC = nuevo;
                    finDC.setSiguiente(inicioDC);
                    inicioDC.setAnterior(finDC);
                } else {
                    NodoDC aux = inicioDC;
                    while (aux.getSiguiente().getElemento().getNumCedula().compareTo(e.getNumCedula()) < 0) {
                        aux = aux.getSiguiente();
                    }
                    nuevo.setSiguiente(aux.getSiguiente());
                    nuevo.setAnterior(aux);
                    aux.setSiguiente(nuevo);
                    nuevo.getSiguiente().setAnterior(nuevo);
                }
                JOptionPane.showMessageDialog(null, "Estudiante: " + e.getNumCedula() + " - " + e.getNombre() + " " + e.getApePaterno() + " " + e.getApeMaterno() + " ha sido agregado a la Lista Doble Circular!");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Revisar correo electrónico, no cumple con formato", "Estado Insercion datos", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static boolean existeLDC(String pCed) {

        boolean siEsta = false;
        NodoDC aux = inicioDC;

        if (!Rutinas.estaDCVacia()) {

            while (aux != inicioDC && siEsta != true) {

                if (aux.getElemento().getNumCedula().equals(pCed)) {
                    siEsta = true;
                    return siEsta;
                } else {
                    siEsta = false;
                }
                aux = aux.getSiguiente();
            }

        } else {
            return siEsta;
        }
        return siEsta;

    }

    public static void editarRegistroLDC(String cedula, String nombre, String apellidoP, String apellidoM, String correo, String contacto, String tipoHorario, String horarioDisponible) {

        try {

            if (Validaciones.validarCorreo(correo) == false) {
                JOptionPane.showMessageDialog(null, "Error en ingreso de datos, favor revisar correo electronico!");
            } else {
                String pCed = Validaciones.formatoCedula(JOptionPane.showInputDialog("Digite la cedula del estudiante a modificar: "));
                boolean encontrado = false;
                NodoDC aux = inicioDC;

                if (!Rutinas.estaDCVacia()) {

                    if (Validaciones.validarCedula(pCed) == true && Validaciones.validarCorreo(correo)) {

                        aux.getElemento().setNumCedula(cedula);
                        aux.getElemento().setNombre(nombre);
                        aux.getElemento().setApePaterno(apellidoP);
                        aux.getElemento().setApeMaterno(apellidoM);
                        aux.getElemento().setContacto(contacto);
                        aux.getElemento().setCorreo(correo);
                        aux.getElemento().setTipoHorario(tipoHorario);
                        aux.getElemento().setHorario(horarioDisponible);
                        encontrado = true;
                    }
                    aux = aux.getSiguiente();

                    while (aux != inicioDC && encontrado != true) {

                        if (aux.getElemento().getNumCedula().equals(pCed)) {

                            if (Validaciones.validarCedula(pCed) == true && Validaciones.validarCorreo(correo)) {

                                aux.getElemento().setNumCedula(cedula);
                                aux.getElemento().setNombre(nombre);
                                aux.getElemento().setApePaterno(apellidoP);
                                aux.getElemento().setApeMaterno(apellidoM);
                                aux.getElemento().setContacto(contacto);
                                aux.getElemento().setCorreo(correo);
                                aux.getElemento().setTipoHorario(tipoHorario);
                                aux.getElemento().setHorario(horarioDisponible);
                                encontrado = true;
                            }
                            aux = aux.getSiguiente();
                        }
                        if (!encontrado) {
                            JOptionPane.showMessageDialog(null, "Dato no encontrado , estudiante consultado no existe");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede mostrar la Lista Circular Simple", "Contenido de la lista vacio", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Revisar correo electrónico, no cumple con formato", "Estado Insercion datos", JOptionPane.WARNING_MESSAGE);
        }

    }

    public static void eliminarRegistroLDC(String ced) {
        boolean encontrado = false;
        NodoDC aux = inicioDC;
        NodoDC anterior = finDC;

        do {

            if (aux.getElemento().getNumCedula().equals(ced)) {
                if (inicioDC == inicioDC.getSiguiente()) {
                    inicioDC = null;
                } else if (aux == inicioDC) {
                    inicioDC = inicioDC.getSiguiente();
                    finDC.setSiguiente(inicioDC);
                    inicioDC.setAnterior(finDC);
                } else if (aux == finDC) {
                    finDC = anterior;
                    inicioDC.setAnterior(finDC);
                    finDC.setSiguiente(inicioDC);
                } else {
                    anterior.setSiguiente(aux.getSiguiente());
                    aux.getSiguiente().setAnterior(anterior);
                }
                JOptionPane.showMessageDialog(null, "Estudiante eliminado", "Estado eliminacion", JOptionPane.INFORMATION_MESSAGE);
                encontrado = true;
            }
            anterior = aux;
            aux = aux.getSiguiente();
        } while (aux != inicioDC && encontrado != true);
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Dato no encontrado , estudiante consultado no existe");
        }

    }

    //////////************ Metodos para Pila - Almacena Horarios - Muestra Horarios ************//////////
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
        System.out.println("Elemento Apilado");
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

    //Colas Matematicas
    public static void encolar(String ced, String nom, String apePA, String apeMa, String contacto, String correo, String horario, String tipoHorario) {

        if (horario.equals("Matutino")) {
            try {

                Estudiante e = new Estudiante();
                e.setNumCedula(ced);
                e.setNombre(nom);
                e.setApePaterno(apePA);
                e.setApeMaterno(apeMa);
                e.setContacto(contacto);
                e.setCorreo(correo);
                e.setHorario(horario);
                e.setTipoHorario(tipoHorario);
                NodoC nuevo = new NodoC();
                nuevo.setElemento(e);
                if (Rutinas.estaColaMatuMatVacia()) {
                    inicioCMatuMat = nuevo;
                    finCMatuMat = nuevo;
                } else {
                    finCMatuMat.setSiguiente(nuevo);
                    finCMatuMat = nuevo;
                }
                JOptionPane.showMessageDialog(null, "Estudiante encolado!");

            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

    public static boolean existeColaMatuMat(String pCed) {
        NodoC aux = inicioCMatuMat;
        boolean encontrado = false;

        if (!Rutinas.estaColaMatuMatVacia()) {

            while (aux != null && encontrado != true) {

                if (aux.getElemento().getNumCedula().equals(pCed)) {
                    encontrado = true;
                    return encontrado;

                }
                aux.getSiguiente();
            }
        }
        return encontrado;
    }

    public static void encolarVesperMat(String ced, String nom, String apePA, String apeMa, String contacto, String correo, String horario, String tipoHorario) {

        if (horario.equals("Vespertino")) {

            try {
                Estudiante e = new Estudiante();
                e.setNumCedula(ced);
                e.setNombre(nom);
                e.setApePaterno(apePA);
                e.setApeMaterno(apeMa);
                e.setContacto(contacto);
                e.setCorreo(correo);
                e.setHorario(horario);
                e.setTipoHorario(tipoHorario);
                NodoC nuevo = new NodoC();
                nuevo.setElemento(e);
                if (Rutinas.estaColaVesperMatVacia()) {
                    inicioCVesMat = nuevo;
                    finCVesMat = nuevo;
                } else {
                    finCVesMat.setSiguiente(nuevo);
                    finCVesMat = nuevo;
                }
                JOptionPane.showMessageDialog(null, "Estudiante encolado!");
            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }

    public static void encolarNocMat(String ced, String nom, String apePA, String apeMa, String contacto, String correo, String horario, String tipoHorario) {

        if (horario.equals("Nocturno")) {
            try {
                Estudiante e = new Estudiante();
                e.setNumCedula(ced);
                e.setNombre(nom);
                e.setApePaterno(apePA);
                e.setApeMaterno(apeMa);
                e.setContacto(contacto);
                e.setCorreo(correo);
                e.setHorario(horario);
                e.setTipoHorario(tipoHorario);
                NodoC nuevo = new NodoC();
                nuevo.setElemento(e);
                if (Rutinas.estaColaNocMatVacia()) {
                    inicioCNocMat = nuevo;
                    finCNocMat = nuevo;
                } else {
                    finCNocMat.setSiguiente(nuevo);
                    finCNocMat = nuevo;
                }
                JOptionPane.showMessageDialog(null, "Estudiante encolado!");
            } catch (Exception e) {
                System.out.println("Revisar encolarNocMat " + e);
            }

        }

    }

    //Colas Estudios Sociales
    public static void encolarMatuES(String ced, String nom, String apePA, String apeMa, String contacto, String correo, String horario, String tipoHorario) {

        if (horario.equals("Matutino")) {
            try {

                Estudiante e = new Estudiante();
                e.setNumCedula(ced);
                e.setNombre(nom);
                e.setApePaterno(apePA);
                e.setApeMaterno(apeMa);
                e.setContacto(contacto);
                e.setCorreo(correo);
                e.setHorario(horario);
                e.setTipoHorario(tipoHorario);
                NodoC nuevo = new NodoC();
                nuevo.setElemento(e);
                if (Rutinas.estaColaMatuESVacia()) {
                    inicioCMatuES = nuevo;
                    finCMatuES = nuevo;
                } else {
                    finCMatuES.setSiguiente(nuevo);
                    finCMatuES = nuevo;
                }

            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

    public static void encolarVespES(String ced, String nom, String apePA, String apeMa, String contacto, String correo, String horario, String tipoHorario) {

        if (horario.equals("Vespertino")) {
            try {

                Estudiante e = new Estudiante();
                e.setNumCedula(ced);
                e.setNombre(nom);
                e.setApePaterno(apePA);
                e.setApeMaterno(apeMa);
                e.setContacto(contacto);
                e.setCorreo(correo);
                e.setHorario(horario);
                e.setTipoHorario(tipoHorario);
                NodoC nuevo = new NodoC();
                nuevo.setElemento(e);
                if (Rutinas.estaColaVesperESVacia()) {
                    inicioCVesperES = nuevo;
                    finCVesperES = nuevo;
                } else {
                    finCVesperES.setSiguiente(nuevo);
                    finCVesperES = nuevo;
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

    public static void encolarNocES(String ced, String nom, String apePA, String apeMa, String contacto, String correo, String horario, String tipoHorario) {

        if (horario.equals("Nocturno")) {
            try {

                Estudiante e = new Estudiante();
                e.setNumCedula(ced);
                e.setNombre(nom);
                e.setApePaterno(apePA);
                e.setApeMaterno(apeMa);
                e.setContacto(contacto);
                e.setCorreo(correo);
                e.setHorario(horario);
                e.setTipoHorario(tipoHorario);
                NodoC nuevo = new NodoC();
                nuevo.setElemento(e);
                if (Rutinas.estaColaNocESVacia()) {
                    inicioCNocES = nuevo;
                    finCNocES = nuevo;
                } else {
                    finCNocES.setSiguiente(nuevo);
                    finCNocES = nuevo;
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

    //Colas Espanol
    public static void encolarMatuE(String ced, String nom, String apePA, String apeMa, String contacto, String correo, String horario, String tipoHorario) {

        if (horario.equals("Matutino")) {
            try {

                Estudiante e = new Estudiante();
                e.setNumCedula(ced);
                e.setNombre(nom);
                e.setApePaterno(apePA);
                e.setApeMaterno(apeMa);
                e.setContacto(contacto);
                e.setCorreo(correo);
                e.setHorario(horario);
                e.setTipoHorario(tipoHorario);
                NodoC nuevo = new NodoC();
                nuevo.setElemento(e);
                if (Rutinas.estaColaMatuEVacia()) {
                    inicioCMatuE = nuevo;
                    finCMatuE = nuevo;
                } else {
                    finCMatuE.setSiguiente(nuevo);
                    finCMatuE = nuevo;
                }

            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }

    public static void encolarVespE(String ced, String nom, String apePA, String apeMa, String contacto, String correo, String horario, String tipoHorario) {

        if (horario.equals("Vespertino")) {
            try {

                Estudiante e = new Estudiante();
                e.setNumCedula(ced);
                e.setNombre(nom);
                e.setApePaterno(apePA);
                e.setApeMaterno(apeMa);
                e.setContacto(contacto);
                e.setCorreo(correo);
                e.setHorario(horario);
                e.setTipoHorario(tipoHorario);
                NodoC nuevo = new NodoC();
                nuevo.setElemento(e);
                if (Rutinas.estaColaVesperEVacia()) {
                    inicioCVesperE = nuevo;
                    finCVesperE = nuevo;
                } else {
                    finCVesperE.setSiguiente(nuevo);
                    finCVesperE = nuevo;
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

    public static void encolarNocE(String ced, String nom, String apePA, String apeMa, String contacto, String correo, String horario, String tipoHorario) {
        if (horario.equals("Nocturno")) {
            try {

                Estudiante e = new Estudiante();
                e.setNumCedula(ced);
                e.setNombre(nom);
                e.setApePaterno(apePA);
                e.setApeMaterno(apeMa);
                e.setContacto(contacto);
                e.setCorreo(correo);
                e.setHorario(horario);
                e.setTipoHorario(tipoHorario);
                NodoC nuevo = new NodoC();
                nuevo.setElemento(e);
                if (Rutinas.estaColaNocEVacia()) {
                    inicioCNocE = nuevo;
                    finCNocE = nuevo;
                } else {
                    finCNocE.setSiguiente(nuevo);
                    finCNocE = nuevo;
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

    // Colas Ciencias
    public static void encolarMatuC(String ced, String nom, String apePA, String apeMa, String contacto, String correo, String horario, String tipoHorario) {

        if (horario.equals("Matutino")) {
            try {

                Estudiante e = new Estudiante();
                e.setNumCedula(ced);
                e.setNombre(nom);
                e.setApePaterno(apePA);
                e.setApeMaterno(apeMa);
                e.setContacto(contacto);
                e.setCorreo(correo);
                e.setHorario(horario);
                e.setTipoHorario(tipoHorario);
                NodoC nuevo = new NodoC();
                nuevo.setElemento(e);
                if (Rutinas.estaColaMatuCVacia()) {
                    inicioCMatuC = nuevo;
                    finCMatuC = nuevo;
                } else {
                    finCMatuC.setSiguiente(nuevo);
                    finCMatuC = nuevo;
                }

            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

    public static void encolarVespeC(String ced, String nom, String apePA, String apeMa, String contacto, String correo, String horario, String tipoHorario) {
        
        if (horario.equals("Vespertino")) {
            try {

                Estudiante e = new Estudiante();
                e.setNumCedula(ced);
                e.setNombre(nom);
                e.setApePaterno(apePA);
                e.setApeMaterno(apeMa);
                e.setContacto(contacto);
                e.setCorreo(correo);
                e.setHorario(horario);
                e.setTipoHorario(tipoHorario);
                NodoC nuevo = new NodoC();
                nuevo.setElemento(e);
                if (Rutinas.estaColaVesperCVacia()) {
                    inicioCVesperC = nuevo;
                    finCVesperC = nuevo;
                } else {
                    finCVesperC.setSiguiente(nuevo);
                    finCVesperC = nuevo;
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

    public static void encolarNoC(String ced, String nom, String apePA, String apeMa, String contacto, String correo, String horario, String tipoHorario) {
        
        if (horario.equals("Nocturno")) {
            try {

                Estudiante e = new Estudiante();
                e.setNumCedula(ced);
                e.setNombre(nom);
                e.setApePaterno(apePA);
                e.setApeMaterno(apeMa);
                e.setContacto(contacto);
                e.setCorreo(correo);
                e.setHorario(horario);
                e.setTipoHorario(tipoHorario);
                NodoC nuevo = new NodoC();
                nuevo.setElemento(e);
                if (Rutinas.estaColaNoCVacia()) {
                    inicioCNoC = nuevo;
                    finCNoC = nuevo;
                } else {
                    finCNoC.setSiguiente(nuevo);
                    finCNoC = nuevo;
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }
}
