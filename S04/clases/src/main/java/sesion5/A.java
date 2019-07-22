package sesion5;

public class A {
    private String apellido;
    private Integer edad;
    public A(){
        System.out.println("Constructor por defecto A");
    }
    public A(String apellido){
        this.apellido=apellido;
        System.out.println("Constructor con un argumento");
    }
    public static void main(String[] args) {

    }
    public void pintar(){
        System.out.println("Aprendiendo a pintar");
    }
}
