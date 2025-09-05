package edu.exception.pack1.ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticeException1 {
    /**
     * 기능 명칭 : method1()
     * 두 수를 입력받아 나눈 몫 구하기
     * 정수 입력 1 :
     * 정수 입력 2 :
     *
     * System.out.println(정수 입력 1 / 정수 입력 2); 에 대해 수행하고,
     * 정수 입력 2 : 를 0으로 입력했을 때 발생하는 예외를
     * catch 처리한 후
     * System 출력문을 0으로 숫자를 나눌 수 없습니다.
     *
     * 성공 실패 관계없이 프로그램을 종료합니다.띄우기
     */
    // 단축키 코드 블록을 드래그 해서 잡은 후 Ctrl + Alt + t 를 작성하면
    // if 부터 try-catch while 등 코드 블록에 대한 상황 설정할 수 있는 블록들이 나옴
    public void method1(){
        System.out.println("=".repeat(3) + "두 수를 입력받아 나눈 몫 구하기" + "=".repeat(3));
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 1 : ");
        int input1 = sc.nextInt();
        System.out.print("정수 입력 2 : ");
        int input2 = sc.nextInt();
        try{
            // 모든 코드를 작성하기 보다는 문제가 발생할 것 같은 구문만 주로 작성
            System.out.println("나눈 값 결과 : " + input1 / input2);
        } catch (ArithmeticException e){
            System.out.println("a의 값 : " + input1);
            System.out.println("a의 값 : " + input2);
            System.out.println("0으로 숫자를 나눌 수 없습니다.");
            // 다른 방법을 시도하시겠습니까? + 나 * 와 같은 행동을 유도할 수 있음
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }

}
