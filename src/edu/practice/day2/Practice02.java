package edu.practice.day2;

import java.util.Scanner;

/*
* 별표 삼각형
* */
public class Practice02 {
    public void method2() {
        /*높이를 입력하세요: 5
        *
        * *
        * **
        * ***
        * ****
        * *****
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("높이를 입력하세요: ");
        int height = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
