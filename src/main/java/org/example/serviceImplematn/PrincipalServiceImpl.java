package org.example.serviceImplematn;

import org.example.entities.Applicant;
import org.example.entities.Staff.Teacher;
import org.example.entities.Student;
import org.example.enums.Behaviour;
import org.example.enums.Qualification;
import org.example.services.PrincipalServices;

public class PrincipalServiceImpl implements PrincipalServices<Applicant, Teacher, String, Student> {

    @Override
    public String admitStudents(Applicant applicant) {
        if (applicant.getAge() < 20) {
            return "Congrats you are Admitted";
        } else {
            return "Sorry you can't proceed with your admission";
        }

//     return null;
    }

    @Override
    public String employTeacher(Teacher teacher) {
        if (teacher.getQualification().equals(Qualification.PHD)) {//|| ()) LAST DATE OF PROMOTION
            return "Congrats! You've employed as a Principal";
        } else if (teacher.getQualification().equals(Qualification.BSC)) {
            return "Congrats! You've been employed as a HOD";
        } else if (teacher.getQualification().equals(Qualification.HND)) {
            return "Congrats! You've been employed as a Subject Teacher";
        } else if (teacher.getQualification().equals(Qualification.OND)) {
            return "Non teaching staff";
        }
        return "You do not pass our employment criteria";
    }
//        return null;
//}
    @Override
    public String paySalary(Teacher teacher) {
        return null;
    }

    @Override
    public String awardOrExpels(Student student) {
        //condition to expel student;
        if (student.getBehaviour().equals(Behaviour.EXCEPTIONAL)) {//|| ()) LAST DATE OF PROMOTION
            return "Award of Excellence";
        } else if (student.getBehaviour().equals(Behaviour.VERY_GOOD)) {
            return "Keep it up";
        } else if (student.getBehaviour().equals(Behaviour.NOT_GOOD)) {
            return "You have been placed on two weeks Suspension";
        } else if (student.getBehaviour().equals(Behaviour.WORSE)) {
            return "You have been expelled";
        }
        return null;

    }

    @Override
    public String sackTeacher(Teacher teacher) {
        return null;
    }
}
//    @Override
//    public String admitStudents(Student student) {
//        if (student.getAge() < 20) {
//            return "Congrats you are Admitted";
//        } else {
//            return "Sorry you can't proceed with your admission";
//        }
//
//
//
//
//
//    @Override
//    public String employTeacher(Teacher teacher) {
//
//
//    @Override
//    public void paySalary(Principal principal, Teacher teacher) {
//
//    }
//
//    @Override
//    public void sackTeacher(Principal principal, Teacher teacher) {
//
//    }
//
//    @Override
//    public String awardOrExpel(Student student){
//        //condition to expel student;
//        if (student.getBehaviour().equals(Behaviour.EXCEPTIONAL)) {//|| ()) LAST DATE OF PROMOTION
//            return "Award of Excellence";
//        } else if (student.getBehaviour().equals(Behaviour.VERY_GOOD)) {
//            return "Keep it up";
//        } else if (student.getBehaviour().equals(Behaviour.NOT_GOOD)) {
//            return "You have been placed on two weeks Suspension";
//        } else if (student.getBehaviour().equals(Behaviour.WORSE)) {
//            return "You have been expelled";
//        }
//        return null;
//    }
//}
