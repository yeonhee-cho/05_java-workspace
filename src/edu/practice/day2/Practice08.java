package edu.practice.day2;

import java.util.Scanner;

public class Practice08 {
    public void method8(){
        /*
        * 5명의 성적을 입력하세요.
        * 1번 학생: 85
        * 2번 학생: 92
        * 3번 학생: 78
        * 4번 학생: 96
        * 5번 학생: 84
        *
        * === 성적 통계 ===
        * 총점: 435점
        * 평균: 87.0점
        * 최고점: 96점
        * 최저점: 78점
        * */
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];
        int total = 0;
        int min, max;
        double average;

        System.out.print("5명의 성적을 입력하세요. : ");
        // 성적 입력받기
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d번 학생: ", i+1);
            scores[i] = sc.nextInt();
            total += scores[i];
        }


        average = (double)total / scores.length;

        min = scores[100];
        max = scores[0];

        for (int i = 0; i < scores.length; i++) {
            min = Math.min(scores[i], min);
            max = Math.max(scores[i], max);
        }

        System.out.println();
        System.out.println("=== 성적 통계 ===");
        System.out.println("총점: " + total + "점");
        System.out.println("평균: " + average + "점");
        System.out.println("최고점: " + max + "점");
        System.out.println("최저점: " + min + "점");
    }
}
