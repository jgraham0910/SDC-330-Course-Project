/**
 * Name: Jacoreua Graham
 * Assignment: SDC330 Course Project - Class Implementation
 * Description: Main application for the Student Management System.
 */
public class Application {

 public static void main(String[] args) {

 System.out.println(
  "Jacoreua Graham - Student Management System"
 );

 System.out.println(
  "=========================================="
 );

 // Create the student manager
 StudentManager studentManager = new StudentManager();

 // Create students
 Student student1 = new Student(
  "Jacoreua",
  "Graham",
  "jacoreua@example.com",
  "S1001",
  "Cybersecurity"
 );

 Student student2 = new Student(
  "Jordan",
  "Smith",
  "jordan@example.com",
  "S1002",
  "Computer Science"
 );

 // Add students
 studentManager.add(student1);
 studentManager.add(student2);

 // Create instructor
 Instructor instructor = new Instructor(
  "Michael",
  "Johnson",
  "michael@example.com",
  "I1001",
  "Computer Science"
 );

 // Create course
 Course course = new Course(
  "SDC330",
  "Object-Oriented Programming",
  3,
  instructor
 );

 // Create course manager
 CourseManager courseManager = new CourseManager();

 // Add course
 courseManager.add(course);

 // Display students
 System.out.println();
 System.out.println("STUDENTS");
 System.out.println("--------");

 studentManager.displayAll();

 // Display courses
 System.out.println();
 System.out.println("COURSES");
 System.out.println("-------");

 courseManager.displayAll();

 // Demonstrate composition
 Enrollment enrollment = new Enrollment(
  student1,
  course,
  "2026-08-24"
 );

 System.out.println();
 System.out.println("ENROLLMENT");
 System.out.println("----------");
 System.out.println(enrollment);

 System.out.println();
 System.out.println("Application completed successfully.");
 }
}