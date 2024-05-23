package org.learning.exercises.creator;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // chiedo all'utente il tipo di device
    System.out.print("Device type: 1-dvd player 2-playstation 3-radio");
    String type = scanner.nextLine();
    Device device = null;
    switch (type) {
      case "1":
        // dvd player
        device = Creator.create(DeviceType.DVD_PLAYER);
        break;
      case "2":
        // playstation
        device = Creator.create(DeviceType.PLAYSTATION);
        break;
      case "3":
        // playstation
        device = Creator.create(DeviceType.RADIO);
        break;
      default:
        System.out.println("invalid type");
        break;
    }

    /*// uso il metodo create per istanziare il device richiesto
    try {
      Device device = Creator.create(type);
      // eseguo i metodi di play e stop
      device.play();
      System.out.println("************");
      device.stop();
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }*/

    scanner.close();
  }
}
