
package org.example.entities;

import lombok.Getter;
import org.example.enums.Behaviour;

import java.util.HashSet;


    @Getter
    public class Student {

        private final String name;
        @Getter
        private int age;
        @Getter
        private Behaviour behaviour;
        @Getter
        private int Score;

        private final HashSet<Course> courses;

        public Student(String name, int age) {
            this.name = name;
            this.courses = new HashSet<>();
        }

        public Student() {

            courses = null;
            name = null;
        }

        public void addCourse(Course course) {
            courses.add(course);

        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setBehaviour(Behaviour behaviour) {
            this.behaviour = behaviour;
        }

        public void setScore(int score) {
            Score = score;
        }
    }








//    public void setCourseTaken(String courseTaken) {
//
//        this.courseTaken = courseTaken;
//    }
//
//    private String character;
//
//
//    public void setClassTeacher(String classTeacher) {
//        this.classTeacher = classTeacher;
//
//    }
//
//    public void setStudentId(int studentId) {
//        this.studentId = studentId;
//
//    }
//
//
//    public void setStudentClass(String studentClass) {
//        this.studentClass = StudentClass.valueOf(studentClass);
//
//    }
//
//    public void setCharacter(String character) {
//        this.character = character;
//
//    }
//
//    public void setScore(int score) {
//        Score = score;
//    }
//
//    public int getScore(int score) {
//        return Score;
//    }
//    @Override
//    public String toString() {
//        return "Student{" +
//                "studentId=" + studentId +
//                ", courseTaken='" + courseTaken + '\'' +
//                ", classTeacher='" + classTeacher + '\'' +
//                ", studentClass='" + studentClass + '\'' +
//                ", behavior'" + behaviour + '\'' +
//                '}';
//    }
//    @Override
//public boolean equals(Object o){
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass())
//            return false;
//        Student student =(Student) o;
//        return studentId == student.studentId && courseTaken == student.courseTaken && classTeacher == student.classTeacher && studentClass == student.studentClass && character==student.character);
//    }
//    public void expulsionStudent() {
//        //condition to expel student;
//        Student ben = new Student();
//        if (character == "Excellent")
//            System.out.println("Great Conduct!!keep it up");
//        else {
//            System.out.println("Sorry! We do not breed animal");













