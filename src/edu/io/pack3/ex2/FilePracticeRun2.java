package edu.io.pack3.ex2;

import java.util.Scanner;

public class FilePracticeRun2 {
    public static void main(String[] args) {
        FilePracticeService2 fps = new FilePracticeService2();

        Scanner sc = new Scanner(System.in);
        System.out.print("폴더를 입력하시겠습니까? (yes/no) : ");
        String choice = sc.nextLine().trim().toLowerCase();
        String dirName = "";
        if(choice.equals("yes") || choice.equals("y")){
            System.out.print("폴더명을 입력해주세요 : ");
            dirName = sc.nextLine().trim();
        } else {
            dirName = "";
            System.out.println("최상위(java_basic)로 폴더 설정됩니다.");
        }

        System.out.print("내용을 확인할 파일이름 + 확장자를 입력하세요 : ");
        String fileName = sc.nextLine();
        // fileName 뒤에
        // 확장자를 작성하지 않았을 경우 확장자가 없다
        // 프로그램을 종료합니다. 추가하기
        int dotIndex = fileName.lastIndexOf(".");
        System.out.println("dotIndex 번호 확인 : " + dotIndex);
        if (dotIndex == -1 || dotIndex == fileName.length() -1) {
            System.out.println("확장자가 존재하지 않습니다.");
            return;
        }
        fps.method1(dirName,fileName);
    }
}
