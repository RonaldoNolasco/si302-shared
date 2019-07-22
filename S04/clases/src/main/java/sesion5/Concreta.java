package sesion5;

public class Concreta extends Abstracta{
    public static void main(String[] args) {
        //Abstracta a = new Abstracta(); Una clase abstracta no se puede instanciar
        Concreta c = new Concreta();
        Abstracta a = new Concreta();
        a.respirar();
    }
    public void respirar() {
        System.out.println("Metodo");

    }
}
