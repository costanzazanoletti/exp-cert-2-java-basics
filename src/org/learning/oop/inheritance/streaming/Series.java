package org.learning.oop.inheritance.streaming;

public class Series extends Content {

  private int numberOfEpisodes;

  public Series(String title, int numberOfEpisodes) {
    super(title); // prima istruzione del costruttore
    this.numberOfEpisodes = numberOfEpisodes;
  }

  @Override
  public void play() {
    super.play();
    for (int i = 1; i <= numberOfEpisodes; i++) {
      System.out.print(" episode " + i);
    }
    System.out.println();
  }

  @Override
  public String toString() {
    return "Series{title=" + title + ", numberOfEpisodes=" + numberOfEpisodes + "}";
  }
}
