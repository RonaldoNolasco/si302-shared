package sesion5;

public interface Bonito {
    public abstract Byte[] fotografiar(String a);
    default void viajar(){
        System.out.println("Estoy volando");
    }

}
