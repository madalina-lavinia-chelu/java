@FunctionalInterface
public interface Logger {

    //metoda abstracta / SAM
    void print(String input);

    default void metodaDefault(String input){
        System.out.println("metoda default");
    }

    static void metodaStatica(String input){
        System.out.println("metoda statica");
    }



}
