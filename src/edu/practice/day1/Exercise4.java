package edu.practice.day1;

import java.util.Scanner;

public class Exercise4 {
    //국어 점수: 85
    //영어 점수: 90
    //수학 점수: 88
    //
    //평균: 87.67점
    //학점: B
    public void method4(){
        Scanner sc=new Scanner(System.in);
        System.out.print("국어 점수: ");
        int korean = sc.nextInt();
        System.out.print("영어 점수: ");
        int english = sc.nextInt();
        System.out.print("수학 점수: ");
        int math = sc.nextInt();

        double average = (korean + english + math)/3.0;
        char grade;
        if(average >= 90){
            grade = 'A';
        } else if(average >= 80){
            grade = 'B';
        } else if(average >= 70){
            grade = 'C';
        } else if(average >= 60){
            grade = 'D';
        } else {
            grade = 'E';
        }

        System.out.printf("국어 점수: %d\n영어 점수: %d\n수학 점수: %d\n\n평균: %.2f점\n학점: %s", korean, english, math, average, grade);
    }
}
/*
* %d : 정수(byte, short, int)
* %c : 문자(char)
* %s : 문자열(String)
* %b : 논리형(boolean)
* %f : 실수형(float/double)
* */