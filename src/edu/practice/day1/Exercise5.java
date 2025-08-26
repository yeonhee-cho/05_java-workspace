package edu.practice.day1;

import java.util.Scanner;

/*
* 나이 계산 및 정보 출력
* */
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
    /*
    * 기본 요구사항 버전 기능
    * */
    public void method5(){
        Scanner sc = new Scanner(System.in);

        System.out.print("출생년도를 입력하세요: ");
        int birthYear = sc.nextInt();

        // 상수 선언 현재 년도
        final int CURRENT_YEAR = 2025;
        // 나이 계산
        // 현재 년도 - 태어난 년도
        int currentAge = CURRENT_YEAR - birthYear;
        // 10년 후 나이 현재 나이 + 10
        int futureAge = currentAge + 10;
        boolean isAdult = (currentAge >= 20);

        System.out.println("========= 나이 정보 =========");
        System.out.printf("출생년도    :   %d년\n", birthYear);
        System.out.printf("현재 나이   :   %4d세\n", currentAge);
        System.out.printf("10년 후    :   %4d세\n", futureAge);
        System.out.printf("성인 여부   :  %7s\n", isAdult);
        System.out.println("============================");
    }
    /*
    * 추가 요구사항 버전 기능
    * */
    public void method5_2(){
        Scanner sc = new Scanner(System.in);

        System.out.print("출생년도를 입력하세요: ");
        int birthYear = sc.nextInt();

        // 상수 선언 현재 년도
        final int CURRENT_YEAR = 2025;
        // 나이 계산
        // 현재 년도 - 태어난 년도
        int currentAge = CURRENT_YEAR - birthYear;
        // 10년 후 나이 현재 나이 + 10
        int futureAge = currentAge + 10;
        boolean isAdult = (currentAge >= 20);

        // 띠 계산
        // 현재나이 % 12를 하면 해당하는 띠의 숫자로 계산됨
        // + 더하기 - 빼기 * 곱하기 / 나누기(몫) % 나누기(나머지)
        // int zodiacIndex = currentAge % 12; // 현재 나이이므로 띠가 변환되어 나타남
        int zodiacIndex = birthYear % 12; // 태어난 년도는 변하지 않기 때문에 변환되지 않음
        String[] zodiacAnimals = {
                "원숭이", "닭", "개", "돼지", "쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양"
        };

        String zodiac = zodiacAnimals[zodiacIndex];

        // 출생에 해당하는 띠를 포함해서 출력
        System.out.println("========= 나이 정보 =========");
        System.out.printf("출생년도    :   %d년\n", birthYear);
        System.out.printf("현재 나이   :   %4d세\n", currentAge);
        System.out.printf("10년 후    :   %4d세\n", futureAge);
        System.out.printf("성인 여부   :  %6s\n", isAdult);
        System.out.printf("띠         :  %5s\n", zodiac);
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