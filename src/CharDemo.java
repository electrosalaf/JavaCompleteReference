public class CharDemo {
    public static void main(String[] args) {
        char ch1, ch2;

        ch1 = 88;   //  code for X
        ch2 = 'X';

        System.out.println("ch 1 and ch 2 :" + ch1 + "" + ch2);
    }
}


/**
 * Check www.unicode.org for more information, unicodes are the collections of all
 * character sets found in different languages. If paraventure you found yourself in
 * a big tech companies using C/C++, remember the char data type is 16-bits in Java and
 * 8-bits in C/C++. Though some languages like English,Spanish, Italian or French can
* have all it's characters contained in 8-bits but to enhance the global portability of
*java, such sacrifices need to be made.
*/