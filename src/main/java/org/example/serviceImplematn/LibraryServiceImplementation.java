package org.example.serviceImplematn;



import org.example.comparator.RoleComparator;
import org.example.entities.Book;
import org.example.entities.Person;
import org.example.enums.Role;
import org.example.services.LibraryService;


import java.util.*;

public class LibraryServiceImplementation implements LibraryService {
public  static List<Book> managementBooks = new ArrayList<>();





    @Override
    public List<Book> addBook(Book book ) {
        managementBooks.add(book);
        for (Book addBooks: managementBooks) {
            System.out.println(addBooks);
            //System.out.println("\n");
        }
return managementBooks;
    }

    //Priority Queue... In this program requested books are given based on role
    // The teacher comes first, Senior Student comes second then Junior Student
    @Override
    public boolean teacherSeniorJuniorPriority(List<Person> teacher, List<Person> seniorStudentList, List<Person> juniorStudentList, Book book ) {

        try {

            PriorityQueue<Person> person = new PriorityQueue<>(new RoleComparator());

            if (!teacher.isEmpty() && !juniorStudentList.isEmpty() && !seniorStudentList.isEmpty()) {
                person.add(teacher.get(3));
                person.add(teacher.get(2));
                person.add(juniorStudentList.get(2));
                person.add(seniorStudentList.get(3));
                person.add(juniorStudentList.get(2));
                person.add(seniorStudentList.get(1));
            }


            while (book.getQuantity() > 0 && !person.isEmpty()) {
                Person currentPerson = person.poll();
                if (currentPerson.getRole() == Role.Teacher || currentPerson.getRole() == Role.Senior_Student || currentPerson.getRole() == Role.Junior_Student) {
                    System.out.println(currentPerson.getFirstName() + ",a "+ currentPerson.getRole() + ",  Collected Book Titled: " + book.getTitle());

                    book.setQuantity(book.getQuantity() - 1);
                    System.out.println("The book titled: " + book.getTitle() + " remains " + book.getQuantity() + " copies");
                    System.out.println();


                }
            }
            if (book.getQuantity() == 0) {
                System.out.println("Not available at the moment: " + book.getTitle() + " TAKEN!");

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return true;
    }



    ////-----------FFO(FIRST IN FIRST OUT IMPLEMENTATION)----------////

    @Override
    public void firstComeFirstServed(List<Person> teacher, List<Person> seniorStudentList, List<Person> juniorStudentList, Book book) {


        try {

            Queue<Person> person = new LinkedList<>();
            if (!teacher.isEmpty() && !juniorStudentList.isEmpty() && !seniorStudentList.isEmpty()) {
                person.add(juniorStudentList.get(2));
                person.add(seniorStudentList.get(3));
                person.add(juniorStudentList.get(2));
                person.add(seniorStudentList.get(3));
                person.add(teacher.get(2));
                person.add(teacher.get(3));


            }
            while (book.getQuantity() > 0 && !person.isEmpty()) {
                Person currentPerson = person.poll();
                if (currentPerson.getRole() == Role.Senior_Student || currentPerson.getRole() == Role.Junior_Student || currentPerson.getRole() == Role.Teacher) {
                    System.out.println(currentPerson.getFirstName() + ", a " + currentPerson.getRole() + ", Collected Book Titled: " + book.getTitle());

                    book.setQuantity(book.getQuantity() - 1);
                    System.out.println("The book titled: " + book.getTitle() + " remains " + book.getQuantity() + " copies");
                    System.out.println();
                }
            }
            if (book.getQuantity() == 0) {

                System.out.println("All books titled: " + book.getTitle() + " TAKEN!");

            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

