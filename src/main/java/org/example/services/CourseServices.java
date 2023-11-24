package org.example.services;

import org.example.entities.Staff.Teacher;
import org.example.entities.Student;

public interface CourseServices {

//    void teachesCourses(Teacher teacher, Student student);

    void studentCourses(Student student);
    void takeCourses(Teacher teacher);
    void viewCoursesToList(Teacher teacher, Student student);

}
