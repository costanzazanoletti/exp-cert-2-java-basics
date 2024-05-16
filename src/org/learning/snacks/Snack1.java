package org.learning.snacks;

import java.util.Scanner;

public class Snack1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // apro lo scanner

    int n; // dichiaro n

    do {
      System.out.print("Insert a number (0-20): ");
      n = Integer.parseInt(scanner.nextLine());
    } while (n < 0 || n > 20); // resto nel ciclo fino a che n non è valido

    // itero sui numeri interi compresi tra 0 e n
    for (int i = 0; i <= n; i++) {
      System.out.println(i * i * i); // stampo il cubo
    }

    scanner.close(); // chiudo lo scanner
  }
}
