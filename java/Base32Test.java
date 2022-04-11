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
	   
	   
//nese deshirojme me e be me CMD
//      if (a.length<1) {
//         System.out.println("Usage:");
//         System.out.println("java base32Test 1/2/3/4/5");
//         return;
//      }
	   
//      String theExpected = "IE======";
//      String test = a[0];
//      String theInput = null;
//      String theExpected = null;
//      if (test.equals("1")) {
//         theInput = "A";
//         theExpected = "IE======";
//      } else if (test.equals("2")) {
//         theInput = "AB";
//         theExpected = "IFBA====";
//      } else if (test.equals("3")) {
//         theInput = "ABC";
//         theExpected = "IFBEG===";
//      } else if (test.equals("4")) {
//         theInput = "ABCD";
//         theExpected = "IFBEGRA=";
//      } else if (test.equals("5")) {
//         theInput = "ABCDE";
//         theExpected = "IFBEGRCF";
//      } else {
//         System.out.println("Usage:");
//         System.out.println("java BitpediaBase32Test 1/2/3/4/5");
//         return;
//      }
//      System.out.println("Expected: "+theExpected);

      String theEncoded = base32Imp.encode(theInput.getBytes());
      byte[] theDecoded = base32Imp.decode(theEncoded);
      System.out.println("Input   : "+theInput);
      System.out.println("Encoded : "+theEncoded);

      System.out.println("Decoded : "+new String(theDecoded));
      input.close();
      return;
 
   }
}
