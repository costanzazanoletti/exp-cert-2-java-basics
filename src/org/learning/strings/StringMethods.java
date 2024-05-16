package org.learning.strings;

public class StringMethods {

  public static void main(String[] args) {
    String original = "Hello";
    original = original.toUpperCase();
    System.out.println(original.toUpperCase());
    System.out.println(original);


    String message = String.format("The string is %s and is long: %d", original, original.length());

    double price = 9.12345;
    message = String.format("The price is: %.2f€", price);

    System.out.println(message);
  }
}
