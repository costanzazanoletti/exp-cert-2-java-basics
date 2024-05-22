package org.learning.oop.inheritance.streaming;

public abstract class Content {

  protected String title;

  public Content(String title) {
    this.title = title;
  }

  public void play() {
    System.out.println("I'm playing..." + title);
  }

  @Override
  public String toString() {
    return "Content{" +
        "title='" + title + '\'' +
        '}';
  }
}
