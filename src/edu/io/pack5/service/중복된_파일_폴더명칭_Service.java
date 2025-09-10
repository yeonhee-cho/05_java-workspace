package edu.io.pack5.service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class 중복된_파일_폴더명칭_Service {
    /**
     * do - while 을 이용해서 파일이름_숫자.png
     * 완성하기
     * do - while 은 while() 내부가 true, false 관계없이
     * 무보건 최초 1회는 do안에 있는 구문을 무조건 실행하고 결과 출력
     */
    public void saveImage1(){
        String originName = "사진.png";

        Path path = Path.of("profiles", "member01","사진.png");
        int dot = originName.lastIndexOf('.'); // . 이 몇 번째에 존재하는지 확인
        String baseName = originName.substring(0, dot); // 파일 이름 처음부터 .이 존재하지 전까지의 파일 명칭을 가져오는 방법
        String extName = originName.substring(dot); // . 확장자 이름을 가지고 있는 상태

        System.out.println("dot . 의 위치 : " + dot);
        System.out.println("baseName : " + baseName);
        System.out.println("extName : " + extName);
        int count = 1;

        do{ // while() 안에 있는 값이 true false 상관없이 무조건 최초 1회 실행
            // 사진_숫자.png
            String newName = baseName + "_" + count + extName;
            path = Path.of("java_basic", "profiles", "member01",newName); // 기존 이름 -> 숫자가 붙은 이름 변경
            count++; // 사진_1이 존재하면 숫자를 계속 올려서 존재하지 않는 이름이 나올 때까지 숫자값 상승
        } while (Files.exists(path)); // 파일이 이름이 존재하면 존재하는 파일 이름이 없을 때까지 반복

        try {
            Files.createDirectories(path.getParent()); // profile/member01까지만 포함
            String imgUrl = "https://www.fitpetmall.com/wp-content/uploads/2022/11/shutterstock_196467692-1024x819.jpg";
            URL url = new URL(imgUrl);
            InputStream in = url.openStream();
            Files.copy(in,path);
            in.close(); // 메모리 누수 방지를 위해서 실시간으로 데이터를 받아오는 steam을 종료
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * while을 이용해서 원본파일이름 이 외
     * 동일한 파일 명칭이 없을 때까지 반복수행
     * 조건이 true 이어야지만 실행
     */
    public void saveImage2(){
        String originName = "사진.png";

        Path path = Path.of("profiles", "member01","사진.png");
        int dot = originName.lastIndexOf('.'); // . 이 몇 번째에 존재하는지 확인
        String baseName = originName.substring(0, dot); // 파일 이름 처음부터 .이 존재하지 전까지의 파일 명칭을 가져오는 방법
        String extName = originName.substring(dot); // . 확장자 이름을 가지고 있는 상태

        System.out.println("dot . 의 위치 : " + dot);
        System.out.println("baseName : " + baseName);
        System.out.println("extName : " + extName);
        int count = 1;

        while (Files.exists(path)) {
            // if(!Files.exists(path)) {
            //     return; // 파일이름이 존재하지 않는다면 탈출
            // }
            // 존재하지 않으면 알아서 while문 종료이므로 위에는 안써줘도 ok!

            String newName = baseName + "_" + count + extName;
            System.out.println("newName : " + newName);
            path = Path.of("java_basic", "profiles", "member01", newName);
            count++;
        }
        try {
            Files.createDirectories(path.getParent()); // profile/member01까지만 포함
            String imgUrl = "https://www.fitpetmall.com/wp-content/uploads/2022/11/shutterstock_196467692-1024x819.jpg";
            URL url = new URL(imgUrl);
            InputStream in = url.openStream();
            Files.copy(in,path);
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 타임 스탬프
     * 현재 시간을 이용해서 현재 시간으로 명칭 구분
     * System.currentTimeMillis()
     *
     * 19970년 1월 1일 00:00:00 부터 현재 시간까지 얼마나 흘렀는지 숫자로 나타낸 것
     * 0.001 초로 매우 정밀하며, 이 정밀함을 넘어서 동일한 사진 명칭이다?
     * 동시에 같은 파일을 저장해도 회사 컴퓨터로 데이터 저장이 순차적으로 넘어오기 때문에 겹칠일 없음
     */
    public void saveImage3(){
        String originName = "사진.png";

        Path path = Path.of("profiles", "member01","사진.png");
        int dot = originName.lastIndexOf('.'); // . 이 몇 번째에 존재하는지 확인
        String baseName = originName.substring(0, dot); // 파일 이름 처음부터 .이 존재하지 전까지의 파일 명칭을 가져오는 방법
        String extName = originName.substring(dot); // . 확장자 이름을 가지고 있는 상태

        System.out.println("dot . 의 위치 : " + dot);
        System.out.println("baseName : " + baseName);
        System.out.println("extName : " + extName);

        while (Files.exists(path)) {
            // if(!Files.exists(path)) {
            //     return; // 파일이름이 존재하지 않는다면 탈출
            // }
            // 존재하지 않으면 알아서 while문 종료이므로 위에는 안써줘도 ok!

            String newName = baseName + "_" + System.currentTimeMillis() + extName;
            System.out.println("newName : " + newName);
            path = Path.of("java_basic", "profiles", "member01", newName);

        }
        try {
            Files.createDirectories(path.getParent()); // profile/member01까지만 포함
            String imgUrl = "https://www.fitpetmall.com/wp-content/uploads/2022/11/shutterstock_196467692-1024x819.jpg";
            URL url = new URL(imgUrl);
            InputStream in = url.openStream();
            Files.copy(in,path);
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void saveImage4(){
        String originName = "사진.png";

        Path path = Path.of("폴더1/폴더2", originName);
        int dot = originName.lastIndexOf('.');
        String baseName = originName.substring(0, dot);
        String extName = originName.substring(dot);

        int count = 1;

        while (Files.exists(path)) {
            String newName = baseName + "_" + count + extName;
            System.out.println("newName : " + newName);
            path = Path.of("폴더1/폴더2", newName);
            count++;
        }

        try {
            Files.createDirectories(path.getParent()); // profile/member01까지만 포함
            String imgUrl = "https://www.fitpetmall.com/wp-content/uploads/2022/11/shutterstock_196467692-1024x819.jpg";
            URL url = new URL(imgUrl);
            InputStream in = url.openStream();
            Files.copy(in,path);
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // profiles/member01 폴더 안에 사진.png 라는 명칭이 존재하면 (숫자)로 파일이름이 덮어쓰기 되지 않도록 설정
    public void saveImage5() {
        String imgUrl = "https://www.fitpetmall.com/wp-content/uploads/2022/11/shutterstock_196467692-1024x819.jpg";
        // data:image/jpeg;base64,/ = 데이터 숫자 자체값이어서 주소로 읽을 수 없음
        // 생기는 오류 : java.lang.RuntimeException: java.net.MalformedURLException: unknown protocol: data
        String originName = "사진.png";
        
        Path path = Path.of("java_basic","profiles", "member01", originName);
        
        int 마침표위치 = originName.lastIndexOf('.'); // 마지막에 위치한 마침표의 위치
        String 확장자없는이름 = originName.substring(0, 마침표위치);
        String 확장자이름 = originName.substring(마침표위치); // 마침표위치부터 모두 다

        int 숫자 = 1;
        while (Files.exists(path)) {
            String 새로운이름 = 확장자없는이름 + "(" + 숫자 + ")" + 확장자이름;
            path = Path.of("java_basic","profiles", "member01", 새로운이름);
            // 혹시나 현재 작성한 숫자 번호를 포함한 전체이름이 파일에 존재할 수 있으므로
            // 미리 숫자 번호를 +1 하여 대비해둔다.
            숫자++;
        }

        try {
            Files.createDirectories(path); // 만약에 폴더 없으면 추가

            URL 인터넷주소 = new URL(imgUrl);
            InputStream 인터넷에서사진가져오기 = 인터넷주소.openStream();
            Files.copy(인터넷에서사진가져오기, path);
            인터넷에서사진가져오기.close();
            System.out.println(path + "사진 저장을 완료했습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 최근 트렌드
     */
    // c 드라이브 아래에 kakaoTalk 이라는 폴더에 사진을 저장하기
    // 사진을 저장할 때는 반드시
    // KakaoTalk_현재시간.jpg 형태로 저장할 것
    // int 마침표위치 -> kakaoName 에
    // String kakaoName
    // String 확장자이름 -> kakaoName 에
    public void kakaoSave(String imgUrl) {
        String kakaoName = "KakaoTalk_" + System.currentTimeMillis() + ".jpg";
        Path path = Path.of("/kakaoTalk", kakaoName);

        try {
            Files.createDirectories(path.getParent());
            URL url = new URL(imgUrl);
            InputStream in = url.openStream();
            Files.copy(in,path);
            System.out.println(path + "생성이 완료되었습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
