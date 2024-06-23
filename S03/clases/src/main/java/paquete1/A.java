package paquete1;

public class A {
    protected Integer edad;
    public String nombre;
    private Integer talla;
    public static void main(String[] args) {
        B ejemplo =new B();
    }

    public Integer getTalla() {
        return talla;
    }

    public void setTalla(Integer talla) {
        this.talla = talla;
    }
}