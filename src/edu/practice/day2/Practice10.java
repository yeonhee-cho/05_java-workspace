package edu.practice.day2;

import java.util.Scanner;

public class Practice10 {
    public void method10(){
        /*
        * TODO * 왜 중간에 자꾸 5개 이상이 나오는지 다시 확인 필요
        *  === 간단 로또 번호 생성기 ===
        * 생성된 번호: 3 7 12 18 20
        * 다시 생성하시겠습니까? (y/n): y
        * 생성된 번호: 1 5 9 15 19
        * 다시 생성하시겠습니까? (y/n): n
        * 프로그램을 종료합니다.
        * */
        Scanner sc = new Scanner(System.in);
        int[] lotto = new int[5];
        int randomNum;
        boolean isDuplicate;
        String playAgain;

        System.out.println("=== 간단 로또 번호 생성기 ===");
        System.out.print("생성된 번호: ");
        while(true) {
            for (int i = 0; i < 5; i++) {
                randomNum = (int) (Math.random() * 20) + 1;
                lotto[i] = randomNum;
                // 중복 제거
                if(i > 0){
                    if(lotto[i] == lotto[i-1]){
                        isDuplicate = true;
                        i--;
                    }
                }
                System.out.print(lotto[i] + " ");
            }

            System.out.print("\n다시 생성하시겠습니까? (y/n): ");
            playAgain = sc.nextLine();
            if(!playAgain.equals("y")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
