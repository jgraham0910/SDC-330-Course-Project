/**
 * Name: Jacoreua Graham
 * Assignment: SDC330 Course Project - Class Implementation
 * Description: Represents an instructor in the Student Management System.
 */
public class Instructor extends Person {

 private String instructorId;
 private String department;

 public Instructor(String firstName, String lastName, String email,
    String instructorId, String department) {

  super(firstName, lastName, email);

  this.instructorId = instructorId;
  this.department = department;
 }

 public String getInstructorId() {
  return instructorId;
 }

 public void setInstructorId(String instructorId) {
  this.instructorId = instructorId;
 }

 public String getDepartment() {
  return department;
 }

 public void setDepartment(String department) {
  this.department = department;
 }

 @Override
 public String getRole() {
  return "Instructor";
 }

 @Override
 public String toString() {
  return "Instructor ID: " + instructorId
    + ", Name: " + getFirstName() + " " + getLastName()
    + ", Email: " + getEmail()
    + ", Department: " + department;
 }
}