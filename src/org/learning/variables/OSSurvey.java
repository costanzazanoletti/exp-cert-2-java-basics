package org.learning.variables;


import java.util.Scanner;

public class OSSurvey {

  public static void main(String[] args) {
    // apro uno Scanner che legge da tastiera
    Scanner scanner = new Scanner(System.in);

    // salvare quanti utenti usano mac, linux e win
    int macUsers, linuxUsers, winUsers;
    System.out.print("Number of Mac users: ");
    // legge il valore come stringa da tastiera poi lo converte in int
    macUsers = Integer.parseInt(scanner.nextLine());
    System.out.print("Number of Windows users: ");
    winUsers =Integer.parseInt(scanner.nextLine());
    System.out.print("Number of Linux users: ");
    linuxUsers = Integer.parseInt(scanner.nextLine());

    System.out.println("Mac users: " + macUsers);
    System.out.println("Windows users: " + winUsers);
    System.out.println("Linux users: " + linuxUsers);

    int totalUsers = macUsers + winUsers + linuxUsers;


    // calcolo le percentuali sul totale utenti
    // formula % -> valore*100/totale
    double macPerc = 1.0 * macUsers / totalUsers * 100;
    double winPerc = winUsers / (double)totalUsers * 100;
    double linuxPerc = (double)linuxUsers / totalUsers * 100;

    // stampo a video i risultati (expected: 29.62, 66.66, 3.7)
    System.out.println("% Mac: " + macPerc);
    System.out.println("% Windows: " + winPerc);
    System.out.println("% Linux: " + linuxPerc);

    int macPercInt = (int)macPerc;
    System.out.println(macPercInt);


    // chiudo lo Scanner
    scanner.close();
  }
}
