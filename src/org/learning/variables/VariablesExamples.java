package org.learning.variables;

public class VariablesExamples {
  /*
  * multi
  * line
  * comment
  * */
  public static void main(String[] args) { // line comment
    int counter;
    {
      counter = 1; // qui vedo counter perchè è stato dichiarato in uno scope più globale
    }

    System.out.println(counter);

    double priceWithVat = 9.99;
    double discountedPrice = priceWithVat;
    discountedPrice = discountedPrice - 5;

    // boolean flag = discountedPrice;

    float myFloat = 9.99F;

    long myLong = 1000000000000L;


    byte b = 80; // 1 byte = 8 bit ->2^8 possibili valori = 256 possibili valori -2^n-1 -> 2^n-1 -1

    char c = 'x';
    c = 48;
    System.out.println(c);




    String message = "Hello";

    // String String = "Ciao"; fa schifo


    String s1 = null;
    int n1;

    //int n2 = n1 + 3;

    int quoziente = 5/2;
    int resto = 5%2;

    System.out.println("quoziente:" + quoziente);
    System.out.println("resto:" + resto);

    System.out.println(5.0/2.0);

    int intValue = 10000;
    byte byteValue = (byte) intValue; // non si fa mai perchè esce un valore senza senso
    System.out.println(byteValue);


  }
}
