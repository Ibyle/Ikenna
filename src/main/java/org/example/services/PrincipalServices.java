package org.example.services;

import org.example.entities.Staff.Principal;
import org.example.entities.Staff.Teacher;
import org.example.entities.Student;

public interface PrincipalServices <A, T, P, S> {
    P admitStudents(A a);
    P employTeacher(T t);
    P paySalary(T t);
    P awardOrExpels(S s);
    P sackTeacher(T t);

}
