package org.learning.exercises.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {

  // ATTRIBUTI
  private int code;
  private String name;
  private String description;
  private BigDecimal price;
  private BigDecimal vat;

  // variabile di classe (accessibile a tutte le istanze di Product)
  private static int counter;

  // COSTRUTTORI
  public Product(String name, String description, BigDecimal price, BigDecimal vat) {
    counter++;

    // assegno i valori
    this.code = generateCode();
    this.name = valueOrDefault(name);
    this.description = valueOrDefault(description);
    this.price = valueOrDefault(price);
    this.vat = valueOrDefault(vat);

  }

  // GETTER E SETTER
  public String getCode() {
    return String.format("%06d", code);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = valueOrDefault(name);
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = valueOrDefault(description);
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = valueOrDefault(price);
  }

  public BigDecimal getVat() {
    return vat;
  }

  public void setVat(BigDecimal vat) {
    this.vat = valueOrDefault(vat);
  }

  public BigDecimal getFullPrice() {
    // fullPrice = price + price*vat
    //BigDecimal vatOnPrice = price.multiply(vat);
    return price.multiply(vat).add(price).setScale(2, RoundingMode.HALF_EVEN);
  }

  public String getFullName() {
    return getCode() + " - " + name;
  }

  // METODI
  private int generateCode() {
    /*Random random = new Random();
    return random.nextInt(1, 1000000);*/
    return counter;
  }

  private String valueOrDefault(String value) {
    if (value == null || value.isEmpty()) {
      return "N.D.";
    }
    return value;
  }

  private BigDecimal valueOrDefault(BigDecimal value) {
    if (value == null || value.compareTo(BigDecimal.ZERO) < 0) {
      return BigDecimal.ZERO;
    }
    return value;
  }

}
