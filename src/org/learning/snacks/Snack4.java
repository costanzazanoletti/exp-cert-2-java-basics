package org.learning.snacks;

import java.util.Scanner;

public class Snack4 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // prendo le due stringhe in input
    System.out.print("First string: ");
    String s1 = scanner.nextLine();
    System.out.print("Second string: ");
    String s2 = scanner.nextLine();

    // se sono di lunghezza diversa l'input non è valido
    if (s1.length() != s2.length()) {
      System.out.println("Invalid input");
    } else {
      // inizializzo a 0 la distanza
      int distance = 0;
      for (int i = 0; i < s1.length(); i++) {
        // per ogni posizione confronto il carattere delle due stringhe
        if (s1.charAt(i) != s2.charAt(i)) {
          distance++; // se sono diversi incremento la distanza
        }
      }
      System.out.println("Hamming distance: " + distance);
    }

    scanner.close();
  }
}
