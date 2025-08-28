package edu.practice.day2;

import java.util.Arrays;
import java.util.Scanner;

public class Practice09 {
    public void method9(){
        /*
        * 배열 크기를 입력하세요 (1~10): 4
        * 1번째 숫자: 10
        * 2번째 숫자: 20
        * 3번째 숫자: 30
        * 4번째 숫자: 40
        *
        * 원본 배열: [10, 20, 30, 40]
        * 뒤집힌 배열: [40, 30, 20, 10]
        * */
        Scanner sc=new Scanner(System.in);
        int size;
        int[] original;
        int[] reversed;

        System.out.print("배열 크기를 입력하세요 (1~10): ");
        size = sc.nextInt();

        // 배열 크기 제한
        if(size < 1 || size > 10){
            System.out.println("1~10 사이의 숫자를 입력하세요.");
            return;
        }
        
        original = new int[size];
        reversed = new int[size];
        
        // 원본 배열 입력 받기
        for (int i = 0; i < original.length; i++) {
            System.out.printf("%d번째 숫자: ", (i + 1));
            original[i] = sc.nextInt();
        }

        // 배열 뒤집기
        for (int i = 0; i < size; i++) {
            reversed[i] = original[size - 1 - i];
        }

        System.out.println();
        System.out.println("원본 배열: " + Arrays.toString(original));
        System.out.println("뒤집힌 배열: " + Arrays.toString(reversed));
    }
}
