package org.learning.oop.inheritance.streaming;

public class Main {

  public Main() {
    super();
  }

  public static void main(String[] args) {
    Content content = new Content("Generic content");
    content.play();

    Series shogun = new Series("Shogun", 8);
    shogun.play();

    Movie dune = new Movie("Dune part II");
    dune.play();

    AnimatedSeries naruto = new AnimatedSeries("Naruto", 899);

    System.out.println("***** Playlist ******");
    Content[] playList = {content, shogun, dune, naruto};
    for (int i = 0; i < playList.length; i++) {
      //playList[i].play();
      System.out.println(playList[i].toString());
    }
  }
}
