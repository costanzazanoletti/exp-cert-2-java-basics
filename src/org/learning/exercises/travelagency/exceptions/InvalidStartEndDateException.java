package org.learning.exercises.travelagency.exceptions;

public class InvalidStartEndDateException extends IllegalArgumentException {

  public InvalidStartEndDateException(String s) {
    super(s);
  }
}
