package org.learning.exercises.travelagency;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import org.learning.exercises.travelagency.exceptions.InvalidDateException;
import org.learning.exercises.travelagency.exceptions.InvalidDestinationException;
import org.learning.exercises.travelagency.exceptions.InvalidStartEndDateException;

public class Holiday {
  /*
  - destinazione, data inizio e data fine non possono essere null
  - la data inizio non può essere già passata
   - la data fine non può essere prima della data inizio
  */


  // ATTRIBUTI
  private String destination;
  private LocalDate startDate;
  private LocalDate endDate;

  // COSTRUTTORI

  public Holiday(String destination, LocalDate startDate, LocalDate endDate)
      throws InvalidDestinationException, InvalidDateException, InvalidStartEndDateException {
    this.destination = validateDestination(destination);
    this.startDate = validateDate(startDate);
    this.endDate = validateDate(endDate);
    validateStartEndDate(startDate, endDate);
  }

  // GETTER E SETTER
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) throws InvalidDestinationException {
    this.destination = validateDestination(destination);
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate)
      throws InvalidDateException, InvalidStartEndDateException {
    this.startDate = validateDate(startDate);
    validateStartEndDate(startDate, getEndDate());
  }

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate)
      throws InvalidDateException, InvalidStartEndDateException {
    this.endDate = validateDate(endDate);
    validateStartEndDate(getStartDate(), endDate);
  }

  // METODI
  // metodo per restituire la durata in giorni della vacanza
  public long getDurationInDays() {
    return ChronoUnit.DAYS.between(startDate, endDate);
  }

  // metodo per validare la destination
  private String validateDestination(String destination) throws InvalidDestinationException {
    if (destination == null || destination.isEmpty()) {
      throw new InvalidDestinationException("Invalid destination: " + destination);
    }
    return destination;
  }

  // metodo per validare le date
  private LocalDate validateDate(LocalDate date) throws InvalidDateException {
    if (date == null || date.isBefore(LocalDate.now())) {
      throw new InvalidDateException("Invalid date: " + date);
    }
    return date;
  }

  // metodo per confrontare start date e end date
  private void validateStartEndDate(LocalDate startDate, LocalDate endDate) {
    if (startDate.isAfter(endDate)) {
      throw new InvalidStartEndDateException(
          "Start date after end date: " + startDate + " - " + endDate);
    }
  }

  @Override
  public String toString() {
    return "Holiday{" +
        "destination='" + destination + '\'' +
        ", startDate=" + startDate +
        ", endDate=" + endDate +
        '}';
  }

  @Override
  public final boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Holiday holiday)) {
      return false;
    }

    return getDestination().equals(holiday.getDestination()) && getStartDate().equals(
        holiday.getStartDate()) && getEndDate().equals(holiday.getEndDate());
  }

  @Override
  public int hashCode() {
    int result = getDestination().hashCode();
    result = 31 * result + getStartDate().hashCode();
    result = 31 * result + getEndDate().hashCode();
    return result;
  }
}
