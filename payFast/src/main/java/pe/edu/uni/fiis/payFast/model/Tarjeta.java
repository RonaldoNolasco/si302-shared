package pe.edu.uni.fiis.payFast.model;

public class Tarjeta {

    private String nombre;
    private String apellido;
    private String numTarjeta;
    private String cvv;
    private String fechaExp;

    public Tarjeta(String nombre, String apellido, String numTarjeta, String cvv, String fechaExp) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numTarjeta = numTarjeta;
        this.cvv = cvv;
        this.fechaExp = fechaExp;
    }
}
