package edu.io.pack4.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileMethodService {
    /**
     * 폴더가 존재하는지 확인하고 폴더를 생성하는 기능
     */
    public void createDirMethod(){
        // windows macbook 에서 작성하는 슬래시 기번에 따라 폴더를 구분하여 사용할 수 있도록 설정
        Path path = Path.of("java_basic","files", "food", "dinner.txt");
        System.out.println("path : " + path);
        System.out.println("path.getParent() : " + path.getParent());

        try {
            Files.createDirectories(path.getParent()); // java_basic\files\food\dinner.txt 
            // dinner.txt까지 폴더로 인식하고 총 java_basic\files\food\dinner.txt라는 폴더가 생성
            Files.createDirectories(path.getParent()); // java_basic\files\food
        } catch (IOException e) {
            System.out.println("폴더 생성이 올바르지 않습니다.");
        }
    }

    public void createFileMethod(){
        Path path = Path.of("java_basic","files", "food", "dinner.txt");
        System.out.println("path : " + path);
        System.out.println("path.getParent() : " + path.getParent());
        try {
            if(Files.isDirectory(path)){
                Files.delete(path); // 폴더 삭제
            }
            Files.createDirectories(path.getParent());
            if(!Files.exists(path)){ // 파일이 존재하지 않을 경우에만 생성
                Files.writeString(path, "안녕하세요. 저녁 메뉴 리스트 입니다.");
                System.out.println("파일 생성이 완료되었으며, 파일 내용 또한 그대로 들어있습니다.");
            }
        } catch (IOException e) {
            System.out.println("파일을 만들고 글자를 작성하고 저장하던 중에 문제가 발생했습니다.");
            e.printStackTrace();
        }
    }
    public void copyMethod(){}
    public void moneMethod(){}
}
