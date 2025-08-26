package edu.practice.day2;

import java.util.Scanner;

public class Practice {
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

    /*
    * 문제 4번 : 소수 판별기
    * */
    public void method4(){
        Scanner sc=new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int number = sc.nextInt();
        boolean isPrime;
        for (int i = 2; i <= number; i++) {
//            if(i%) {
//                System.out.printf("%d은 소수입니다.\n", number);
//            } else{
//                if(number % i == 0) isPrime = false; break;
//            }
        }
    }

    /*
    * 문제 6번 : 숫자 맞히기 게인(1~50)
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
