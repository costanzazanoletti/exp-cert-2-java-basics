package org.learning.exercises.shop;

import java.math.BigDecimal;

public class ProductCounter {

  public static void main(String[] args) {
    Product p1 = new Product("yogurt", "", new BigDecimal("2.99"), new BigDecimal("0.22"));
    Product p2 = new Product("iPhone", "", new BigDecimal("1233"), new BigDecimal("0.22"));
    Product p3 = new Product("bread", "", new BigDecimal("5.00"), new BigDecimal("0.22"));

    System.out.println(p1.getFullName());
    System.out.println(p2.getFullName());
    System.out.println(p3.getFullName());
  }
}
