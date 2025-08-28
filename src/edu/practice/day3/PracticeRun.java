package edu.practice.day3;

public class PracticeRun {
    public static void main(String[] args) {
        Practice3 p3 = new Practice3();
        Practice4 p4 = new Practice4();
        Practice5 p5 = new Practice5();

        // 원하는 문제의 주석을 해제하고 실행하세요
        System.out.println("=== 문제 1: 도서 관리 클래스 ===");
        Practice1 p1 = new Practice1("Java 프로그래밍","김개발",25000);

        System.out.println("=== 도서 정보 ===");
        p1.displayInfo();
        System.out.println();
        p1.borrowBook();

        System.out.println("\n=== 도서 정보 ===");
        p1.displayInfo();
        System.out.println();
        p1.returnBook();

        System.out.println("\n=== 문제 2: 스마트폰 클래스 ===");
        Practice2 p2 = new Practice2("Galaxy S24", 100 );

        System.out.println("=== 스마트폰 상태 ===");
        p2.displayInfo();
        System.out.println();
        p2.powerOff();

        System.out.println("\n=== 스마트폰 상태 ===");
        p2.displayInfo();
        System.out.println();
        p2.useBattery();

        System.out.println("\n=== 스마트폰 상태 ===");
        p2.displayInfo();
        System.out.println();
        p2.charge();

        System.out.println("\n=== 문제 3: 은행계좌 업그레이드 ===");
        // p3.method3();

        System.out.println("\n=== 문제 4: 학생 성적 관리 시스템 ===");
        // p4.method4();

        System.out.println("\n=== 문제 5: 자동차 관리 시스템 ===");
        // p5.method5();
    }
}