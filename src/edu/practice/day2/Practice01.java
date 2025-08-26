package edu.practice.day2;

import java.util.Scanner;

public class Practice01 {
    /*
    * 문제 1번 : 짝수만 출력하기
    * */
    public void method1(){
        /*
        * 첫 번째 숫자: 3
        * 두 번째 숫자: 10
        *
        * 3부터 10까지의 짝수
        * 4 6 8 10
        */
        Scanner sc=new Scanner(System.in);
        System.out.print("첫 번째 숫자: ");
        int input1 = sc.nextInt();
        System.out.print("두 번째 숫자: ");
        int input2 = sc.nextInt();

        int min = Math.min(input1, input2);
        int max = Math.max(input1, input2);

        System.out.printf("%d부터 %d까지의 짝수\n",min,max);
        for (int i = min; i <= max; i++) {
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
