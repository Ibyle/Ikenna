package org.example.serviceImplematn;

import org.example.entities.Book;
import org.example.entities.Person;
import org.example.entities.Staff.Teacher;
import org.example.entities.Student;
import org.example.services.LibraryService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceImplementationTest {

    LibraryServiceImplementation LibraryService = new LibraryServiceImplementation();

    @Test
    void teacherSeniorJuniorPriority() {
        List<Person> teacherList = TeacherServiceImpl.teacher;
        List<Person> lisOfjuniorStudentList = StudentDetailsImpl.juniorStudentList;
        List<Person> listofSeniorStudentList = StudentDetailsImpl.seniorStudentList;
        Book book = new Book("Bayo","Ben","Mike",2);

        assertTrue(LibraryService.teacherSeniorJuniorPriority(teacherList,listofSeniorStudentList,lisOfjuniorStudentList,book));
    }
 
    @Test
    void firstComeFirstServed() {
        List<Person> teacherList = TeacherServiceImpl.teacher;
        List<Person> lisOfjuniorStudentList = StudentDetailsImpl.juniorStudentList;
        List<Person> listofSeniorStudentList = StudentDetailsImpl.seniorStudentList;
        Book book = new Book("Shade","Blade","Ben", 2);

        assertTrue(LibraryService.teacherSeniorJuniorPriority(teacherList,listofSeniorStudentList,lisOfjuniorStudentList,book));
    }
}