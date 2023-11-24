package org.example.entities.Staff;

import lombok.Getter;
import org.example.entities.Applicant;

import javax.management.relation.Role;
import java.math.BigDecimal;

@Getter
public class Principal extends Staff{
    public Principal(String james) {
        super();
    }
//    public Principal(Role role, BigDecimal staffSalary) {
//        super(role, staffSalary);
//    }

    public void setSpecialization(String specialization) {

        this.specialization = specialization;
    }

    private String professionalLevel;
    private String specialization;
    private String expelStudent;

    public void setExpelStudent(String expelStudent) {
        this.expelStudent = expelStudent;

    }

    @Override
    public String toString() {
        return "Principal{" +
                "professionalLevel='" + professionalLevel + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }

    public void setProfessionalLevel(String professionalLevel) {

        this.professionalLevel = professionalLevel;


    }
}