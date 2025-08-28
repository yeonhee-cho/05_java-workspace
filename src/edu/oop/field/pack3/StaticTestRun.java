package edu.oop.field.pack3;

public class StaticTestRun {
    public static void main(String[] args) {
        // Korean 객체 생성
        Korean k1 = new Korean(); // 클래스라는 문서에 작성된 내용들을 객체로 설정
                                  // 객체 이름 = k1
        Korean k2 = new Korean();
        System.out.println("k1의 nationalCode : " + k1.nationalCode);
        System.out.println("k2의 nationalCode : " + k2.nationalCode);

        // k1을 이용해서 nationalCode 를 변경
        k1.nationalCode = 1;
        System.out.println("=== nationalCode 변경 후 ===");
        System.out.println("k1의 nationalCode : " + k1.nationalCode);
        System.out.println("k2의 nationalCode : " + k2.nationalCode);

        /*
        * static 변수는 공용(공유) 변수!
        * 객체가 100개 생성되어도 변수 하나로 모두가 공유
        * -> 데이터베이스 접속하는 경로 변경
        * static {
        * nationalCode = 10;
        * }
        * */

        System.out.println("우리의 조상님: " + Korean.ANCESTOR);
    }
}
