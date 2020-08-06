package Modelo;

public class Persona {
    private int idpersona;
    private String nombre;
    private String apellido;
    private String compañia;
    private String ciudad;

    public Persona() {
    }

    public Persona(int idpersona, String nombre, String apellido, String compañia, String ciudad) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.compañia = compañia;
        this.ciudad = ciudad;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
}
