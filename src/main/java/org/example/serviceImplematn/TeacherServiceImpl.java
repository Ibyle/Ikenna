package org.example.serviceImplematn;

import org.example.entities.Person;
import org.example.entities.Staff.Teacher;
import org.example.entities.Student;
import org.example.enums.Role;
import org.example.services.TeacherServices;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TeacherServiceImpl implements TeacherServices {


    @Override
    public void conductExams(Student student) {
if (student.getScore()>= 80 && student.getScore()<=100){
    System.out.println("A");
}else if(student.getScore() >= 65 && student.getScore()<=79){
            System.out.println("B");
        } else if(student.getScore() >= 50 && student.getScore()<=64) {
    System.out.println("C");
}else if(student.getScore() >= 45 && student.getScore()<=49){
    System.out.println("D");
        }else {
    System.out.println("F");
        }
    }

    @Override
    public void teachesCourses(Teacher teacher, Student student) {

    }

    public static List<Person> teacher = new ArrayList<>();

    public static List<Person> readExcelDetail(String filePath) {

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean firstLine = true; // Skip the header row
            while ((line = br.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }
                String[] values = line.split(",");
                if (values.length == 4) {
                    Person user = new Person();
                    user.setTeacherId(values[0].trim());
                    user.setEmail(values[1].trim());
                    user.setFirstName(values[2].trim());
                    user.setLastName(values[3].trim());
                    user.setRole(Role.Teacher);

                    teacher.add(user);
                    System.out.println("TEACHER ID: " + user.getTeacherId() + ",             Email: " + user.getEmail() + ",                 FirstName: " + user.getFirstName() + ",              LastName: " + user.getLastName());
                    // }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return teacher;
    }
}


