package pe.edu.uni.fiis.payFast.model;

public class Usuario {
    private String nombres;
    private String idUsuario;
    private String contra;
    private String sexo;
    private String numTarjeta;
    private String region;
    private String provincia;
    private String distrito;
    private String correo;
    private String telefono;

    public Usuario(String nombres, String idUsuario,String contra, String sexo, String region, String provincia, String distrito, String correo, String numTarjeta, String telefono) {
        this.nombres = nombres;
        this.idUsuario = idUsuario;
        this.contra = contra;
        this.sexo = sexo;
        this.region = region;
        this.provincia = provincia;
        this.distrito = distrito;
        this.correo = correo;
        this.numTarjeta = numTarjeta;
        this.telefono = telefono;
    }

    public String getNombres() {
        return nombres;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public String getContra() {
        return contra;
    }

    public String getSexo() {
        return sexo;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public String getRegion() {
        return region;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getDistrito() {
        return distrito;
    }

    public String getTelefono() {
        return telefono;
    }
}