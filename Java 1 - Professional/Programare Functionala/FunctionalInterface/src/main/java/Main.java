import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        /*
        MyLogger logger = new MyLogger();
        logger.print("The first test");
         */

        //Nu primește nici un parametru și are rolul de a genera o valoar
        Supplier <Double> randomNumber = () -> Math.random() * 100;
        System.out.println("Random number " + randomNumber.get());



    }
}
