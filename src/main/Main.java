package main;

import student.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] nameSubjects = {"BD", "WEB", "JAVA", "PM", "CISCO", "DOC", "DOP"};

        Student[] students = new Student[nameSubjects.length];

        for (int i = 0; i < students.length; i++)
        {

            Scanner sc = new Scanner(System.in);

            P.print("Enter name of student: ");

            String name = sc.nextLine();

            P.print("Enter surname of student: ");

            String surname = sc.nextLine();

            students[i] = new Student(i + 1,name,surname,"KB-71",nameSubjects);



        }

        for (Student student : students)
        {

            P.println("studentID: " + student.getId() + "\n" + "Name: " + student.getName() + "\n" + "Surname: " + student.getSurname() + "\n" + "Group: " + student.getGroup());

            System.out.printf("AverageMark: %.1f\n",student.averageMark());

            student.displaySubjects();

            P.println("");

        }

        Student bestStudent = UTIL.getTheBestStudent(students);

        System.out.printf("The best mark has %s %s from %s. He has %.1f.\n",bestStudent.getName(),bestStudent.getSurname(),bestStudent.getGroup(),bestStudent.averageMark());



    }
}
