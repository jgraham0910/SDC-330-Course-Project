/**
* Name: Jacoreua Graham
* Assignment: SDC330 Course Project - Class Implementation
* Description: Represents a student's enrollment in a course.
*/
public class Enrollment {

  private Student student;
  private Course course;
  private String enrollmentDate;

  public Enrollment(Student student, Course course, String enrollmentDate) {
    this.student = student;
    this.course = course;
    this.enrollmentDate = enrollmentDate;
  }

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public Course getCourse() {
    return course;
  }

  public void setCourse(Course course) {
    this.course = course;
  }

  public String getEnrollmentDate() {
    return enrollmentDate;
  }

  public void setEnrollmentDate(String enrollmentDate) {
    this.enrollmentDate = enrollmentDate;
  }

  @Override
  public String toString() {

    return "Student: "
        + student.getFirstName() + " "
        + student.getLastName()
        + ", Course: "
        + course.getCourseCode()
        + " - "
        + course.getCourseName()
        + ", Enrollment Date: "
        + enrollmentDate;
  }
}