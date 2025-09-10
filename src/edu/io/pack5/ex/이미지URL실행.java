package edu.io.pack5.ex;

import java.util.Scanner;

public class 이미지URL실행 {
    public static void main(String[] args) {
        이미지URL서비스 s = new 이미지URL서비스();
        Scanner sc = new Scanner(System.in);

        System.out.print("이미지 주소 작성 : ");
        String imgUrl = sc.nextLine();
        System.out.print("이미지 저장할 폴더 이름 작성 : ");
        String imgDir = sc.nextLine();
        System.out.print("이미지명 작성 : ");
        String name = sc.nextLine();

        String imgName = name + ".png"; // 사용자에게 1,2,3 중 선택하여 확장자명칭 추가
        s.dirSaveImg(imgUrl, imgDir, imgName);
    }
}
