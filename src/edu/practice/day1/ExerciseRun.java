package edu.practice.day1;

public class ExerciseRun {
    public static void main(String[] args) {
        // 호출한 클래스와 클래스 대신 사용할 변수이름 맨 위에 작성
        Exercise1 ex1 = new Exercise1();
        Exercise2 ex2 = new Exercise2();
        Exercise3 ex3 = new Exercise3();
        Exercise4 ex4 = new Exercise4();
        Exercise5 ex5 = new Exercise5();
        
        // 변수 이름을 활용해서 메서드 구문 작성
        // ex1.method1();
        // ex2.method2();
        // ex3.method3();
        // ex3.method3_2();
        ex4.method4();
        // ex5.method5(); // 띠를 출력하지 않는 기능의 버전
        // ex5.method5_2(); // 띠를 포함해서 출력하는 기능의 버전
    }
}
