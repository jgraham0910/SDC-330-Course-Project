/**
 * Name: Jacoreua Graham
 * Assignment: SDC330 Course Project - Class Implementation
 * Description: Represents a course in the Student Management System.
 */
public class Course {

 private String courseCode;
 private String courseName;
 private int credits;
 private Instructor instructor;

 public Course(String courseCode, String courseName, int credits,
    Instructor instructor) {

  this.courseCode = courseCode;
  this.courseName = courseName;
  this.credits = credits;
  this.instructor = instructor;
 }

 public String getCourseCode() {
  return courseCode;
 }

 public void setCourseCode(String courseCode) {
  this.courseCode = courseCode;
 }

 public String getCourseName() {
  return courseName;
 }

 public void setCourseName(String courseName) {
  this.courseName = courseName;
 }

 public int getCredits() {
  return credits;
 }

 public void setCredits(int credits) {
  this.credits = credits;
 }

 public Instructor getInstructor() {
  return instructor;
 }

 public void setInstructor(Instructor instructor) {
  this.instructor = instructor;
 }

 @Override
 public String toString() {

  String instructorName =
    instructor.getFirstName() + " " +
    instructor.getLastName();

  return "Course Code: " + courseCode
    + ", Course Name: " + courseName
    + ", Credits: " + credits
    + ", Instructor: " + instructorName;
 }
}