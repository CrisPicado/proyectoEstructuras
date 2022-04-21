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

    public static NodoC inicioC;
    public static NodoC finC;

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

        this.inicioC = null;
        this.finC = null;
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

    public static boolean estaColaVacia() {
        if (inicioC == null) {
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
            //System.out.println("Revisar insertarLS" + e);
            JOptionPane.showMessageDialog(null, "Revisar correo electrónico, no cumple con formato", "Estado Insercion datos", JOptionPane.WARNING_MESSAGE);
        }

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
                NodoSC nuevo = new NodoSC();
                nuevo.setElemento(e);
                if (Rutinas.estaSCVacia()) {
                    inicioSC = nuevo;
                    finSC = nuevo;
                    inicioSC.setSiguiente(inicioSC);
                } else if (e.getNumCedula().compareTo(inicioSC.getElemento().getNumCedula()) < 0) {
                    nuevo.setSiguiente(inicioSC);
                    inicioSC = nuevo;
                    finSC.setSiguiente(inicioSC);
                } else if (e.getNumCedula().compareTo(finSC.getElemento().getNumCedula()) > 0) {
                    finSC.setSiguiente(nuevo);
                    nuevo.setSiguiente(inicioSC);
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
                        System.out.println(" si");
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

    public static void encolar(String ced, String nom, String apePA, String apeMa, String contacto, String correo, String horario, String tipoHorario) {
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
        if (Rutinas.estaColaVacia()) {
            inicioC = nuevo;
            finC = nuevo;
        } else {
            finC.setSiguiente(nuevo);
            finC = nuevo;
        }
        JOptionPane.showMessageDialog(null, "Estudiante encolado!");
    }
    
    public static void mostrarCola(){
        
        
        if (!Rutinas.estaColaVacia()) {
            NodoC aux = inicioC;
            String s = "";
            while (aux != null) {
                s = s + aux.getElemento().getNumCedula() + " -- " + aux.getElemento().getNombre() + " -- "
                        + aux.getElemento().getApePaterno() + " -- "+aux.getElemento().getApeMaterno() + " -- "
                        +aux.getElemento().getTipoHorario() + " -- "+aux.getElemento().getHorario() +"-->";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La cola contiene:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "No se puede mostrar. Cola vacía!");
        }
    }

    
    
    
}
