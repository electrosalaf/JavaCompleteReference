import java.io.IOException;

class whileIteration {
    public static void main(String[] args){
        int n = 10;

        while (n>0){
            System.out.println("tick " + n);
            n--;
        }
    }
}


/**
 *  The body of a while statement can be empty in Java..
 */

class NoBody{
    public static void main(String[] args) {
         int i = 100;
         int j = 200;

         // find the midpoint between i & j...
        while (++i < --j);  //  there is no body in this loop...

        System.out.println("Midpoint is: " + i);
    }
}

/**
 *  The do-while loop always executes its body at least once,
 * because its conditional expression is at the bottom of the loop.
 */

class DoWhile{
    public static void main(String[] args) {
        int n = 10;

        do {
            System.out.println("tick " + n);
        }   while (--n>0);   // Technically more efficient...
    }
}

/**
 * Using the do-while loop to process menu selection...
 * The do-while loop is useful for processing a menu selection, because we will
 * usually want the body of a menu loop to execute at least once.
 */
class Menu  {
    public static void main(String args[])
            throws java.io.IOException  {
            char choice;

            do {
                System.out.println("Help on: ");
                System.out.println("    1.  if");
                System.out.println("    2.  switch");
                System.out.println("    3.  while");
                System.out.println("    4.  do-while");
                System.out.println("    5.  for\n");
                System.out.println("Choose one: \n");

                choice = (char) System.in.read();
            }   while ( choice < '1' || choice > '5');

            System.out.print("\n");

            switch (choice) {
                case '1':
                    System.out.println("The if:\n");
                    System.out.println("if (condition) statement;");
                    System.out.println("else statement;");
                    break;

                case '2':
                    System.out.println("The switch:\n");
                    System.out.println("switch (expression) {");
                    System.out.println("    case constant:");
                    System.out.println("    statement sequence");
                    System.out.println("    break;");
                    System.out.println("    //...");
                    System.out.println("}");
                    break;

                case '3':
                    System.out.println("The while:\n");
                    System.out.println("while(condition) statement;");
                    break;

                case '4':
                    System.out.print("The do-while:\n");
                    System.out.println("do  {");
                    System.out.println("    statement;");
                    System.out.println("}  while  (condition);");
                    break;

                case '5':
                    System.out.println("The for: \n");
                    System.out.println("for(init; condition; iteration)");
                    System.out.println("statement;");
                    break;
            }
    }
}

//  Demonstrate for loop...
class ForTick{
    public static void main(String[] args) {
        int n;

        for (n=10; n>0; n--)
            System.out.println("tick " + n);

        //  Declaring loop control varible inside the for loop..
        //for (int n=10; n>0; n--)
    }
}

//  Test for primes...
class FindPrime{
    public static void main(String[] args)
    throws java.io.IOException  {

        System.out.println("Enter a prime number: ");
        int num = System.in.read();
        boolean isPrime;


        if (num < 2) isPrime = false;
        else isPrime = true;

        for (int i=2; i<=num/i; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) System.out.println("Prime.");
        else System.out.println("Not prime.");
    }
}

//  including more than one statement in the initialization and iteration portions of the for loop

class Sample{
    public static void main(String[] args) {
        int a, b;

        b = 4;
       for (a=1; a<b; a++) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            b--;
        }
    }
}

//  Using the comma
class Comma {
    public static void main(String[] args) {
        int a, b;

        for (a=1, b=4; a<b; a++, b--) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}

//  Parts of the for loop can be empty..
class ForVar{
    public static void main(String[] args) {
        int i;
        boolean done = false;

        i = 0;
        for (; !done; ) {
            System.out.println("i is " + i);
            if (i == 10)    done = true;
            i++;
        }
    }
}

class ForTest{
    public static void main(String[] args) {
        int  num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i=0; i<10; i++) sum += num[i];
    }
}

// Use a for-each style for loop.
class ForEach{
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        // use for-each style for to display and sum the values
        for (int x: nums) {
            System.out.println("Value is " + x);
            sum += x;
        }

        System.out.println("Summation is " + sum);
    }
}

//  use the break with a for-each style for...
class ForEach2{
    public static void main(String[] args) {
        int sum = 0;
        int nums[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //  use for-each style to dispaly and sum the values...
        for (int x: nums){
            System.out.println("Value is: " + x);
            sum += x;
            if (x == 5) break;  //  Stops when x is 5...
        }

        System.out.println("The summation of the first 5 elements:" + sum);

    }

}

/**
 * The for-each loop is essentially read-only
 */

class NoChange{
    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int x: nums)   {
            System.out.println(x + " ");
            x = x + 10; //  no effect on nums
        }

