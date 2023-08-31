package com.epam.mjc;


public class StudentManager {

  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    static class StudentNotFoundException extends IllegalArgumentException {
    public StudentNotFoundException(String message) {
      super(message);
    }
  }
  public Student find(long studentID) throws StudentNotFoundException {
      if (Student.getValueOf(studentID) != null) {
        return Student.getValueOf(studentID);
      } else {
        throw new StudentNotFoundException("Could not find student with ID " + studentID);
      }
//    try {
//      return Student.getValueOf(studentID);
//    } catch (IllegalArgumentException e) {
//      throw new StudentNotFoundException("Could not find student with ID " + studentID, e);
//    }
  }



  public static void main(String[] args) {
    StudentManager manager = new StudentManager();
    for (int i = 0; i < IDs.length; i++) {
      Student student = manager.find(IDs[i]);
      System.out.println("Student name " + student.getName());
    }
  }
}