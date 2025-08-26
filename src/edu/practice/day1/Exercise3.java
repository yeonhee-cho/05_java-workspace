package edu.practice.day1;

import java.util.Scanner;

public class Exercise3 {
    /*
    * 섭씨온도를 입력하세요: 25.5
    * 섭씨 25.5도는 화씨 77.9도입니다.
    * 화씨 = 섭씨 * 9 / 5 + 32 , 소수점 첫째 자리까지
    * */

    // 클래스에서 변수이름을 설정 할 때를 제외하고 모두 메서드 형태로 작성
    public void method3(){
        Scanner sc=new Scanner(System.in);
        System.out.print("섭씨온도를 입력하세요: ");
        double celsius = sc.nextDouble();
        double fahrenheit = celsius * 9 / 5 + 32;

        System.out.printf("섭씨온도를 입력하세요: %.1f\n", celsius);
        System.out.printf("섭씨 %.1f 도는 화씨 %.1f 도입니다.", celsius, fahrenheit);

        // 상수(`final`)를 사용하여 변환 계수들을 정의해보세요
        // final double RATIO = 9.0 / 5.0
        // final int OFFSET = 32
    }

    public void method3_2(){
        Scanner sc=new Scanner(System.in);
        System.out.print("섭씨온도를 입력하세요: ");
        double celsius = sc.nextDouble();

        // 상수(`final`)를 사용하여 변환 계수들을 정의해보세요
        // final double RATIO = 9.0 / 5.0
        // final int OFFSET = 32

        final double RATIO = 9.0 / 5.0;
        final int OFFSET = 32;

        double fahrenheit = celsius * RATIO + OFFSET;

        System.out.printf("섭씨온도를 입력하세요: %.1f\n", celsius);
        System.out.printf("섭씨 %.1f 도는 화씨 %.1f 도입니다.", celsius, fahrenheit);
    }
}
/*
* %d : 정수(byte, short, int)
* %c : 문자(char)
* %s : 문자열(String)
* %b : 논리형(boolean)
* %f : 실수형(float/double)
* */