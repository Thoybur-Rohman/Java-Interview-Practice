import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

       /*-------------------------------------------------------------------------------------*/
        // Create a stream - stream.of to create an array
        Stream<String> shoppingStream = Stream.of("apples",
                "bananas", "cherries", "coffee");
        // Create a stream from other collection types
        // -------------------------------------------

        // Array - Arrays.stream to convert the array to a stream
        String[] shoppingArray = new String[]{"apples",
                "bananas", "cherries", "coffee"};
        Stream<String> shopArrayStream = Arrays.stream(shoppingArray);

        // Lists - .stream() returns a stream
        List<String> shoppingList = List.of("apples",
                "bananas", "cherries", "coffee");
        Stream<String> shoppingListStream = shoppingList.stream();

        // For loop in one line
        shoppingList.stream().forEach(System.out::println);
        shoppingList.parallelStream().forEach(System.out::println);

        // Match - to check if its in the list
        boolean isOnList = shoppingList.stream().anyMatch(item -> item.contains("apples"));

        // Filter - to go through itesm and fin the item starting with c
        Stream<String> itemsInAisle = shoppingList.stream().filter(item -> item.startsWith("c"));

        // Map -
        List<Integer> numbersList = List.of(4, 2, 6, 9, 10, 17, 3);
        Stream<Integer> doubledStream = numbersList.stream().map(n -> n*n);

        // Collect
        List<Integer> doubledList = numbersList.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        // stream api to learn new java features 
    }
}
