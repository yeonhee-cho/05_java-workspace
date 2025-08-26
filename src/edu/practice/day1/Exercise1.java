package edu.practice.day1;

import java.util.Scanner;

public class Exercise1 {

    public void method1(){
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
        /*
         * %d : 정수(byte, short, int)
         * %c : 문자(char)
         * %s : 문자열(String)
                * %b : 논리형(boolean)
         * %f : 실수형(float/double)
         * */
        System.out.printf("=== 개인정보 ===\n 이름: %s\n 나이: %d세\n 키: %.1fcm\n 성별: %c\n 취미: %s",name, age, height, gender, hobby);
    }
}
