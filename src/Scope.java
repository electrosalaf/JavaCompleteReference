/**
 * To demonstate block scope...
 * code within a block (that is, a nested scope) has access to
 * variables declared by an enclosing scope.
 */
public class Scope {
    public static void main(String[] args) {
        int x = 10;
        if (x == 10)    {   //  start a new scope here
            int y = 20; //  only known to this block

            //  x and y both known here.
            System.out.println("x and y: " + x + " " + y );
            x = y * 2;
        }

        /**
         *  y = 100;    //  Error! y not known here
         *  x is still known here, note that x can be accessed from inside
         *  this scope since it's declared inside the main function as a global variable...
         *
         */


        //
        System.out.println("x is " + x);
    }
}
