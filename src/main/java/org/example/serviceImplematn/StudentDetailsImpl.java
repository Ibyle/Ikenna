package org.example.serviceImplematn;

import org.example.entities.Book;
import org.example.entities.Person;
import org.example.entities.Student;
import org.example.enums.Role;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentDetailsImpl {
    public static List<Person> juniorStudentList = new ArrayList<>();
    public static List<Person> seniorStudentList = new ArrayList<>();

    public static List<Person> student = new ArrayList<>();

    public static List<Person> readExcelDetails(String pathname, String sheetName){

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(pathname))){
            String read;
            boolean firstline = true;
            while((read= bufferedReader.readLine())!= null){
                if(firstline){
                    firstline=false;
                    continue;
                }
                String[]std = read.split(",");
                if (std.length == 7){
                    Person students = new Person();
                    students. setStudentId(Integer.parseInt(std[0].trim()));
                    students.setFirstName(std[1].trim());
                    students.setLastName(std[2].trim());
                    students.setGradeLevel(Integer.parseInt(std[3].trim()));
                    students.setEmail(std[4].trim());
                    students.setGuardianEmail1(std[5].trim());
                    students.setGuardianEmail2(std[6].trim());
                    if(students.getGradeLevel()<=2){
                        students.setRole(Role.Junior_Student);
                        juniorStudentList.add(students);

                    }else{
                        students.setRole(Role.Senior_Student);
                        seniorStudentList.add(students);
                    }

                    student.add(students);

                    System.out.println("Student ID:       " + students.getStudentId()+  " ,              FirstName:       " + students.getFirstName() + " ,              LastName:       " + students.getLastName()+ " ,              GradeLevel:       " + students.getGradeLevel() + ",              Email:       " + students.getEmail() + " ,              GuardianEmail:       "+ students.getGuardianEmail1()+ " ,              GuardianEmail2:       "+ students.getGuardianEmail2() );
                }


            }


        }catch (IOException e){
            e.printStackTrace();
        }
        return student;
    }


}

