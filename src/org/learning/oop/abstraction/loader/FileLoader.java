package org.learning.oop.abstraction.loader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileLoader implements Loader {

  private final static String FILE_PATH = "./resources/students.csv";
  private final static int SIZE = 3;

  // metodo load che legge il file e restituisce l'array di Student
  @Override
  public Student[] load() throws UnableToLoadException {
    Student[] students = new Student[SIZE];

    try (Scanner scanner = new Scanner(new File(FILE_PATH))) {
      int counter = 0;
      while (scanner.hasNextLine()) {
        // leggo riga per riga
        String line = scanner.nextLine();
        // splitto sul ;
        String[] tokens = line.split(";");
        // creo l'oggetto studente con i tre parametr
        Student student = new Student(tokens[0], tokens[1], tokens[2]);
        students[counter] = student;
        counter++;
      }
      return students;
    } catch (FileNotFoundException e) {
      throw new UnableToLoadException("Unable to read file with data");
    }
  }
}
