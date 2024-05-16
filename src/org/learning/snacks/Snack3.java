package org.learning.snacks;

import java.util.Scanner;

public class Snack3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // prendo l'input utente
    System.out.print("Input: ");
    int input = Integer.parseInt(scanner.nextLine());
    // ciclo esterno stampa le righe
    for (int i = 1; i <= input; i++) {
      // ciclo interno stampa le colonne
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      // al termine di ogni iterazione vado a capo
      System.out.println();
    }

    scanner.close();
  }

}
