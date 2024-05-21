package org.learning.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HandleFile {

  public static void main(String[] args) {
    File file = new File("./resources/data.txt");
    System.out.println(file.exists());
    //writeToFile(file);
    writeToFileWithResources(file);
    readFile(file);
  }


  private static void readFile(File file) {
    Scanner scanner = null;
    try {
      scanner = new Scanner(file);
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        System.out.println(line);
      }
    } catch (FileNotFoundException e) {
      System.out.println("Unable to read file");
    } finally {
      if (scanner != null) {
        scanner.close();
      }
    }
  }


  private static void writeToFile(File file) {
    FileWriter fileWriter = null;
    try {
      fileWriter = new FileWriter(file);
      fileWriter.write("First line\n");
      fileWriter.write("Second line\n");

    } catch (IOException e) {
      System.out.println("Unable to open file writer");
    } finally {
      System.out.println("FINALLY");
      if (fileWriter != null) {
        // chiudo il FileWriter
        try {
          fileWriter.close();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    }
  }

  private static void writeToFileWithResources(File file) {
    // try-with-resources
    try (FileWriter fileWriter = new FileWriter(file)) {
      fileWriter.write("Try with resources");
    } catch (IOException e) {
      System.out.println("Unable to write to file");
    }
  }
}
