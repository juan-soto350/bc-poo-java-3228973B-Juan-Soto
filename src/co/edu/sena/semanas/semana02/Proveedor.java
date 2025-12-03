package co.edu.sena.semanas.semana02;
public class Proveedor {
    private String nombre;
    private String contacto;
    private String paisOrigen;

    public Proveedor(String nombre, String contacto, String paisOrigen) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.paisOrigen = paisOrigen;
    }

    public String obtenerInfo() {
        return nombre + " - " + paisOrigen + " (Contacto: " + contacto + ")";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
}
