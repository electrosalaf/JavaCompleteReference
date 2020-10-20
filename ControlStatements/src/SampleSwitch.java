class SampleSwitch {
    public static void main(String[] args) {
                for (int i=0; i<6; i++) {
                    switch (i)  {
                case 0:
                    System.out.println("i is zero.");
                    break;
                case 1:
                    System.out.println("i is one.");
                    break;
                case 2:
                    System.out.println("i is two.");
                    break;
                case 3:
                    System.out.println("i is three.");
                    break;
                default:
                    System.out.println("i is greater than 3.");
            }
        }
    }
}

/**
 *  In a switch, break statements are optional...
 */

class MissingBreak{
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++)
            switch (i) {
                case 0:
                case 1:
                case 3:
                case 4:
                    System.out.println("i is less than 5");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i is less than 10");
                    break;
                default:
                    System.out.println("i is 10 or more");
        }
    }
}

/**
 *  An improved version of the IfElse season program, using the switch statement..
 */

//  An improved version of the season program...
class Switch{
    public static void main(String[] args) {
        int month = 4;  //  April
        String season;

        switch (month){
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;

            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;

            case 6:
            case 7:
            case 8:
                season= "Summer";
                break;

            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;

            default:
                season = "Bogus Month";
        }
        System.out.println("April is in the " + season);
    }
}


/**
 *  USING STRING TO CONTROL THE SWITCH STATEMENT...
 */
class StringSwitch{
    public static void main(String[] args) {

        String str = "two";

        switch (str){
            case "one":
                System.out.println("one");
                break;

            case "two":
                System.out.println("two");
                break;

            case "three":
                System.out.println("three");
                break;

            default:
                System.out.println("no match");
                break;
        }
    }
}