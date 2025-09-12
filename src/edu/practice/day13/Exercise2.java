package edu.practice.day13;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Exercise2 {

    // 문제 1 실행 학생 정보 파일 생성과 관리
    public void solution1(){
        Path studentDir = Path.of("student");
        Path filePath = studentDir.resolve("info.txt");
        String content = "이름: 홍길동\n나이: 25\n전공: 컴퓨터공학\n학년: 3학년";

        try {
            Files.createDirectories(studentDir);
            System.out.println(filePath.getParent() + " 생성되었습니다.");
            Files.writeString(filePath, content); // 파일 안에 , 내용작성
            System.out.println(filePath.getFileName() + "에 내용이 작성되었습니다.");
            content = Files.readString(filePath); // 어떤 파일을 읽을 것인가
            // readString는 읽는 용도가 맞으나, 컴퓨터가 읽은 것인지
            // 컴퓨터가 읽은 내용을 클라이언트 눈에 보여줄 의무는 없음
            System.out.println("학생 정보 파일이 생성되었습니다.");
            System.out.println("=== 파일 내용 ===");
            System.out.println(Files.readString(filePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 문제 2 실행 인터넷에서 텍스트 데이터 다운로드
    public void solution2(){
        Path textDir = Path.of("downloads", "text", "downloaded_data.txt");
        String textUrl = "https://httpbin.org/base64/SGVsbG8gV29ybGQhIEphdmEgRmlsZSBJTyBQcmFjdGljZQ==";

        try {
            Files.createDirectories(textDir.getParent());
            URL url = new URL(textUrl);
            // InputStream inputStream = url.openStream();
            // Files.copy(inputStream, textDir);
            if(!Files.exists(textDir)){
                Files.copy(url.openStream(), textDir);
            }

            String content =  Files.readString(textDir);
            System.out.println("텍스트 다운로드 완료: " + textDir);
            System.out.println("다운로드된 내용: " + content);

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    // 문제 3 실행 : 중복 파일명 자동 처리
    public void solution3(){
        Path backupDir = Path.of("backup"); // 경로 설정 1번
        String baseName = "document";
        String extension = ".txt";
        String content = "이것은 백업 문서입니다.";
        int counter = 1;

        Path textDir = backupDir.resolve(baseName + extension);
        // 기존 경로 + 파일 명칭 이어 작성할 때 주로 사용
        // 경로를 설정할 때 처음부터 Path.of 로 완벽한 경로를 설정한 후 경로 내에 파일 명칭이 들어갈 수 있도록 설정
        try {
            Files.createDirectories(backupDir); // 2번 폴더 존재 유무 확인 후 생성

            while(Files.exists(textDir)) {
                String newName = baseName + "_" + counter + extension;
                textDir = backupDir.resolve(newName);
                
                //  추후 문제가 생겼을 경우 실행할 작업은 맨 아래에 작성
                counter++;
            }

            System.out.println(textDir);
            Files.writeString(textDir,content);
            System.out.println("파일이 저장되었습니다 : " + textDir.getFileName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 문제 4 실행 : 파일 이동 및 복사 기능
    public void solution4(){
        Path tempDir = Path.of("temp");
        Path archiveDir = Path.of("archive");
        Path backupDir = Path.of("backup");
        Path sourceFile = tempDir.resolve("data.txt");
        Path targetFile = archiveDir.resolve("data.txt");
        Path backupFile = backupDir.resolve("data_backup.txt");
        // Files.move(), Files.copy()
        // StandardCopyOption.REPLACE_EXISTING

        try {
            // 1단계 임시파일 생성
            Files.createDirectories(tempDir);
            Files.writeString(sourceFile, "임시데이터");
            System.out.println("1단계 : 임시파일 생성 완료 - " + sourceFile);

            // 2단계 : 폴더 생성
            Files.createDirectories(archiveDir);
            Files.createDirectories(backupDir);
            System.out.println("2단계 : 폴더 생성 완료 - " + archiveDir.getFileName() + ", " + backupDir.getFileName());

            // 3단계 : 파일 이동
            Files.move(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("3단계 : 파일 이동 완료 - " + sourceFile + " -> " + targetFile);

            // 4단계 : 백업 복사
            Files.copy(targetFile, sourceFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("4단계 : 백업 복사 완료 - " + backupFile);
            System.out.println("모든 작업이 완료되었습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 문제 5 실행 : 실시간 로그 파일 생성기
    public void solution5(){}

    // 문제 6 실행
    public void solution6(){}
}
