package org.example.serviceImplematn;

import org.example.comparator.RoleComparator;
import org.example.entities.Book;
import org.example.entities.Person;
import org.example.enums.Role;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.example.services.LibraryServiceTwo;

public class LibraryImplementationTwo implements LibraryServiceTwo {
    public static List<Book> managementBooks = new ArrayList<>();

    @Override
    public List<Book> addBooks(Book book) {
        managementBooks.add(book);
        // Use forEach and method reference to print each book
        managementBooks.forEach(System.out::println);
        return managementBooks;
    }

    @Override
    public void teacherSeniorJuniorPriorityTwo(List<Person> teacher, List<Person> seniorStudentList,
                                               List<Person> juniorStudentList, Book book) {
        try {
            // Using Stream API to create a PriorityQueue with RoleComparator
            PriorityQueue<Person> person = Stream.of(teacher.get(3), teacher.get(2), juniorStudentList.get(2), seniorStudentList.get(3), juniorStudentList.get(2), seniorStudentList.get(1))
                    .collect(Collectors.toCollection(() -> new PriorityQueue<>(new RoleComparator())));

            // Using forEach and lambda expression to iterate over the stream
            person.stream()
                    .filter(currentPerson -> Arrays.asList(Role.Teacher, Role.Senior_Student, Role.Junior_Student)
                            .contains(currentPerson.getRole()))

                    .forEach(currentPerson -> {System.out.println(currentPerson.getFirstName()
                            + ", a " + currentPerson.getRole() + ", Collected Book Titled: " + book.getTitle());
                        book.setQuantity(book.getQuantity() - 1);
                        System.out.println("The book titled: " + book.getTitle() + " remains " +
                                book.getQuantity() + " copies\n");
                    });

            // Using if statement instead of while loop
            if (book.getQuantity() == 0) {
                System.out.println("Not available at the moment: " + book.getTitle() + " TAKEN!");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void firstComeFirstServedTwo(List<Person> teacher, List<Person> seniorStudentList, List<Person> juniorStudentList, Book book) {
        try {
            // Using Stream to create a Queue with LinkedList
            Queue<Person> person = Stream.of(juniorStudentList.get(2), seniorStudentList.get(3), juniorStudentList.get(2), seniorStudentList.get(3),
                            teacher.get(2), teacher.get(3))
                    .collect(Collectors.toCollection(LinkedList::new));


            // Using forEach and lambda expression to iterate over the stream
            person.stream()
                    .filter(currentPerson -> Arrays.asList(Role.Senior_Student, Role.Junior_Student, Role.Teacher)
                            .contains(currentPerson.getRole()))
                    .forEach(currentPerson -> {
                        System.out.println(currentPerson.getFirstName() + ", a " + currentPerson.getRole() +
                                ", Collected Book Titled: " + book.getTitle());
                        book.setQuantity(book.getQuantity() - 1);
                        System.out.println("The book titled: " + book.getTitle() + " remains " +
                                book.getQuantity() + " copies\n");
                    });

            // Using if statement instead of while loop
            if (book.getQuantity() == 0) {
                System.out.println("All books titled: " + book.getTitle() + " TAKEN!");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
