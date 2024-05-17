package org.learning.snacks;


public class Snack5Ex {

  public static void main(String[] args) {

    String s = "asda1231@c#";
    int letters = 0;
    int digits = 0;
    int notAlphabetic = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c >= '0' && c <= '9') {
        digits++;
      } else if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
        letters++;
      } else {
        notAlphabetic++;
      }
    }
  }
}
