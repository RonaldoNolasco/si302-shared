package pe.edu.uni.fiis.matricula.model;

public class Seccion {
    private String letra;
    private Integer vacantesDisponibles;
    private Integer vacantesTotales;
    private String ubicacion;
    private String estado;
    private Curso curso;

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public Integer getVacantesDisponibles() {
        return vacantesDisponibles;
    }

    public void setVacantesDisponibles(Integer vacantesDisponibles) {
        this.vacantesDisponibles = vacantesDisponibles;
    }

    public Integer getVacantesTotales() {
        return vacantesTotales;
    }

    public void setVacantesTotales(Integer vacantesTotales) {
        this.vacantesTotales = vacantesTotales;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
