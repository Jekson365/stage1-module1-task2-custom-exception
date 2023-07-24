package com.epam.mjc;


public class StudentManager {

  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
//
//  public Student find(long studentID) {
//    return Student.getValueOf(studentID);
//  }

  public static void main(String[] args) {
    StudentManager manager = new StudentManager();



    for (int i = 0; i < IDs.length; i++) {
      Student student = manager.find(IDs[i]);
//      System.out.println("Student name " + student.getName());
    }
  }
  public Student find(long studentID) {
    for (int i = 0;i < IDs.length;i++) {
      if (studentID == IDs[i]) {
        try {
          System.out.println("student exitsts");
        }
        catch(CustomException e) {
          throw new CustomException("Could not find student with ID "+studentID);
        }
      }
    }
    return null;
  }
}

class CustomException extends IllegalArgumentException {
    long ID;
    CustomException(long _id) {
      this.ID = _id;
    }
    public CustomException(String s) {
      super(s);
    }
}