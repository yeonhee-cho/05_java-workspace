package edu.practice.day11;

import java.io.*;
import java.util.*;

public class SafeFileManager {
    public void method1() {
        Scanner sc = new Scanner(System.in);
        File file;

        Map<String, String> fileMap = new HashMap<>(); // 파일명 : 파일경로
        Map<String, Long> fileSizeMap = new HashMap<>(); // 파일명 : 파일크기
        BufferedReader br = null;

        // 초기 데이터
        fileMap.put("config", "config.txt");
        fileMap.put("log", "system.log");
        fileMap.put("data", "data.csv");

        // "config.txt" 파일을 읽어서 내용 출력
        // FileNotFoundException, IOException 처리
        // Map에서 파일 정보 조회 시 null 체크
        // finally에서 파일 스트림 닫기 및 "파일 관리 작업 완료" 메시지

        String fm = fileMap.get("config"); // config 탭에 존재하는 config.txt 가져오기

        // 파일 읽는 방법
        try {
            br = new BufferedReader(new FileReader(fm)); // 파일 쓰기, 파일 생성, 파일 읽기는 모두 try-catch로 시도

        } catch (FileNotFoundException e) { // java.io.FileNotFoundException: config.txt (지정된 파일을 찾을 수 없습니다)
            // 만약에 파일이 존재하지 않을 경우
            System.out.println("존재하지 않는 파일입니다.");
            // 파일을 생성하시겠습니까? 물어보고
            System.out.print("파일을 생성하시겠습니까?");
            // Scanner 이용해서 yes 라고 대답하면
            String response = sc.nextLine();
            // File을 이용해서 config.txt 파일 생성
            // 파일 생성을 완료합니다.
            if(!"yes".equals(response)){ // 대답이 yes 일 경우
                file = new File(fm);
                try {
                    file.createNewFile();
                    System.out.println("파일 생성이 완료되었습니다.");
                } catch (IOException ex) {
                    // 파일 생성 실패했을 때 문제 추가하기
                    // throw new RuntimeException(ex);
                }
            } else {
                System.out.println("파일 생성을 취소합니다.");
            }
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
