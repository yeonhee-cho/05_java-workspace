package edu.io.pack5.ex;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

public class 이미지URL서비스 {
    public void dirSaveImg(String imgUrl, String imgDir, String imgName){
        Path path = Path.of("profiles", imgDir, imgName); // of 쓰는 이유 : 간결함, path와 paths의 헷갈림 없음

        System.out.println("path: " + path);
        System.out.println("path.getParent: " + path.getParent());

        // 파일이름 중복 처리
        try {
            // path : animal/사자.png
            // path.getParent() : animal 하위 명칭 이 외 폴더들을 모두 가져오는 기능
            // path.getFileName() : 마지막에 존재하는 이름을 가져오는 기능
            
            // 이름 뒤에 확장자가 오면 확장자를 지운 후 수정 작업이 필요함
            String name = path.getFileName().toString(); // 파일 이름 가져오기
            System.out.println("name: " + name);

            int dot = name.lastIndexOf('.'); // .을 기준으로 앞에 있는 글자만 가져오기

            String bashName = name.substring(0, dot); // . 이전의 파일 명칭들이 존재
            String extName = name.substring(dot); // .png 확장자 명칭이 들어감
            
            int count = 1;
            
            do {
                // 새로운 이름 = 사용자가 작성한 이름_ 숫자.png
                String newName = bashName + "_" + count + extName;
                path = Path.of("profiles", imgDir, newName);
                count++; // 사자_8 .... 동일한 명칭의 파일이 없을 때까지 진행
            } while(Files.exists(path));

            System.out.println("bashName: " + bashName);
            System.out.println("extName: " + extName);

            Files.createDirectories(path.getParent());

            URL url = new URL(imgUrl);

            InputStream ins = url.openStream(); // 이미지 데이터를 모두 가져올 수 있도록 설정
            Files.copy(ins, path);
            ins.close();
            System.out.println("이미지 저장 완료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
