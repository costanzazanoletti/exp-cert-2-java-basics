package org.learning.converter;

import java.util.Scanner;

public class WeekTemperatures {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double[] temperatures = {18.5, 20.0, 14.1, 10.10}; // Celsius
    System.out.println("Celsius or Farenheit?(C/F)");
    String choice = scanner.nextLine();

    //TemperatureConverter tc = new TemperatureConverter();

    switch (choice) {
      case "C":
        for (int i = 0; i < temperatures.length; i++) {
          System.out.println(temperatures[i]);
        }
        break;
      case "F":
        for (int i = 0; i < temperatures.length; i++) {
          System.out.println(TemperatureConverter.celsiusToFarenheit(temperatures[i]));
        }
        break;
      default:
        System.out.println("invalid choice");
        break;
    }

  }
}
