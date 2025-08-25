package edu.control.condition;
// 폴더 위치 : edu 폴더 안에 control 폴더 안에 condition 폴더에 위치

import java.util.Scanner;

/*
* 조건문 기능용 클래스
* */
public class ConditionEx {

    /*
    * 나이를 입력 받아
    * 19세 이상은 성인입니다
    * 성인미만은 성인이 아닙니다.
    * */

    public void method1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("나이 입력 : ");
        int age = sc.nextInt();

        // 만약에 19세 이상이라면
        if(age >= 19){
            System.out.println("성인입니다.");
        }else{
            System.out.println("성인이 아닙니다.");
        }
    }
    /*
    * 나이를 입력 받아
    * 13세 이하면 어린이
    * 13세 초과 18세 이하 청소년
    * 18세 초과 성인
    * {}를 생략한 if문으로 작성하시오.
    * 기능 명칭 : method2
    * 기능 반환 여부 : x
    * 변수 명칭 : age result 이용해서 결과 작성
    * */
    public void method2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("나이 입력 : ");
        int age = sc.nextInt();
        String result="";

        if(age < 0 || age > 200) result = "나이를 다시 입력해주세요."; else if(age <= 13) result = "어린이"; else if(age<=18) result = "청소년"; else result = "성인";

        System.out.println(result);
    }

    /*
    * method3
    *
    * 달(월)을 입력 받아 해당 계절 출력
    * 봄 : 3,4,5
    * 여름 : 6,7,8
    * 가을 : 9,10,11
    * 겨울 : 12,1,2
    * 그 외 : 잘 못 입력하셨습니다.
    *
    * 변수이름 : sc,
    *           int month
    *           String result
    * */
    // 한클래스 내에서 동일한 명칭의 메서드를 사용하기 위해서는 매개변수를 각각 다르게 설정하거나
    // void -> return 전달 받는 형식을 추가하는 방법 이외에는 에러 발생
    public void method3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("달(월) 입력 : ");
        int month = sc.nextInt();
        String result;

        /*
        * 입력 값이 잘 못 되었을 경루 메서드 기능을 중간에 종료
        * */
        if(month < 1 || month > 12) {
            result = "잘 못 입력하셨습니다.";
            return; // 아래 기능을 수행하지 못하게 돌려보내기
        }
        else if (month >= 3 && month <= 5) result = "봄";
        else if(month >= 6 && month <= 8) result = "여름";
        else if(month >= 9 && month <= 11) result = "가을";
        else result = "겨울";

        System.out.println(result); // else에서 result에 해당하는 데이터 값이 존재하지 않으면 에러 발생
    }
}
