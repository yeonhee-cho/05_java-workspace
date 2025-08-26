package edu.practice.day1;

import java.util.Scanner;

public class Exercise2 {
    /*
    * 첫 번째 정수 입력: 10
    * 두 번째 정수 입력: 3
    *
    * === 계산 결과 ===
    * 10 + 3 = 13
    * 10 - 3 = 7
    * 10 * 3 = 30
    * 10 / 3 = 3.33
    * */
    public void method2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 입력: ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수 입력: ");
        int num2 = sc.nextInt();
        int add = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        double div = (double)num1 / num2;
        System.out.println("=== 계산 결과 ===");
        System.out.printf("%d + %d = %d\n", num1, num2, add);
        System.out.printf("%d - %d = %d\n", num1, num2, sub);
        System.out.printf("%d * %d = %d\n", num1, num2, mul);
        System.out.printf("%d / %d = %.2f\n", num1, num2, div);
        /*
        * %d 가 아니라 %.2f를 사용해야 함
        * 오류 내용 : Exception in thread "main" java.util.IllegalFormatConversionException: d != java.lang.Double
        * */

        // 한 번에 쓰기
        System.out.printf("=== 계산 결과 ===\n 더하기 : %d, 빼기 : %d, 곱하기 : %d, 나누기 : %.2f", add, sub, mul, div);

        System.out.println();
    }
}
/*
 * %d : 정수(byte, short, int)
 * %c : 문자(char)
 * %s : 문자열(String)
 * %b : 논리형(boolean)
 * %f : 실수형(float/double)
 * */