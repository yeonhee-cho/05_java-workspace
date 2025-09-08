package edu.io.pack2.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class 파일작성Service {

    public void method1(){
        String filename = "파일1.txt";
        String 파일내용 = "파일 1 내부에 글자를 작성할 것입니다.";

        try {
            // 파일들 문서를 이용해서 문자열로 글자를 작성
            Files.writeString(Paths.get(filename), 파일내용);
            System.out.println(filename + "파일 저장 완료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    // 현재 java_basic 폴더에 files 라는 폴더를 생성
    // files 라는 폴더 내부에 파일2.txt 만들고,
    // 파일 내용 : 안녕하세요. 반갑습니다. 오늘 점심은 어떻게 되나요?
    // String content = "안녕하세요. 반갑습니다. 오늘 점심은 어떻게 되나요?"
    // 를 활용해서 파일2.txt 내부에 작성하기
    // Files와 File 만 활용()
    // Paths 대신 File.getPath() 이용하거나 File 객체 이용
    // path filename content fPath fFilename 이용

    public void method2(){
        String path = "files";
        String filename = "파일2.txt";
        String content = "안녕하세요. 반갑습니다. 오늘 점심은 어떻게 되나요?";
        File fPath = new File("java_basic/" + path);
        File fFilename = new File(filename);

        if(!fPath.exists()){
            fPath.mkdirs();
        }
        /**
         * 필요한 타입 : Path
         * 제공된 타입 : String
         */
        try {
            Files.writeString(Paths.get(fPath + "/" + fFilename), content);
            System.out.println("파일 생성 및 컨텐츠 작성이 완료되었습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // String filename = "/files/파일2.txt";
        // String 파일내용 = "안녕하세요. 반갑습니다. 오늘 점심은 어떻게 되나요?";
        //
        // try {
        //     // 파일들 문서를 이용해서 문자열로 글자를 작성
        //     Files.writeString(Paths.get(filename), 파일내용);
        //     System.out.println(filename + "파일 저장 완료");
        // } catch (IOException e) {
        //     throw new RuntimeException(e);
        // }
    }
}
