package org.learning.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Examples {

  public static void main(String[] args) {
    // chiediamo all'utente di inserire numeri fino a che dice stop
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<>();
    // ciclo fino a che l'utente esce
    boolean stop = false;

    while (!stop) {
      System.out.print("Insert a number? y/n");
      String choice = scanner.nextLine();
      if (choice.equalsIgnoreCase("y")) {
        System.out.println("Number: ");
        int number = Integer.parseInt(scanner.nextLine());
        // aggiungo il numero alla lista
        numbers.add(number);
      } else {
        stop = true;
      }
    }
    // stampo numbers
    System.out.println(numbers);

    // ordino numbers
    Collections.sort(numbers);
    
    // stampo numbers
    System.out.println(numbers);
    scanner.close();


  }
}
