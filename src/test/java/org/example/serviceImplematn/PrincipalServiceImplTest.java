package org.example.serviceImplematn;

import org.example.entities.Applicant;
import org.example.entities.Student;
import org.example.enums.Behaviour;
import org.junit.jupiter.api.Test;

import static org.example.serviceImplematn.StudentDetailsImpl.student;
import static org.junit.jupiter.api.Assertions.*;

class PrincipalServiceImplTest {
    PrincipalServiceImpl principalService = new PrincipalServiceImpl();


    @Test
    void awardOrExpelIfStudentIsEXCEPTIONAL() {
        Student student = new Student();
        student.setBehaviour(Behaviour.EXCEPTIONAL);
        assertEquals("Award of Excellence",principalService.awardOrExpels(student));

    }
    @Test
    void awardOrExpelIfStudentIsVERY_GOOD() {
        Student student = new Student();
        student.setBehaviour(Behaviour.VERY_GOOD);
        assertEquals("Keep it up",principalService.awardOrExpels(student));

    }@Test
    void awardOrExpelIfStudentIsNOT_GOOD() {
        Student student = new Student();
        student.setBehaviour(Behaviour.NOT_GOOD);
        assertEquals("You have been placed on two weeks Suspension",principalService.awardOrExpels(student));

    }
    @Test
    void awardOrExpelIfStudentIsWORSE() {
        Student student = new Student();
        student.setBehaviour(Behaviour.WORSE);
        assertEquals("You have been expelled",principalService.awardOrExpels(student));

    }

    //////////TEST TO ADMIT Students less than 20 years///////////
    @Test
    void admitStudentsIfAgeIsLessThan20() {
        Applicant applicant = new Applicant();
        applicant.setAge(15);
        assertEquals("Congrats you are Admitted",principalService.admitStudents(applicant));
    }


}