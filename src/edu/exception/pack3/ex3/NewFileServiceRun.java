package edu.exception.pack3.ex3;

import java.io.File;
import java.io.IOException;

public class NewFileServiceRun {
    // 자바는 컴퓨터와 직접적으로 연관이 있는 서버 언어로
    // 파일생성, 삭제, 수정과 같이 컴퓨터에 직접적으로 영향을 주는 코드 작업이 가능

    // 자바스크립트는 웹에 직접적으로 영향을 주는 웹 관련 언어로
    // 파일생성이나 삭제 수정과 같은게 자바보다는 사용하기 어려움
    // nodeJs 라는 프레임워크(라이브러리) 도구를 활용하면 가능하긴 함

    // 월요일 IO 입출력
    public static void main(String[] args) {
        // File이라는 자바 개발자들이 만든 문서를 활용해서 파일 생성하기
        
        // 파일 만들기 할 때 자동으로 덮어쓰기가 되므로 파일 존재유무를 확인하고 
        // 파일명칭이 존재하면 (1) 이런식으로 번호를 붙임
        File file = new File("새 텍스트 문서.txt");
        if(!file.exists()){ // 생성된.txt가 존재하지 않는게 사실이라면
            try {
                file.createNewFile(); // 파일을 생성하는 기능
                System.out.println("file 생성이 완료되었습니다.");
            } catch (IOException e) {
                System.out.println("파일을 생성하는 도중 문제가 발생했습니다.");
            } catch (Exception e) {
                System.out.println("예기치 못한 문제가 발생했습니다.");
                // 문제가 무엇인지는 e 라는 변수이름을 통해 확인
                System.out.println("err : " + e);
                // e.printStackTrace(); // 예외정보 + 예외가 발생한 위치까지의 메서드 추적
            } finally {
                System.out.println("파일 생성을 종료합니다.");
            }
        }
    }
}
