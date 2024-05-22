package org.learning.oop.abstraction.loader;


import java.util.Scanner;

/*
* Abbiamo un programma che gestisce gli studenti dei corsi Experis.
  Il programma mostra l’elenco degli studenti caratterizzati da nome, cognome e classe.
  L’elenco degli studenti può essere caricato in due modi:
  - da un file csv
  - direttamente dalla memoria
  L’utente all’avvio del programma sceglie quale modalità.
* */
public class ClassManager {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // dichiaro che avrò bisogno di un Loader
    Loader loader = null;

    System.out.print("Load from memory - 1, Load from file-2");
    String choice = scanner.nextLine();
    switch (choice) {
      case "1":
        // load from memory
        loader = LoaderFactory.createLoader("MEMORY");
        break;
      case "2":
        // load from file
        loader = LoaderFactory.createLoader("FILE");
        break;
      default:
        System.out.println("Invalid choice");
        break;
    }
    if (loader != null) {
      // invoco il metodo load del Loader
      try {
        Student[] students = loader.load();
        for (int i = 0; i < students.length; i++) {
          System.out.println(students[i]);
        }
      } catch (UnableToLoadException e) {
        System.out.println("Unable to load students");
        System.out.println(e.getMessage());
      }
    }
    scanner.close();
  }
}
