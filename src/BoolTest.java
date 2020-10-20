/**
 *  The boolean value can control an if statement as done in line 14 and 17.
 *  The output of a relational operator is a boolean as done in line 20.
 *  Also the value of boolean expression is enough to drive an if statement,
 *  Avoid writing if (b == true), instead write if (b)>>
 */


public class BoolTest {
    public static void main(String[] args) {
        boolean b = false;

        System.out.println("b is " + b);
        b = true;
        System.out.println("b is now " + b);

        if(b) System.out.println("This is executed.");

        b = false;
        if (b) System.out.println("This is not executed.");

        System.out.println("10 > 9 is " + (10 > 9));

    }
}
