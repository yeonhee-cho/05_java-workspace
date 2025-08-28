package edu.practice.day2;

import java.util.Scanner;

public class Practice04 {
    /*
     * 문제 4번 : 소수 판별기
     * */
    public void method4(){
        Scanner sc=new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int number = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0){
                isPrime = false;
                System.out.printf("%d는 소수가 아닙니다.\n", number);
                break;
            }
        }
        if (isPrime) {
            System.out.printf("%d는 소수입니다.\n", number);
        }
    }
}
