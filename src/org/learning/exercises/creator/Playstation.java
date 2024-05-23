package org.learning.exercises.creator;

public class Playstation implements Device {

  @Override
  public void play() {
    System.out.println("I'm a playstation in play mode");
  }

  @Override
  public void stop() {
    System.out.println("I'm a playstation in stop mode");
  }
}
