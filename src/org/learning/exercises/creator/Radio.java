package org.learning.exercises.creator;

public class Radio implements Device {

  @Override
  public void play() {
    System.out.println("I'm a radio in play mode");
  }

  @Override
  public void stop() {
    System.out.println("I'm a radio in stop mode");
  }
}
