package edu.practice.day12;

import java.io.File;
import java.io.IOException;
import java.nio.file.*; // 파일 문서 내 모든 클래스 사용처리
import java.util.Scanner;

public class Exercise1 {
    // 간단한 파일 생성과 내용 작성
    // - `practice` 폴더 생성
    // - `hello.txt` 파일 생성
    // - "안녕하세요! 자바 파일 처리 연습중입니다." 내용 작성
    // - 성공 시 "hello.txt 파일 생성 완료" 출력
    public void solution1(String dirName, String fileName){
        Path folderPath = Path.of("java_basic", dirName);
        try {
            Files.createDirectories(folderPath);
            // 파일 경로 만들기
            Path filePath = Path.of("java_basic",dirName, fileName);

            // 경로 내에 만들어진 파일에 내용 작성하기
            String content = "안녕하세요 자바 파일 처리 연습중입니다.";
            Files.writeString(filePath, content);
            System.out.println(fileName + " 파일 생성 완료!");

        } catch (IOException e) {
            System.out.println("예기치 못 한 문제가 발생했습니다.");
        }
    }

    // 파일 읽기
    // - `practice/hello.txt` 파일 내용 읽기
    // - 파일 존재 여부 확인
    // - 파일이 없으면 "파일을 찾을 수 없습니다." 출력
    // - 파일이 있으면 내용 출력
    public void solution2(String dirName, String fileName){
        Path filePath = Path.of("java_basic", dirName, fileName);
        String content;

        if(!Files.exists(filePath)){
            System.out.println("파일 없음");
            return;
        }
        
        try {
            content = Files.readString(filePath);
            System.out.print("파일 내용: ");
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("파일 읽기 중 오류가 발생했습니다.");
        }
    }

    // 여러 줄 내용 파일 만들기
    // practice 폴더 안에 메뉴 리스트를 담은 파일을 생성하는 프로그램을 작성하세요.
    public void solution3(String dirName, String fileName){
        Path filePath = Path.of("java_basic", dirName, fileName);
        String content = "오늘의 메뉴\n1. 김치찌개\n2. 불고기\n3. 비빔밥";
        try {
            Files.writeString(filePath, content);
            System.out.println(filePath + "파일 생성 완료!");
        } catch (IOException e) {
            System.out.println("파일 생성 중 오류 발생");
            System.out.println("회사에서 지시내린 규칙대로");
            System.out.println("개발자는 추후 필요한 조취를 취해야함");
        }
    }

    // 파일 존재 확인 후 삭제
    // - `practice` 폴더에 `temp.txt` 파일 생성
    // - "임시파일입니다" 내용 작성
    // - 파일 존재 여부 확인
    // - 존재하면 파일 삭제
    // - 삭제 성공 시 "temp.txt 파일 삭제 완료!" 출력
    // - 삭제 후 존재 여부 재확인하여 "파일 삭제 확인: false" 출력
    public void solution4(){
        Path filePath = Path.of("java_basic", "practice", "temp.txt");
        String content = "임시파일입니다";
        //파일 생성 + 생성된 파일에 내용 작성하기
        try {
            Files.writeString(filePath, content);
            if(Files.exists(filePath)){
                System.out.println("temp.txt 파일이 존재합니다.");
                Files.delete(filePath);
                System.out.println("temp.txt 파일 삭제 완료!");
                System.out.println("파일 삭제 확인: " + Files.exists(filePath));
            }
        } catch (IOException e) {
            System.out.println("파일 처리 중 오류 발생");
        }
    }

    // 폴더와 파일 여러 개 만들기
    public void solution5(String 폴더1번,String 폴더2번,String 폴더3번){
        // 폴더 구조만 생성
        Path dirPath = Path.of("java_basic",폴더1번, 폴더2번, 폴더3번);
        try {
            Files.createDirectories(dirPath);
            // 파일의 위치 + 파일이름
            Path note1Path = Path.of("java_basic",폴더1번, 폴더2번, 폴더3번, "note1.txt");
            Path note2Path = Path.of("java_basic",폴더1번, 폴더2번, 폴더3번, "note2.txt");

            // 파일 내용들
            String note1Content = "자바 기초 공부중";
            String note2Content = "파일 처리 배우는 중";

            // 파일을 생성하고 내용 작성하기
            Files.writeString(note1Path, note1Content);
            Files.writeString(note2Path, note2Content);
            Files.writeString(note2Path, note2Content);
            System.out.println("모든 파일 생성 완료");

            // 만들어진 파일 내용 읽기 및 출력
            String note1Read = Files.readString(note1Path);
            String note2Read = Files.readString(note2Path);

            System.out.println("note1의 파일 내용" + note1Path);
            System.out.println("note2의 파일 내용" + note2Path);
        } catch (Exception e) {
            System.out.println("파일 생성 중 오류 수정");
        }
    }
}
