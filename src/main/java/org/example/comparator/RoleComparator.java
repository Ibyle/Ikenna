package org.example.comparator;

import org.example.entities.Person;
import org.example.entities.User;
import org.example.enums.Role;

import java.util.Comparator;

    public class RoleComparator implements Comparator<Person> {


        @Override
        public int compare(Person person1,  Person person2) {
            if (person1.getRole() == Role.Teacher) {
                return -1;
            } else if (person2.getRole() == Role.Teacher) {
                return 1;
            } else if (person1.getRole() == Role.Senior_Student) {
                return -1;
            } else if (person2.getRole() == Role.Senior_Student) {
                return 1;
            } else {
                return 0;
            }
        }
    }


