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
        // 변수 이름을 선언하거나 변수이름에 데이터를 넣는 것은 
        // 메서드 내부에 작성하지 않고 보통은 class 파일이름 바로 아래 작성
        int korean, english, math;
        double average;

        Scanner sc=new Scanner(System.in);
        System.out.print("국어 점수: ");
        korean = sc.nextInt();
        System.out.print("영어 점수: ");
        english = sc.nextInt();
        System.out.print("수학 점수: ");
        math = sc.nextInt();

        average = (korean + english + math)/3.0;
        char grade;
        if(average >= 90) grade = 'A';
        if(average >= 90) grade = 'B';
        else if(average >= 80) grade = 'C';
        else if(average >= 70) grade = 'D';
        else if(average >= 60) grade = 'E';
        else grade = 'F';

        // NOTE 이러면 안나와요
//        if (average > 90) grade = 'A';
//        else if (average < 90) grade = 'B';
//        else if (average < 80) grade = 'C';
//        else if (average < 70) grade = 'D';
//        else if (average < 60) grade = 'E';
//        else  grade = 'F';



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