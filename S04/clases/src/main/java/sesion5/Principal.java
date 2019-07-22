package sesion5;

public class Principal {
    public static void main(String[] args) {
        Bonito n = new Perro();
        n.viajar();
        System.out.println(Especialidad.SISTEMAS.getNombre());
    }
}
//Enumeracion: Coleccion de objetos constantes