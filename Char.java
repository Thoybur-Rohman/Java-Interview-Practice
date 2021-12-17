public class Main {

    public static void main(String[] args) {
        // 0 1 2 3 4 5 6
        // T H O Y B U R
        String thoy = "Thoybur";

        char firstCharacter = thoy.charAt(0);
        System.out.println(firstCharacter);

        System.out.println(thoy.indexOf('e'));

        String sub = thoy.substring(2, 4);
        System.out.println(sub);

        System.out.println(thoy.contains("Thoy"));

        char[] ThoyArray = thoy.toCharArray();
        int index = 4;
        System.out.println(ThoyArray[4]);
    }
}
