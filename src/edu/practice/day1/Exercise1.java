package edu.practice.day1;

import java.util.Scanner;

/*
* 개인 정보 출력 기능 작성 클래스
* */
public class Exercise1 {

    public void method1(){
        // 입력해서 출력할 경우
        /*
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        System.out.print("키 : ");
        double height = sc.nextDouble();
        System.out.print("성별 : ");
        char gender= sc.next().charAt(0);
        System.out.print("취미 : ");
        String hobby = sc.next();
        */

        // 저장된 내용으로 출력할 경우
        String name = "김자바";
        int age = 25;
        double height = 175.5;
        char gender = 'M';
        String hobby = "프로그래밍";

        /*
         * %d : 정수(byte, short, int)
         * %c : 문자(char)
         * %s : 문자열(String)
                * %b : 논리형(boolean)
         * %f : 실수형(float/double)
         * */
        System.out.printf("=== 개인정보 ===\n 이름: %s\n 나이: %d세\n 키: %.1fcm\n 성별: %c\n 취미: %s\n",name, age, height, gender, hobby);
    }
}
