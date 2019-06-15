package pe.edu.uni.fiis.edukid.model;

public class Usuario {
    private String codigo;
    private String nombre;
    private String credencial;
    private String correo;

    public Usuario(String codigo, String nombre, String credencial, String correo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.credencial = credencial;
        this.correo = correo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCredencial() {
        return credencial;
    }

    public void setCredencial(String credencial) {
        this.credencial = credencial;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}