/**
 * It should be noted that despite the fact that the unicode contains character sets,
 * arithmetic operations can also be performed on the declared character variable.
 * char variable behaves like integers.....
 */


public class CharDemo2 {
    public static void main(String[] args) {
        char ch1 = 'X';

        System.out.println("ch1 contains " + ch1);

        ch1 ++;  // increment of ch1 which is an arithmetic operation
        System.out.println("ch1 now contains " + ch1);

        char ch2 =  '\ua432';   //  represents the Japanese Katakana character
        System.out.println(ch2);

        char ch3 = '\u0061';    //  Iso-Latin character a
        System.out.println("a");
    }
}

