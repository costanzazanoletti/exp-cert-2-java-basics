package org.learning.exercises.travelagency.exceptions;

public class InvalidDateException extends IllegalArgumentException {

  public InvalidDateException(String s) {
    super(s);
  }
}
