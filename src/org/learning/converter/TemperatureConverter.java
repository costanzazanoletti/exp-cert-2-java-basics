package org.learning.converter;

public class TemperatureConverter {

  private TemperatureConverter() {
  }

  public static double celsiusToFarenheit(double celsius) {
    return celsius * 1.8 + 32;
  }

  public static double farenheitToCelsius(double farenheit) {
    return (farenheit - 32) / 1.8;
  }
}
