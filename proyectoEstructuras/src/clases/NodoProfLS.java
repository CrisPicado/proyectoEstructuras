package clases;

public class NodoProfLS {

    private Profesores elemento;
    private NodoProfLS siguiente;

    public NodoProfLS() {
        this.siguiente = null;
    }

    public Profesores getElemento() {
        return elemento;
    }

    public void setElemento(Profesores elemento) {
        this.elemento = elemento;
    }

    public NodoProfLS getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoProfLS siguiente) {
        this.siguiente = siguiente;
    }
}
