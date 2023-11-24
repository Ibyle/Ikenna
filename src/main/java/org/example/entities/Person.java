package org.example.entities;

import lombok.Getter;
import org.example.enums.Role;


@Getter
public class Person {
    private int StudentId;
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private String email;
    private String guardianEmail1;
    private String guardianEmail2;
    private String teacherId;
    private String isArchived;
    private String isDeleted;
    private Role role;

    public void setRole(Role role) {
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public void setStudentId(int studentId) {

        StudentId = studentId;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public void setGradeLevel(int gradeLevel) {

        this.gradeLevel = gradeLevel;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public void setGuardianEmail1(String guardianEmail1) {

        this.guardianEmail1 = guardianEmail1;
    }

    public void setGuardianEmail2(String guardianEmail2) {

        this.guardianEmail2 = guardianEmail2;
    }

    public void setTeacherId(String teacherId) {

        this.teacherId = teacherId;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    //    @Override
//    public String toString() {
//        return "User{" +
//                "StudentId=" + StudentId +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", gradeLevel=" + gradeLevel +
//                ", email='" + email + '\'' +
//                ", guardianEmail1='" + guardianEmail1 + '\'' +
//                ", getGuardianEmail2='" + getGuardianEmail2() + '\'' +
//                ", teacherId='" + teacherId + '\'' +
//                '}';

    @Override
    public String toString() {
        return "Person{" +
                "StudentId=" + StudentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gradeLevel=" + gradeLevel +
                ", email='" + email + '\'' +
                ", guardianEmail1='" + guardianEmail1 + '\'' +
                ", guardianEmail2='" + guardianEmail2 + '\'' +
                ", teacherId='" + teacherId + '\'' +
                ", isArchived='" + isArchived + '\'' +
                ", isDeleted='" + isDeleted + '\'' +
                '}';
    }


        public String toCSV () {

            return teacherId + "," + email + "," + firstName + "," + lastName;
            // Modify this line based on the properties of the Person class
        }

    public void setIsArchived(String isArchived) {
    }
}

