import java.util.Arrays;

public class  Main {

    public static void main(String[] args) {
        String text = "Computer science is a subject that has become significant to me, due to it" +
                "acting as a catalyst for development and understanding " +
                "in this postmodern society. I have an innate curiosity for the science behind the " +
                "subject which has led to many remarkable discoveries " +
                "and innovations. My interest was piqued at Brunel University, where I was able to fully " +
                "communicate my passion for the rare complexity" +
                "of the Computer Science field alongside a community that appreciated its full value. I am " +
                "strong-willed and strive to make my initial " +
                "plans and prototypes a success" +
                " regardless of the obstacles that stand in the way. " +
                "This will facilitate me in becoming successful in this career.";


        // This checks for sentances using a full stop
        String[] sentences = text.split("\\. ");

        System.out.println("The text has " + sentences.length + " sentences.");

        // This checks for space or a dash
        String[] words = text.split(" |-");
        System.out.println("The text has " + words.length + " words.");

        System.out.println(Arrays.asList(words));
        // This is chceking for length 
        System.out.println("The text has " + text.length() + " characters.");
