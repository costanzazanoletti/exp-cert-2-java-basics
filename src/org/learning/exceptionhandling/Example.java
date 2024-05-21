package org.learning.exceptionhandling;

import java.util.Scanner;

public class Example {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Insert a number: ");
    String input = scanner.nextLine();

    try {
      int number = Integer.parseInt(input);
      System.out.println("Your number is " + number);
      System.out.println("Result: " + (10 / number));

    } catch (Exception e) {
      System.out.println("An error occurred");
      System.out.println(e.getClass().getName());
      System.out.println(e.getMessage());
    }

    scanner.close();
  }
}
