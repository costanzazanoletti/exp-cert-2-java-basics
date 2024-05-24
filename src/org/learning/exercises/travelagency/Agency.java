package org.learning.exercises.travelagency;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Agency {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // salvo le holiday in un catalogo
    Set<Holiday> catalog = new HashSet<>();

    System.out.println("**** Welcome to Java Travel Agency ****");

    boolean exit = false; // flag di uscita dal ciclo
    while (!exit) {
      // chiedo all'utente cosa vuole fare
      System.out.print("1-Insert new holiday 0-Exit ");
      String choice = scanner.nextLine();

      switch (choice) {
        case "0":
          // exit
          exit = true;
          System.out.println("Bye bye");
          break;
        case "1":
          // insert
          Holiday holiday = createHoliday(scanner);
          boolean added = catalog.add(holiday);
          // stampo i dettagli
          System.out.println(added ? holidayDetails(holiday) : "This holiday already exists");
          break;
        default:
          System.out.println("Invalid choice");
          break;
      }
    }
    // stampo il catalogo
    System.out.println(catalog);

    scanner.close();
  }

  private static Holiday createHoliday(Scanner scanner) {
    Holiday holiday = null;
    // continuo a ciclare finché non ho creato l'oggetto
    while (holiday == null) {
      // destinazione
      System.out.print("Destination: ");
      String destination = scanner.nextLine();

      // start date
      System.out.println("Start date");
      LocalDate startDate = getDate(scanner);

      // end date
      System.out.println("End date");
      LocalDate endDate = getDate(scanner);

      try {
        // provo a creare l'oggetto Holiday
        holiday = new Holiday(destination, startDate, endDate);
      } catch (IllegalArgumentException e) {
        System.out.print("Unable to create holiday: ");
        System.out.println(e.getMessage());
      }

    }

    return holiday;
  }

  private static LocalDate getDate(Scanner scanner) {
    LocalDate date = null;
    while (date == null) {
      System.out.print("Insert date (yyyy-MM-dd): ");
      String dateString = scanner.nextLine();
      try {
        date = LocalDate.parse(dateString);
      } catch (DateTimeParseException e) {
        System.out.println("Invalid date format: " + e.getMessage());
      }
    }
    return date;
  }

  private static String holidayDetails(Holiday holiday) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MMMM dd", Locale.ENGLISH);

    return String.format("You booked and holiday of %d days to %s from %s to %s",
        holiday.getDurationInDays(), holiday.getDestination(),
        holiday.getStartDate().format(formatter),
        holiday.getEndDate().format(formatter));
  }
}
