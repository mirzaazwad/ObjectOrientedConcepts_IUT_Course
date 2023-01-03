package Lab09.ResultPublication;

public interface RandomInterface {
    void method();
    default void something(){
        System.out.println("Hello World");
    }
}
