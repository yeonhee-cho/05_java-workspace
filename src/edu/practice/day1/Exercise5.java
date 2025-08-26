package edu.practice.day1;

import java.util.Scanner;

public class Exercise5 {
/*
* 출생년도를 입력하세요: 2000
*
* ========= 나이 정보 =========
* 출생년도    : 2000년
* 현재 나이   :   25세
* 10년 후     :   35세
* 성인 여부   :   true
* ============================
* */
    public void method5(){
        Scanner sc = new Scanner(System.in);

        System.out.print("출생년도를 입력하세요: ");
        int birthYear = sc.nextInt();

        final int CURRENT_YEAR = 2025;
        int currentAge = CURRENT_YEAR - birthYear;
        int futureAge = currentAge + 10;
        boolean isAdult = (currentAge >= 20);

        System.out.println("========= 나이 정보 =========");
        System.out.printf("출생년도    :   %d년\n", birthYear);
        System.out.printf("현재 나이   :   %d세\n", currentAge);
        System.out.printf("10년 후    :   %d세\n", futureAge);
        System.out.printf("성인 여부   :  %b\n", isAdult);
        System.out.println("============================");

        /*
        * - 띠 계산하기 (선택사항)
        * - 나이를 12로 나눈 나머지로 띠 판별
        * - int zodiacIndex = currentAge % 12
        * - 0:원숭이, 1:닭, 2:개, 3:돼지, 4:쥐, 5:소, 6:호랑이, 7:토끼, 8:용, 9:뱀, 10:말, 11:양
        * */

    }
}
/*
* %d : 정수(byte, short, int)
* %c : 문자(char)
* %s : 문자열(String)
* %b : 논리형(boolean)
* %f : 실수형(float/double)
* */