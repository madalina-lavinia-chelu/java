public class MyLogger implements Logger {

    @Override
    public void print(String input){
        System.out.println("Metoda abstracta: " + input);
    }
}
