package org.learning.exceptionhandling;

import java.util.Scanner;
import org.learning.oop.geometry.Rectangle;

public class RectangleWithExceptions {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Rectangle rectangle = null;
    while (rectangle == null) {
      try {
        // chiedo le dimensioni
        System.out.print("Insert base: ");
        String base = scanner.nextLine();
        System.out.print("Insert height: ");
        String height = scanner.nextLine();
        // costruisco il rettangolo
        rectangle = new Rectangle(height, base);
        // stampo area e perimetro
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        rectangle.fake();
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }
    scanner.close();
  }
}
