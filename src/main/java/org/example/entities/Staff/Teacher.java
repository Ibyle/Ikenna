package org.example.entities.Staff;

import lombok.Getter;
import org.example.entities.Person;
import org.example.enums.CourseName;
import org.example.enums.Qualification;

@Getter
public class Teacher extends Person {
    private String certification;
    private String Specification;
    private String teacherId;
    private CourseName coursesName;
    private Qualification qualification;

    public Teacher(String michael, Qualification qualification) {
        super();
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public void setSpecification(String specification) {
        Specification = specification;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public void setCoursesName(CourseName coursesName) {
        this.coursesName = coursesName;
    }

    public void setQualification(Qualification qualification) {

        this.qualification = qualification;
    }

    public Teacher(String certification, String specification, String teacherId, CourseName coursesName, Qualification qualification) {
        this.certification = certification;
        Specification = specification;
        this.teacherId = teacherId;
        this.coursesName = coursesName;
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "certification='" + certification + '\'' +
                ", Specification='" + Specification + '\'' +
                ", teacherId='" + teacherId + '\'' +
                ", coursesName=" + coursesName +
                ", qualification=" + qualification +
                '}';
    }


//        int score = 86;
//        int maxScore = 100;
//        double percentage = (score / (double) maxScore) * 100;
//        if (percentage >= 90) {
//            System.out.println("A");
//        } else if (score >= 80) {
//            System.out.println("B");
//        } else if (score >= 70) {
//            System.out.println("C");
//        } else if (score >= 60) {
//            System.out.println("C-");
//        } else {
//            System.out.println("Try better next time");

        }



