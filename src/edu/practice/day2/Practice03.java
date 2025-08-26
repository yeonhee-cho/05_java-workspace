package edu.practice.day2;

import java.util.Scanner;

public class Practice03 {
    public void method3(){
        /*
        * 팩토리얼을 구할 숫자를 입력하세요: 5
        * 5! = 5 × 4 × 3 × 2 × 1 = 120
        * */
        Scanner sc=new Scanner(System.in);
        System.out.print("팩토리얼을 구할 숫자를 입력하세요: ");
        int number = sc.nextInt();
        int factorial = 1;

        // 계산 과정을 넣기 위한 문자열 변수
        String process ="";

        // number부터 1까지 내려가면서 계산
        for (int i = number; i >= 1; i--) {
            factorial *= i;
            process += i; // 문자열에 현재 숫자(i)를 추가
            if(i>1){
                process += " x ";
            }
        }
        // for문 탈출 후
        System.out.printf("%d! = %s = %d \n",number, process, factorial);
    }
}
