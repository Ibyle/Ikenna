package org.example.services;

import org.example.entities.Staff.Teacher;
import org.example.entities.Student;

public interface TeacherServices {
    void conductExams(Student student);
    void teachesCourses(Teacher teacher, Student student);

}
