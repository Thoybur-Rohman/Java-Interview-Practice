public class Main {

    public static void main(String[] args) {
        String literalA = "abc";
        String literalB = "abc";
        String literalC = "c";

        String objectA = new String("abc");
        String objectB = new String("abc");
        String objectC = new String("c");

        //checks the true value of strings
        System.out.println(literalA.equals(objectA));
        System.out.println(literalA.equals(objectB));
        System.out.println(literalA.equals(literalB));


        //chekinf for the true value of strings
        System.out.println(literalA.equals(literalC));
        System.out.println(literalA.equals(objectC));
    }
}
