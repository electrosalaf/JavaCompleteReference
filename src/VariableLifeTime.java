public class VariableLifeTime {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 3; x++) {
            int y = -1; //  y is initialized each time the is entered
            System.out.println("y is :" + y);   //  This always print -1
            y = 100;
            System.out.println("y is now :" + y);
        }


    }

}