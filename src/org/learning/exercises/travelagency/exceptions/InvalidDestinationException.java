package org.learning.exercises.travelagency.exceptions;

public class InvalidDestinationException extends IllegalArgumentException {

  public InvalidDestinationException(String s) {
    super(s);
  }
}
