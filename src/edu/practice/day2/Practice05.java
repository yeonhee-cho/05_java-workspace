package edu.practice.day2;

import java.util.Scanner;

/*
* 구구단 선택기
* */
public class Practice05 {
    public void method5() {
        /*
         *
         * === 구구단 프로그램 ===
         * 1. 특정 단 출력
         * 2. 전체 구구단 출력
         * 0. 종료
         * 선택: 1
         * 몇 단을 출력하시겠습니까? 7
         * [7단]
         * 7 × 1 = 7
         * 7 × 2 = 14
         * ...
         * 7 × 9 = 63
         * */
        /*
        * """ """ <pre></pre> 같은 출력 구문
        * */
        Scanner sc = new Scanner(System.in);
        // 방법 1
        System.out.print("선택: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("몇 단을 출력하시겠습니까? :");
                int dan = sc.nextInt();
                System.out.println("[" + dan + " ]단");
                for (int i = 1; i <= 9; i++){
                    System.out.printf("%d X %d = %d\n", dan, i, dan * i);
                }
            case 2:
                System.out.println("=== 전체 구구단 ===");
                for (int j = 2; j <= 9; j++){
                    for (int i = 1; i <= 9; i++){
                        System.out.printf("%d X %d = %d\n", j, i, j * i);
                    }
                    System.out.println();
                }
                break;
            case 0:
                System.out.println("프로그램을 종료합니다.");
                return; // while 구문 탈출해서 기능 중지
            default:
                System.out.println("잘못된 선탣입니다. 다시 선택해주세요.");
        }


        // 방법 2
        /*
        int choice;
        int dan;
        System.out.println("=== 구구단 프로그램 ===\n" + "1. 특정 단 출력\n" + "2. 전체 구구단 출력\n" + "0. 종료\n");
        System.out.print("선택: ");
        choice = sc.nextInt();

        do{
            if (choice > 2 || choice < 0){
                // 그 외
                System.out.println("다시 입력해주세요.");
            } else if(choice == 1) {
                System.out.print("몇 단을 출력하시겠습니까? ");
                dan = sc.nextInt();
                // 특정 단 출력
                for (int i = 1; i <= 9; i++){
                    System.out.printf("%d X %d = %d\n", dan, i, dan * i);
                }
            } else if(choice == 2){
                // 전체 구구단 출력
                for (int i = 2; i <= 9; i++){
                    for (int j = 1; j <= 9; j++){
                        System.out.printf("%d X %d = %d\n", i, j, i * j);
                    }
                    System.out.println();
                }
                break;
            } else {
                // 종료
                System.out.println("종료");
                break;
            }
        } while(true);
        */
    }


}
