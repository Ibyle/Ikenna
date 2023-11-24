package org.example.entities;

import lombok.Getter;
import org.example.enums.CourseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
public class Course {
    private CourseName course;
    private int courseCode;
    private String courseContent;
    public List<Course> listOfCourses = new ArrayList<>();

    public Course() {
    }


    public void viewCoursesToList() {
        Course courses = new Course();
        courses.setCourse(CourseName.MATHEMATICS);
        courses.setCourseCode(321);
        courses.setCourseContent("Algebra");

        Course courses1 = new Course();
        courses.setCourse(CourseName.ENGLISH);
        courses.setCourseCode(322);
        courses.setCourseContent("Use Of English");

        Course courses2 = new Course();
        courses.setCourse(CourseName.CHEMISTRY);
        courses.setCourseCode(421);
        courses.setCourseContent("Organic Chemistry");

        listOfCourses.add(courses);
        listOfCourses.add(courses1);
        listOfCourses.add(courses2);


        for (Course course : listOfCourses) {
            System.out.println(course);
        }
    }

    public void setCourse(CourseName course) {
        this.course = course;
    }

    public void setCourseCode(int courseCode) {

        this.courseCode = courseCode;
    }

    public void setCourseContent(String courseContent) {

        this.courseContent = courseContent;
    }

    public void setListOfCourses(List<Course> listOfCourses) {

        this.listOfCourses = listOfCourses;
    }



//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Course courses = (Course) o;
//        return courseCode == courses.courseCode && course == courses.course && Objects.equals(courseContent, courses.courseContent);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(course, courseCode, courseContent);
    }


    public String toString() {
        return "Course Name: " + course + ", Course code: " + courseCode + ", Content: " + courseContent;
    }

    public boolean getName() {
        return true;
    }
}
