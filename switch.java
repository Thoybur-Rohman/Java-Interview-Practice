public class Main {

    public static void main(String[] args) {
      
      //Tridtional way to use a switch statement       
        int stage = 2;
        String season;
        switch(stage) {
            case 0:
                season = "Spring";
                break;
            case 1:
                season = "Summer";
                break;
            case 2:
                season = "Fall";
                break;
            case 3:
                season = "Winter";
                break;
            default:
                season = "Invalid stage";
        }

        System.out.println(season);
      /*--------------------------------------------------------------------------*/
        enum Season {
        Spring, Summer, Fall, Winter}
        Season season = Season.Spring;

        String weather = switch(season) {
            case Spring, Summer -> "Sunny";
            case Fall -> "Rainy";
            case Winter -> "Snowy";
            default -> {
                System.out.println("Invalid season");
                yield "Invalid weather";
            }
        };

        System.out.println(weather);
    }
}
