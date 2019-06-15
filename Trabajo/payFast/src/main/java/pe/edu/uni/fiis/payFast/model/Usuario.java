package pe.edu.uni.fiis.payFast.model;

public class Usuario {
    private String nombre;
    private String usuario;
    private String credencial;
    private String sexo;
    private String tarjeta;
    private String region;
    private String provincia;
    private String distrito;
    private String correo;
    private String telefono;

    public Usuario(String nombre, String usuario, String credencial, String sexo, String tarjeta, String region, String provincia, String distrito, String correo, String telefono) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.credencial = credencial;
        this.sexo = sexo;
        this.tarjeta = tarjeta;
        this.region = region;
        this.provincia = provincia;
        this.distrito = distrito;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCredencial() {
        return credencial;
    }

    public void setCredencial(String credencial) {
        this.credencial = credencial;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}