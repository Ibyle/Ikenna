package org.example;

import org.example.entities.Book;
import org.example.entities.Person;
import org.example.serviceImplematn.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static org.example.serviceImplematn.StudentDetailsImpl.readExcelDetails;
import static org.example.serviceImplematn.TeacherServiceImpl.readExcelDetail;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //TeacherServiceImplementation//
        System.out.println("------------------------------------Teacher Details-------------------------");
        TeacherServiceImpl teacherService = new TeacherServiceImpl();
        List<Person> teacher = readExcelDetail("Dataset.csv");

        //PrincipalServiceImplementation//
        PrincipalServiceImpl principalService = new PrincipalServiceImpl();


        //StudentDetailsImplementation//
        System.out.println("---------------------------------Student Details--------------------------");
        List<Person> studentDetails = readExcelDetails("Dataset2.csv", "");


     ///////////////////------------------BOOK LIBRARY------------------/////////////////////////////////////
        System.out.println("////////............................LIST OF BOOKS IN LIBRARY ........................//////");

        Book book1 = new Book("The Lean Startup", "Eric Ries", "Management", 5);
        Book book2 = new Book("Good to Great", "Jim Collins", "Management", 6);
        Book book3 = new Book("Leaders Eat Last", "Simon Sinek", "Leadership", 12);
        Book book4 = new Book("Drive: The Surprising Truth About What Motivates Us", "Daniel H. Pink", "Motivation", 15);
        Book book5 = new Book("The 7 Habits of Highly Effective People", "Stephen R. Covey", "Leadership", 7);
        Book book6 = new Book("Thinking, Fast and Slow", "Daniel Kahneman", "Decision Making", 20);

///////////////////------------------Priority Queue (Implementation 1)------------------/////////////////////////////////////
        LibraryServiceImplementation librarianService = new LibraryServiceImplementation();
        System.out.println("-----------PRIORITY QUEQUE-----------");
        librarianService.teacherSeniorJuniorPriority(TeacherServiceImpl.teacher, StudentDetailsImpl.seniorStudentList, StudentDetailsImpl.juniorStudentList, book1);
        System.out.println();

        ///////////////////-----------------FIFO (FIRST IN FIRST OUT - Implementation 2)------------------/////////////////////////////////////
        System.out.println("FIFO");
        librarianService.firstComeFirstServed(TeacherServiceImpl.teacher, StudentDetailsImpl.seniorStudentList,  StudentDetailsImpl.juniorStudentList, book2);



////////////----------------WEEK 4---------(Implementation)////////////

        System.out.println("\n" + "////////////----------------WEEK 4---------(Implementation)////////////");
        LibraryImplementationTwo librarianServiceTwo = new LibraryImplementationTwo();


        ////////////----------------PRIORITY QUEUE----------(Implementation 1)////////////
        System.out.println("-----------PRIORITY QUEQUE-----------");
        librarianServiceTwo.teacherSeniorJuniorPriorityTwo(TeacherServiceImpl.teacher, StudentDetailsImpl.seniorStudentList, StudentDetailsImpl.juniorStudentList, book3);
        System.out.println();

        ///////////////////-----------------FIFO (FIRST IN FIRST OUT - Implementation 2)------------------/////////////////////////////////////
        System.out.println("----------------------------FIFO2-----------------------------");
        librarianServiceTwo.firstComeFirstServedTwo(TeacherServiceImpl.teacher, StudentDetailsImpl.seniorStudentList,  StudentDetailsImpl.juniorStudentList, book4);
        System.out.println();


    }
    }






