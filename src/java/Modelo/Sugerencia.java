package Modelo;

public class Sugerencia {
    private int idsugerencia;
    private String asunto;
    private String descripcion;
    private int fecharecepcion;
    private int idpersona;

    public Sugerencia() {
    }

    public Sugerencia(int idsugerencia, String asunto, String descripcion, int fecharecepcion, int idpersona) {
        this.idsugerencia = idsugerencia;
        this.asunto = asunto;
        this.descripcion = descripcion;
        this.fecharecepcion = fecharecepcion;
        this.idpersona = idpersona;
    }

    public int getIdsugerencia() {
        return idsugerencia;
    }

    public void setIdsugerencia(int idsugerencia) {
        this.idsugerencia = idsugerencia;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFecharecepcion() {
        return fecharecepcion;
    }

    public void setFecharecepcion(int fecharecepcion) {
        this.fecharecepcion = fecharecepcion;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }
    
    
    
  
}
