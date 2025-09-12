package edu.practice.day15.member;

import java.util.Scanner;

/**
 * 사용자 인터페이스 클래스
 */
public class MenuSystem {
    private Scanner scanner;           // scanner
    private MemberService memberService;     // memberService

    // 프로그램 시작
    public void start() {
        // printWelcome() 호출
        // while(true) 무한루프로 showMainMenu() 반복 호출
        // try-catch로 예외 처리
    }

    // 환영 메시지 출력
    private void printWelcome() {
        // 프로그램 제목과 환영 메시지를 예쁘게 출력
    }

    // 메인 메뉴 표시
    private void showMainMenu() {
        // "1. 회원가입, 2. 프로그램 종료" 메뉴 출력
        // scanner.nextLine()으로 입력 받기
        // Integer.parseInt()로 선택 번호 파싱
        // switch문으로 분기 처리
        // NumberFormatException 예외 처리
    }

    // 회원가입 메뉴
    private void registerMenu() {
        // "아이디, 비밀번호, 이름, 이메일, 전화번호, 이미지URL" 순서대로 입력
        // 이미지URL은 선택사항 (빈값이면 "기본이미지"로 설정)
        // memberService.register() 호출
        // 성공시 이미지 폴더 경로 안내
        // pressEnterToContinue() 호출
    }

    // 프로그램 종료
    private void exitProgram() {
        // 종료 확인 메시지
        // "y" 입력시 프로그램 종료
    }

    // 구분선 출력
    private void printSeparator() {
        // "═══════════..." 형태의 구분선
    }

    // 계속하기 대기
    private void pressEnterToContinue() {
        // "엔터키를 눌러 계속..." 메시지 후 입력 대기
    }
}
