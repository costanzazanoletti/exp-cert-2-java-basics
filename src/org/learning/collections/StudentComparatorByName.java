package org.learning.collections;

import java.util.Comparator;

public class StudentComparatorByName implements Comparator<Student> {

  @Override
  public int compare(Student s1, Student s2) {
    if (s1 == null && s2 == null) {
      return 0;
    }
    if (s1 == null && s2 != null) {
      return -1;
    }
    if (s1 != null && s2 == null) {
      return 1;
    }
    return s1.getName().compareTo(s2.getName());
  }
}
