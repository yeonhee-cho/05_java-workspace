package edu.oop.method.ex;

/**
 *  결혼 정보 회사에서 실행만 진행하는 클래스
 */
public class MatchingTestRun {
    public static void main(String[] args) {
        MatchingService service = new MatchingService();
        service.displayMenu();
    }
}