        System.out.println();

        for (int x: nums)
            System.out.println(x + " ");

        System.out.println("");
    }
}

//  Use for-each style for on 2-dimensional array...

class ForEach3{
    public static void main(String[] args) {
        int sum = 0;
        int nums[][] = new int[3][5];

        //give nums some values
        for (int i=0; i<3; i++)
            for (int j=0; j<5; j++)
                nums[i][j] = (i+1)*(j+1);

         //use the for-each for to display and sum the values...
        for (int x[]: nums) {
            for (int y : x) {
                System.out.println("Value is: " + y);
                sum += y;
            }
        }
        System.out.println("Summation: " + sum );
    }
}

// Search an array using for-each style for.
class Search{
    public static void main(String[] args) {
        int nums [] = { 6, 8, 3, 7, 5, 6, 1, 4 };
        int val = 2;
        boolean found = false;

        //  use for-each style for to search nums for val
        for (int x : nums)  {
            if (x==val) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Value found!!!");
        else
            System.out.println("Value not found!!!");
    }
}

//  Loops may be nested.
class Nested{
    public static void main(String[] args) {
        int i, j;
        for (i=0; i<10; i++){
            for (j=i; j<10; j++)
                System.out.print(".");
            System.out.println();
        }
    }
}

//  Using break to exit the loop
class BreakLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 10)
                break;  //  terminate loop if i = 10
            System.out.println("i is:" + i);
        }
        System.out.println("Loop complete.");
    }
}

//  Using break to exit a while loop...
class BreakLoop2{
    public static void main(String[] args) {
        int i = 0;

        while (i<100)   {
            if (i == 10)
                break;
            System.out.println("i: " + i);
            i++;
        }
        System.out.println("Loop is complete.");
    }
}

//  Using break with nested loops...
class BreakLoop3{
    public static void main(String[] args) {
        for (int i=0; i<3; i++) {
            System.out.println("Pass " + i + ": ");
            for (int j=0; j<100; j++)   {
                if (j == 10)
                    break;  //  terminate the loops at j = 10
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Loops complete.");
    }
}

//  Using break as a civilized go-to form

/**
 * Using the break as a civilized form of go-to function
 * which can be used to transfer control out of a labeled block
 * A label is any valid Java identifier followed by a colon.
 *label:
 */
class Break{
    public static void main(String[] args) {
        boolean t = true;

        first:  {
            second: {
            third:  {
                System.out.println("Before the break.");
                if (t) break second;    //  break out of second block
                System.out.println("This won't execute");
            }
            System.out.println("This won't execute");
            }
            System.out.println("This is after second block");
        }
    }
}

/**
 * Using the labeled break statement to break out of a nested loop...
 */
class BreakLoop4{
    public static void main(String[] args) {
        outer: for (int i=0; i<3; i++)  {
            System.out.print("Pass " + i + ": ");
            for (int j=0; j<100; j++)   {
                if (j == 10) break outer;
                System.out.print(j + " ");
            }
            System.out.println("This will not print");
        }
        System.out.println("Loops complete");
    }
}

//  This program contains an error...

/**
 * You cannot break to any label which is not defined for an enclosing block
 * Since the loop labeled one does not enclose the break statement, it is not possible to
 * transfer control out of that block.
 */
class BreakErr{
    public static void main(String[] args) {

        one: for (int i=0; i<3; i++) {
            System.out.print("Pass " + i + ": ");
            for (int j=0; j<100; j++)   {
                if (j == 10) break one; //WRONG
                System.out.println(j + " ");
            }
        }
    }
}

//  Demonstrate continue
class Continue{
    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            System.out.print(i + " ");
            if ( i%2 == 1) continue;
            System.out.println(" ");
        }
    }
}


//  Using continue with a label
class ContinueLabel{
    public static void main(String[] args) {
        outer:  for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++)    {
                if (j > i)  {
                    System.out.println();
                    continue outer;
                }
            System.out.print(" " + (i * j));
            }
        }
        System.out.println();
    }
}


//  Demonstrate return...
class Return{
    public static void main(String[] args) {
        boolean t = true;

        System.out.println("Before the return");
        if (t) return;  //  return to caller

        System.out.println("This won't run");
    }
}