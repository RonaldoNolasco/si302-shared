package sesion5;

public class B extends A {
    private String nombre;
    private Integer tamano;
    public B(){
        super("Nolasco");
    }
    public B(String nombre){
        this.nombre=nombre;
    }
    public static void main(String[] args) {
        B s = new B();
        B s2 = new B("Ronaldo");
        System.out.println(s.nombre);
        System.out.println(s2.nombre);
        s2.agregar("1");
        s2.agregar("1","2");
        s2.agregar("1","2","3");
        s2.agregar();
        s2.pintar();
        A a = new A();
        a.pintar();
        A nuevo=s2;
        nuevo.pintar();
    }
    public void agregar(String a){
        System.out.println(a);
        System.out.println("Un parametro");
    }
    public void agregar(String a,String b){
        System.out.println(a);
        System.out.println(b);
    }
    public void agregar(Integer a){
        System.out.println(a);
    }
    public void agregar(String... a){
        //System.out.println(a[0]);
        System.out.println("Argumentos variables");
    }
    public void pintar(){
        System.out.println("Aprendi a bailar en salsuni, sin pareja");
    }
}
//Minima prioridad, ultimo argumento o parametro, solo puede haber uno de este tipo en un metodo