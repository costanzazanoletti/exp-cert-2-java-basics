package org.learning.snacks;

import java.util.Scanner;

public class Snack2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Side 1: ");
    int side1 = Integer.parseInt(scanner.nextLine());
    System.out.print("Side 2: ");
    int side2 = Integer.parseInt(scanner.nextLine());
    System.out.print("Side 3: ");
    int side3 = Integer.parseInt(scanner.nextLine());
    // testo in or tutte le condizioni per cui non è valido (lato < 0 o lato >= somma degli altri)
    if (side1 < 0 || side2 < 0 || side3 < 0 || side1 >= side2 + side3 || side2 >= side1 + side3
        || side3 >= side1 + side2) {
      System.out.println("Invalid");
    } else {
      System.out.println("Valid");
    }

    scanner.close();
  }
}
