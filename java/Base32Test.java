package Base32Implementation;
 
import java.io.*;
import java.util.Scanner;
 
 
@SuppressWarnings("unused")
class Base32Test {
   public static void main(String[] a) {

	  Scanner input = new Scanner(System.in);
      String test;
      System.out.println("Jepni nje input i cili do te enkodohet: ");
      String theInput;
      theInput = input.nextLine();

      String theEncoded = base32Imp.encode(theInput.getBytes());
      byte[] theDecoded = base32Imp.decode(theEncoded);
      System.out.println("Input   : "+theInput);
      System.out.println("Encoded : "+theEncoded);
//      System.out.println("Expected: "+theExpected);
      System.out.println("Decoded : "+new String(theDecoded));
      input.close();
      return;
 
   }
}
