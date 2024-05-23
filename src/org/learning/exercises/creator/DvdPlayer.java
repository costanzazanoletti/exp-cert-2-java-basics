package org.learning.exercises.creator;

public class DvdPlayer implements Device {

  @Override
  public void play() {
    System.out.println("I'm a dvd player in play mode");
  }

  @Override
  public void stop() {
    System.out.println("I'm a dvd player in stop mode");
  }
}
