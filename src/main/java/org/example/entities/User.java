package org.example.entities;

import lombok.Data;
import lombok.Getter;
import org.example.enums.Nationality;
import org.example.enums.State;

import javax.management.relation.Role;
import java.time.LocalDate;

@Getter
@Data
public abstract class User {
    @Getter
    private String firstName;
    private String lastName;
    private String name;
    @Getter
    private int age;
    private Long phoneNumber;
    private LocalDate dob;
    private Nationality nationality;
    private State state;
    private String email;
//    private Role role;

//    public void setRole(Role role) {
//        this.role = role;
//    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", dob=" + dob +
                ", nationality=" + nationality +
                ", state=" + state +
                ", email='" + email + '\'' +
                '}';
    }
}


