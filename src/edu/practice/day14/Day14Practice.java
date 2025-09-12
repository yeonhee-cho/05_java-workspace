package edu.practice.day14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Day14Practice {
    // 간단한 메모 저장하기
    public void saveMemo(){
        Path memoDir = Path.of("memo");
        Path memoFile = Path.of("memo", "my_memo.txt");
        String content = "오늘은 Java 파일 처리를 배우는 날!\n화이팅!";
        try {
            Files.createDirectories(memoDir);
            Files.writeString(memoFile, content); //  StandardOpenOption.CREATE, StandardOpenOption.APPEND
            System.out.println("메모가 저장되었습니다: " + memoFile.getFileName());
            content = Files.readString(memoFile); // 컴퓨터만 내용을 읽은 상태
            System.out.println("저장된 내용: \n" + content); // 컴퓨터가 읽은 파일의 내용을 클라이언트가 읽을 수 있도록 설정
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 일기 쓰기 (날짜별로 저장)
    public void writeDiary(){
        /**
         * System.currentTimeMillis() 1970년 01월 01일 00시 00분 00초 기준으로 얼마나 흘렀는지 카운팅
         * -> long (int로는 담을 수 없을 만큼 커버림, 시간은 계속 흐르기 때문에 숫자값은 커지면 커지지 작아지지 않음)
         *
         * LocalDateTime.now() 현재 시간 표현
         *
         * .format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) 출력 형식 지정
         */
        String today = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        Path diaryDir = Path.of("diary");
        Path diaryFile = Path.of("diary", today + "_일기.txt");
        String content = today + " 일기\n오늘 배운 것: Java 파일 입출력\n기분: 좋음!";

        try {
            Files.createDirectories(diaryDir); // diaryDir.toString에서 .toString 생략해도 문자열로 출력
            Files.writeString(diaryFile, content); // today_일기.txt 생성과 동시에 내용 작성
            System.out.println("오늘 일기가 작성되었습니다: " + diaryFile.getFileName());
            // LocalDateTime
            // DateTimeFormatter
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 방문자 기록 남기기
    public void recordVisitor(){
        Path logDir = Path.of("visitors");
        Path logFile = Path.of("visitors", "visitor_log.txt");
        String timestamp = getCurrentTime();
        String visitInfo = timestamp + " - 새로운 방문자가 들어왔습니다.\n";

        try {
            Files.createDirectories(logDir);
            // StandardOpenOption.CREATE, StandardOpenOption.APPEND
            Files.writeString(logFile, visitInfo, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("방문자 기록이 추가되었습니다.\n" +
                    "=== 전체 방문자 기록 ===");
            String content = Files.readString(logFile);
            System.out.println(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public String getCurrentTime(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    // 설정 파일 생성하기
    public void createConfig(){
        Path configDir = Path.of("config");
        Path configFile = Path.of("config", "app_config.txt");
        String config = "=== 앱 설정 파일 ===\n버전: 1.0\n언어: 한국어\n테마: 기본\n생성일: " + getCurrentTime();

        try {
            Files.createDirectories(configDir);
            Files.writeString(configFile, config, StandardOpenOption.CREATE);
            if(!Files.exists(configFile)){
                System.out.println("새로운 설정 파일을 생성합니다.");
                Files.writeString(configFile, config, StandardOpenOption.CREATE);
                System.out.println("설정 파일이 생성되었습니다: " + configFile.getFileName());
            } else {
                System.out.println("기존 설정 파일을 업데이트합니다.");
                Files.writeString(configFile, config, StandardOpenOption.CREATE);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
