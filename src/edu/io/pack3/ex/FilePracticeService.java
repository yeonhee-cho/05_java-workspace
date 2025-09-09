package edu.io.pack3.ex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilePracticeService {
    // Path, Files를 이용해서
    // 1. my_logs 라는 폴더가 존재하는지 확인하고 내부에 intro.txt 파일이 존재하는지 확인
    // 폴더 / 파일 모두 존재하면
    // 현대방식의 파일읽기 방식을 활용해서 intro.txt 내부에 작성된 글자를 모두 읽고 읽은 내용 출력
    public void method1(String fileName){
        Path path = Path.of("java_basic","my_logs",fileName);

        if(!Files.exists(path)){
            System.out.println("해당 파일 없음"); // 파일이 없는지 폴더가 없는지 확인하는 로직
            return;
        }

        try {
            String content = Files.readString(path);
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("읽는 도중 문제 발생");
        }
    }
}
