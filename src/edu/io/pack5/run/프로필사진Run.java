package edu.io.pack5.run;

import edu.io.pack5.service.프로필사진Service;

import java.util.Scanner;

public class 프로필사진Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        프로필사진Service service = new 프로필사진Service();

        // service.createProfileFolder("member01", "프로필사진1.txt");
        // service.createProfileFolder("member02", "프로필사진2.txt");
        // service.createProfileFolder("member03", "프로필사진3.txt");
        // service.createProfileFolder("member04", "프로필사진4.txt");

        String imgUrl = "https://www.fitpetmall.com/wp-content/uploads/2022/11/shutterstock_196467692-1024x819.jpg";

        // service.saveImg(imgUrl);

        // 인터넷에서 이미지 주소를 복사한 후
        // 원하는 이미지를
        // String imgUrl2 = "이미지 주소 넣어주기";
        // service.saveImg(imgUrl2);
        String imgUrl2 = "https://images.pet-friends.co.kr/storage/pet_friends/product/id/5/9/a/8/2/6/0/59a8260f8d5b73da242746d758199584/10000/0ad9e0236ca6430fae2645bf5791ea97.jpg";
        // service.saveImg2(imgUrl2);

        // 이미지 이름 보내주기
        // System.out.print("저장할 사진의 명칭을 작성하세요 : ");
        // String name = sc.nextLine();
        //
        // String imgName = name + ".png";
        // service.saveImg3(imgName);

        // System.out.print("사진을 저장할 폴더의 명칭을 작성하세요 : ");
        // String folder = sc.nextLine();
        //
        // System.out.print("저장할 사진의 명칭을 작성하세요 : ");
        // String name = sc.nextLine();
        //
        // String imgName = name + ".png";
        // service.saveImg4(folder, imgName);

        System.out.print("저장할 사진의 주소를 작성하세요 : ");
        String imgUrl5 = sc.nextLine();

        System.out.print("사진을 저장할 폴더의 명칭을 작성하세요 : ");
        String folder = sc.nextLine();

        System.out.print("저장할 사진의 명칭을 작성하세요 : ");
        String name = sc.nextLine();

        String imgName = name + ".png";
        service.saveImg5(folder, imgName, imgUrl5);

    }
}
