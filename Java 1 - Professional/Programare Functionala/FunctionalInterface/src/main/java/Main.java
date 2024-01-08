import java.util.ArrayList;
import java.util.List;
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

        //Scopul acestuia este de a consuma inputul.
        Consumer<String> display = System.out::println;
        display.accept("Hello word!");

        Consumer<List<Integer>> modify = list -> {
            for (int i = 0; i < list.size(); i++)
                list.set(i, 2 * list.get(i));
        };
        Consumer<List<Integer>> printList = list -> list
                .forEach(System.out::println);

        List <Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(1);
        myList.add(3);

        //modify.accept(myList);
        //printList.accept(myList);
        //myList.forEach( e-> System.out.print(e + " "));

        try{
            modify.andThen(null).accept(myList);
        }
        catch (Exception e){
            System.out.println("Exception -> " + e);
        }

        BiConsumer<Integer, Integer> sumNumber = (x,y) -> System.out.println(x + y);
        sumNumber.accept(1, 2);

        Function<String, Integer > nrOfCharascters = String::length;
        System.out.println(nrOfCharascters.apply("text for function"));

        BiFunction<String, String, Integer> nrOfCharasctersBi = (e1,e2) -> e1.length() + e2.length();
        System.out.println(nrOfCharasctersBi.apply("text1 for BiFunction","text1 for BiFunction"));

        //Să se scrie o instanță de Function<String, Integer> care ia ca parametru un String ce reprezintă un număr și întoarce pătratul acestuia. De exemplu, inputul va fi "9", iar rezultatul va fi 81

        Function<String, Integer > powerNumber = e ->  Integer.parseInt(e) * Integer.parseInt(e);
        System.out.println(powerNumber.apply("9"));
    }
}
