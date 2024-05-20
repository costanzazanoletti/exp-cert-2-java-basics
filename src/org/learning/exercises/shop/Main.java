package org.learning.exercises.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Name: ");
    String name = scanner.nextLine();
    System.out.print("Description: ");
    String description = scanner.nextLine();
    System.out.print("Price: ");
    BigDecimal price = new BigDecimal(scanner.nextLine());
    System.out.print("VAT: ");
    BigDecimal vat = new BigDecimal(scanner.nextLine());
    // invoco il costruttore
    Product product = new Product(name, description, price, vat);
    System.out.println(product.getFullName());
    System.out.println(product.getDescription());
    System.out.println(product.getFullPrice());

    scanner.close();


  }
}
