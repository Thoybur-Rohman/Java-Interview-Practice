import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Thoy");
        students.add("Ali");
        students.add("Hasib");
        students.add("James");

        // Consumer
        Consumer<String> printItem = n -> System.out.println(n);
        students.forEach(printItem);

        // Function - will take an input of an integer and return an int
        Function<Integer, Integer> doubly = n -> n * n;
        System.out.println(doubly.apply(8));

        // Predicate - returns true or false will take input and show and output 
        IntPredicate isDivByThree = n -> n % 3 == 0;
        System.out.println(isDivByThree.test(3));

        // Supplier - takes no input but produces and output
        Supplier<Double> randomNumUnder100 = () -> Math.random() * 100;
        System.out.println(randomNumUnder100.get());
        
        //lambda functions mainly used in lists 
    }
}
