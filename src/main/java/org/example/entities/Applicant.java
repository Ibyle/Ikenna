package org.example.entities;

import lombok.Getter;

@Getter
public class Applicant extends User {
    private long applicantId;


    public void setApplicantId(long applicantId) {

        this.applicantId = applicantId;
    }


    public void applicantStatus(){
        Applicant applicant = new Applicant();
        if (applicant.getAge() >9 && applicant.getAge() <=18)
            System.out.println("Congrats! you've been admitted");
        else{
            System.out.println("Go to adult school");
        }

    }

    public static void main(String[] args) {
        Applicant applicant = new Applicant();
        applicant.applicantStatus();
    }
}
