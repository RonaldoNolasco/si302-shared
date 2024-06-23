package paquete2;

import paquete1.A;

class B extends A{
    public static String nombre;
    public String apellido;
    static{
        nombre="Ronaldo";
        System.out.println("Estatico");
    }
    {
        apellido="Nolasco";
        System.out.println("No estatico");
        nombre="Ronaldo";
    }
    public static void main(String[] args) {
        paquete1.B objeto=new paquete1.B();
        B a=new B();
        a.edad=20;
        B z=new B();
        //nombre = "as";
        System.out.println(nombre);
        System.out.println(a.apellido);



    }
}
