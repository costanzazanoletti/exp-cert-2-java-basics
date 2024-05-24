package org.learning.collections;

import java.util.Objects;

public class Student implements Comparable<Student> {

  private int id;
  private String name;

  public Student(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "Student{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }

  /*@Override
  public boolean equals(Object obj) {
    *//* this è uguale a obj se:
    - siamo dello stesso tipo Student
    - gli id sono uguali
    - i nomi sono uguali
    *//*
    if (obj instanceof Student) {
      // faccio il cast di obj a Student
      Student otherStudent = (Student) obj;

      return this.id == otherStudent.id && this.name.equals(otherStudent.name);
    } else {
      return false;
    }
  }*/

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Student student = (Student) o;
    return getId() == student.getId() && Objects.equals(getName(), student.getName());
  }

  @Override
  public int hashCode() {
    int result = getId();
    result = 31 * result + Objects.hashCode(getName());
    return result;
  }

  @Override
  public int compareTo(Student o) {
    if (o == null) {
      return 1;
    }
    if (getId() == o.getId()) {
      return getName().compareTo(o.getName());
    } else {
      return getId() - o.getId();
    }
  }
}
