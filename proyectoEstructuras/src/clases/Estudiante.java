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
public class Estudiante {

    private String numCedula;
    private String nombre;
    private String apePaterno;
    private String apeMaterno;
    private String contacto;
    private String correo;
    private String mail;
    private String tipoHorario;
    private String Horario;

    public Estudiante() {
        this.numCedula = "";
        this.nombre = "";
        this.apeMaterno = "";
        this.apePaterno = "";
        this.contacto = "";
        this.mail = "";
        this.tipoHorario = "";
        this.Horario = "";
    }

    /**
     * @return the apeMaterno
     */
    public String getApeMaterno() {
        return apeMaterno;
    }

    /**
     * @return the apePaterno
     */
    public String getApePaterno() {
        return apePaterno;
    }

    /**
     * @return the contacto
     */
    public String getContacto() {
        return contacto;
    }

    /**
     * @return the Horario
     */
    public String getHorario() {
        return Horario;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the numCedula
     */
    public String getNumCedula() {
        return numCedula;
    }

    /**
     * @return the tipoHorario
     */
    public String getTipoHorario() {
        return tipoHorario;
    }

    /**
     * @param apeMaterno the apeMaterno to set
     */
    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    /**
     * @param apePaterno the apePaterno to set
     */
    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    /**
     * @param contacto the contacto to set
     */
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    /**
     * @param Horario the Horario to set
     */
    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param numCedula the numCedula to set
     */
    public void setNumCedula(String numCedula) {
        this.numCedula = numCedula;
    }

    /**
     * @param tipoHorario the tipoHorario to set
     */
    public void setTipoHorario(String tipoHorario) {
        this.tipoHorario = tipoHorario;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
