package edu.io.pack3.ex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilePracticeService {
    // Path, Files를 이용해서
    // 1. my_logs 라는 폴더가 존재하는지 확인하고 내부에 intro.txt 파일이 존재하는지 확인
    // 폴더 / 파일 모두 존재하면
    // 현대방식의 파일읽기 방식을 활용해서 intro.txt 내부에 작성된 글자를 모두 읽고 읽은 내용 출력
    public void method1(String dirName, String fileName){
        Path path;

        //  폴더명이 있으면 해당 폴더 안의 파일 확인
        if(dirName != null && !dirName.isEmpty()){
            path = Path.of(dirName,fileName);
        } else {
            // 없으면 현재 최상위 프로젝트 폴더 파일 에서 겁색
            path = Path.of(fileName);
        }
        // 폴더의 존재 확인
        if(path.getParent() != null){
            if(!Files.exists(path.getParent())){
                System.out.println("폴더가 존재하지 않습니다. 폴더이름을 확인해주세요.");
                return;
            }
            if(!Files.isDirectory(path)){
                System.out.println("폴더가 아니고, 파일 형태입니다.");
                return;
            }
            System.out.println(path.getParent() + " 가 존재합니다.");
        }

        if(!Files.exists(path)){
            System.out.println("파일이 존재하지 않습니다."); // 파일이 없는지 폴더가 없는지 확인하는 로직
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
