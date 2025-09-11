package edu.io.pack3.ex2;

import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilePracticeService2 {
    // AccessDeniedException :
    public void method1(String dirName, String fileName){
        Path path;

        if(dirName != null && !dirName.isEmpty()){
            path = Path.of(dirName,fileName);
        } else {
            path = Path.of(fileName); // 폴더와 관계없이 파일이 존재하면
            // 폴더는 선택하지 않았고 파일 내용만 선택, 최상위 파일에서 파일을 선택하고 출력
        }

        System.out.println(path.getParent()); // my_logs
        System.out.println(path); // my_logs\intro.txt
        if(path.getParent() != null){
            if(!Files.exists(path.getParent())){
                System.out.println("폴더가 존재하지 않습니다. 폴더이름을 확인해주세요.");
                return;
            }

            if(!Files.isDirectory(path.getParent())){
                System.out.println("폴더가 아니고, 파일 형태입니다.");
                return;
            }
            System.out.println(path.getParent() + " 가 존재합니다.");
        }

        System.out.println("생성된 경로 : " + path.toAbsolutePath()); // 완벽한 경로 확인하기
        if(!Files.exists(path)){
            System.out.println("파일이 존재하지 않습니다.");
            return;
        }

        try {
            String content = Files.readString(path);
            System.out.println(content);
        } catch (AccessDeniedException e) {
            System.out.println("접근 권한이 없습니다.");
        } catch (IOException e) {
            System.out.println("읽는 도중 문제 발생");
        }
    }
}
