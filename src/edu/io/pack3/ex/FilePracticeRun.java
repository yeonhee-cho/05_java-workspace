package edu.io.pack3.ex;

import java.util.Scanner;

public class FilePracticeRun {
    public static void main(String[] args) {
        FilePracticeService fps = new FilePracticeService();

        Scanner sc = new Scanner(System.in);
        System.out.print("폴더를 입력하시겠습니까? (yes/no) : ");
        // 글자입력받고 공백없음 모두 소문자처리
        // 없으면 기본 프로젝트 최상위로 폴더 설정
        // yes이면 폴더 입력 후
        String choice = sc.nextLine().trim().toLowerCase();
        String dirName = "";
        if(choice.equals("yes") || choice.equals("y")){
            // dirName으로 입력한 폴더이름을 method1에 전달
            System.out.print("폴더명을 입력해주세요 : ");
            dirName = sc.nextLine().trim();
        } else {
            dirName = "";
            System.out.println("최상위로 폴더 설정됩니다.");
            // java-workspace이고 싶을 경우
        }

        System.out.print("내용을 확인할 파일이름 + 확장자를 입력하세요 : ");
        String fileName = sc.nextLine();
        fps.method1(dirName,fileName);
    }
}
