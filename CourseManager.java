import java.util.ArrayList;

/**
 * Name: Jacoreua Graham
 * Assignment: SDC330 Course Project - Class Implementation
 * Description: Manages course objects for the Student Management System.
 */
public class CourseManager implements Manageable<Course> {

 private ArrayList<Course> courses;

 public CourseManager() {
  courses = new ArrayList<>();
 }

 @Override
 public void add(Course course) {
  courses.add(course);
 }

 @Override
 public void update(Course course) {

  for (int i = 0; i < courses.size(); i++) {

   if (courses.get(i).getCourseCode()
     .equals(course.getCourseCode())) {

    courses.set(i, course);
    return;
   }
  }
 }

 @Override
 public void delete(Course course) {
  courses.remove(course);
 }

 @Override
 public void displayAll() {

  if (courses.isEmpty()) {
   System.out.println("No courses found.");
   return;
  }

  for (Course course : courses) {
   System.out.println(course);
  }
 }

 public Course findByCode(String courseCode) {

  for (Course course : courses) {

   if (course.getCourseCode().equals(courseCode)) {
    return course;
   }
  }

  return null;
 }

 public ArrayList<Course> getCourses() {
  return courses;
 }
}