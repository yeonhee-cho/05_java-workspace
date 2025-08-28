package edu.practice.day2;

import java.util.Arrays;
import java.util.Scanner;

public class Practice10 {
    public void method10(){
        /*
        * // TODO * 왜 중간에 자꾸 6개 이상이 나오는지 다시 확인 필요
        *  === 간단 로또 번호 생성기 ===
        * 생성된 번호: 3 7 12 18 20
        * 다시 생성하시겠습니까? (y/n): y
        * 생성된 번호: 1 5 9 15 19
        * 다시 생성하시겠습니까? (y/n): n
        * 프로그램을 종료합니다.
        * */
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 간단 로또 번호 생성기 ===");

        int[] lotto = new int[6];
        int randomNum;
        boolean isDuplicate;
        String playAgain;

        System.out.print("생성된 번호: ");
        while(true){
            // 6개의 중복되지 않은 번호 생성
            for (int i = 0; i < lotto.length; i++) {
                while(true) { // 중복 검사 확인
                    randomNum = (int)(Math.random() * 45) + 1;
                    boolean isDuplicated = false;
                    for (int j = 0; j < i; j++) {
                        if(lotto[j] == randomNum) {
                            isDuplicated = true; // 랜덤번호가 기존 번호들이랑 동일하다면
                            break; // 중복을 찾았으니 for문 탈출
                        }
                    }

                    // 중복되지 않았다면 번호를 배열에 저장
                    if(!isDuplicated) {
                        lotto[i] = randomNum;
                        break;
                    }
                }
            }
            // 생성된 번호 출력
            System.out.println("생성된 번호 : " + Arrays.toString(lotto));
            System.out.print("\n다시 생성하시겠습니까? (y/n): ");
            playAgain = sc.nextLine();
            if(!playAgain.equals("y")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
