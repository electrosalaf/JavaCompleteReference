/**
 * Masking sign extension with an array of hexadecimal characters...
 */
class HexByte {
      public static void main(String[] args) {
         char hex[] = {
                 '0', '1', '2', '3', '4', '5','6','7',
                 '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
         };

         //byte b = (byte) 0xf1;

        //System.out.println("b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
        //System.out.println( hex[b & 0x0f]);   This gives 1

         int a = -1;
         a = a >>> 24; // Unsigned right shift
         System.out.println(a);

          /**
           * The following lines of codes perform the unsigned shifting of byte value..
           */
          byte b = (byte) 0xf1;
          byte c = (byte) (b >> 4);
          byte d = (byte) (b >>> 4);
          byte e = (byte)  ((b & 0xff) >> 4);

          System.out.println("b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
          System.out.println("b >> 4 = 0x" + hex[(c >> 4) & 0x0f] + hex[c & 0x0f]);
          System.out.println("b >>> 4 = 0x" + hex[(d >> 4) & 0x0f] + hex[d & 0x0f]);
          System.out.println("(b & 0xff) >> 4 = 0x" + hex[(e >> 4) & 0x0f] + hex[e & 0x0f]);
      }


}


