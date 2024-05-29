package org.learning.stringutils;

import org.apache.commons.lang3.StringUtils;

public class Example {

  public static void main(String[] args) {
    String message = StringUtils.center("hello", 50, "*");
    System.out.println(message);
    
  }
}
