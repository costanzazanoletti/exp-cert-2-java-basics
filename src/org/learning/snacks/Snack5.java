package org.learning.snacks;

import java.util.Scanner;

public class Snack5 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Base: ");
    int base = Integer.parseInt(scanner.nextLine());
    System.out.print("Exponent: ");
    // per assicurarmi esponente positivo uso Math.abs()
    int exp = Math.abs(Integer.parseInt(scanner.nextLine()));

    int power;
    if (base == 0) { // se la base è 0 la potenza è 0 tranne che per esponente 0
      power = exp == 0 ? 1 : 0;
    } else {
      power = 1; // inizializzo a 1 (se esponente è 0 non entro nel ciclo for)
      for (int i = 0; i < exp; i++) {
        power *= base;// ad ogni iterazione moltiplico il risultato corrente per la base
      }
    }

    System.out.println("Power: " + power);
    scanner.close();
  }
}
