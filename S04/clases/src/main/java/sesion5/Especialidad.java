package sesion5;

public enum Especialidad {
    SISTEMAS("Ingeniería de Sistemas","I2",100),
    INDUSTRIAL("Ingeniería Industrial","I1",3000);
    private String nombre;
    private String codigo;
    private Integer cantAlumnos;

    Especialidad(String nombre, String codigo, Integer cantAlumnos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantAlumnos = cantAlumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public Integer getCantAlumnos() {
        return cantAlumnos;
    }
}
