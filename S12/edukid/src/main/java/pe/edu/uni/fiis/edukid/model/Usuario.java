package pe.edu.uni.fiis.edukid.model;

public class Usuario {
    private String nombre;
    private String codigo;
    private String correo;
    private String credencial;

    public Usuario(String nombre, String codigo, String correo, String credencial) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.correo = correo;
        this.credencial = credencial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCredencial() {
        return credencial;
    }

    public void setCredencial(String credencial) {
        this.credencial = credencial;
    }
}