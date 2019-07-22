package pe.edu.uni.fiis.edukid.model;

public class Usuario {
    private String codigo_usuario;
     private String nombre ;
    private String  credencial;
    private String correo;

    public Usuario(String codigo_usuario, String nombre, String credencial, String correo) {
        this.codigo_usuario = codigo_usuario;
        this.nombre = nombre;
        this.credencial = credencial;
        this.correo = correo;
    }

    public String getCodigo_usuario() {
        return codigo_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCredencial() {
        return credencial;
    }

    public String getCorreo() {
        return correo;
    }
}
