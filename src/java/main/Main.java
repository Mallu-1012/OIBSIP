package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("no of students");
        int n=sc.nextInt();
        Student[] students=new Student[n];
        for(int i=0;i<n;i++){
            System.out.println("enter name,id,marks");
            String name=sc.next();
            int id=sc.nextInt();
            int marks=sc.nextInt();
            students[i]=new Student(name,id,marks);
        }
        double avg=0;
        for(Student s:students){
            avg+=s.marks/n;
        }
        System.out.println("average marks :"+avg);



    }
}
