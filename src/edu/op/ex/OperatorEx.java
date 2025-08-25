package edu.op.ex;

// 파일 이름과 폴더 위치 생성 방법
// .을 이용해서 폴더 구분 후 파일 명칭 작성
// edu.op.ex.OperatorEx

import java.util.Scanner;

/*
* 기능 작성용 클래스
* */
public class OperatorEx {
    /*
    * 자바에서는 모든 기능을 class 내부에 작성하기 때문에 대부분의 기능을 매서드 형태로 사용
    * 파일이름.기능이름()
    * */
    // 메서드(기능) 호출 테스트
    public void test(){
        System.out.println("test");
    }

    /*
    * 입력 받은 정수가 3의 배수가 맞는지 확인하는 기능
    * */
    public void method1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        int a = sc.nextInt();

        // boolean 변수 이름 보통 앞에 is 단어를 붙이므로 true / false 를 위한 변수 이름임을 표기
        // 위에서 sc.nextInt(); 내부에 소비자가 작성한 숫자입력값을 a 변수 이름에 저장한 후
        // a를 3으로 나누었을 때 나머지가 0이 맞으면 3의 배수
        boolean isTrue = (a % 3 == 0);

        // %d = decimal 이고, %b = boolean
        System.out.printf("%d는 3의 배수가 맞습니다. : %b", a, isTrue);
    }

    // void 라는 것은 반환할 값이 존재하지 않고, 단순 출력만 진행하는 기능을 뜻함
    /*
    * 자바라는 언어는
    *
    * (변수) 바구니에 들어갈 데이터가
    * - 숫자, 문자, 사람이 만든 크기, 실수 등 데이터를 담을 변수이름의 종류부터
    *
    * 기능을 실행할 때
    * - 기능을 실행만 하면 되는 것인지?
    *   public void 기능명칭(매개변수 자리, 파라미터의 자리){
    *       수행할 기능 작성
    *   }
    * - 기능 실행 후 실행 결과를 어딘가에 전달하는 기능인지?
    *   public 전달할자료형 기능명칭(매개변수 자리, 파라미터의 자리){
    *       수행할 기능 작성
    *       return 전달할데이터;
    *   }
    * 프로그램을 수행하기 전에 정의해야할 사항이 많음
    * */

    /*
    * method2() 기능
    * 첫 번째 입력 받은 수가 두 번째 입력 받은 수의 배수가 맞는지 확인
    *
    * 변수 이름 :
    * int = input1, input2
    * boolean = isTrue % ==0;
    *
    * printf 활용해서 %d는 %d의 배수가 맞는가? %b 형태로 출력하기
    * */
    public void method2(){
        /*
        * 스캐너(Scanner)처럼 동일한 클래스는 최초 1회만 호출 후 여러번 사용가능
        *
        * Scanner sc1 = new Scanner(System.in);
        * Scanner sc2 = new Scanner(System.in);
        * 이렇게 쓰지 않아도 한번만 적어주면 ok!
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 수:");
        int input1 = sc.nextInt();
        System.out.print("두 번째 수:");
        int input2 = sc.nextInt();

        boolean isTrue = input1 % input2 == 0;

        System.out.printf("%d는 %d의 배수가 맞는가? %b", input1, input2, isTrue);


    }

    /*
    * 입력 받은 정수가 짝수인지 홀수인지 판별
    * 정수입력 : {입력값}
    * {입력값}은 짝수/홀수 입니다.
    * */
    public void method3(){
        // void = return 없음!! 오직 실행만!!
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력 : ");
        int input = sc.nextInt();

        // 삼항 연산자 : 조건식 ? 참 : 거짓;
        /*
        * String result = isTrue ? "짝수" : "홀수";
        * 
        * 1. isTrue ? "짝수" : "홀수";
        * boolean isTrue = (input % 2 == 0); 위에서 input 결과가 true / false로 isTrue 라는 변수 이름에 담겨짐
        * 
        * 2. 담겨진 결과를 판별했을 때 ? 참이면 보여지거나 실행할 기능 설정 : 거짓이면 보여지거나 실행할 기능 설정
        * if(조건식) {
        *   조건식이 true 일 경우 실행
        * } else {
        *   조건식이 false일 경우 실행
        * }
        * 
        * 에서 if 와 (), {}를 생략하여 = ? : 으로 표현한 연산식
        * */
        boolean isTrue = (input % 2 == 0);

        String result = isTrue ? "짝수" : "홀수";
        System.out.printf("%d 은/는 %s입니다.", input, result);
    }

}
