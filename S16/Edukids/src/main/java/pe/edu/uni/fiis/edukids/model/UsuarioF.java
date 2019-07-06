package pe.edu.uni.fiis.edukids.model;

public class UsuarioF {
    private String nombres;
    private String apellidos;
    private String nacimiento;
    private String genero;
    private String profesion;

    public String getNombres() {

        return nombres;
    }

    public void setNombres(String nombres) {

        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
}
