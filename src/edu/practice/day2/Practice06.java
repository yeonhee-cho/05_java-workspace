package edu.practice.day2;

import java.util.Scanner;

public class Practice06 {
    /*
     * 문제 6번 : 숫자 맞히기 게임(1~50)
     * */
    public void method6(){
        /*
         * 1~50 사이의 숫자를 맞혀보세요!
         * 시도 1/7: 25
         * 입력한 숫자보다 정답이 큽니다.
         * 시도 2/7: 40
         * 입력한 숫자보다 정답이 작습니다.
         * 시도 3/7: 32
         * 정답입니다! 정답: 32, 시도횟수: 3회
         */
        Scanner sc = new Scanner(System.in);
        int answer = (int) Math.floor(Math.random()*50)+1;
        System.out.println(answer);
        int input;
        int count = 0;
        final int MAX_TRIES = 7;
        System.out.println("1~50 사이의 숫자를 맞혀보세요!");
        while(count < MAX_TRIES){
            System.out.print("숫자 입력: ");
            input = sc.nextInt();
            System.out.printf("시도 %d/7: %d\n", count + 1, input);
            count++;
            if(input == answer){
                System.out.printf("정답입니다! 정답: %d, 시도횟수: %d회\n", answer, count);
                break;
            }
        }
    }
}
