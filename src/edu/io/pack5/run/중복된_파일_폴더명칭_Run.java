package edu.io.pack5.run;

import edu.io.pack5.service.중복된_파일_폴더명칭_Service;

public class 중복된_파일_폴더명칭_Run {
    public static void main(String[] args) {
        중복된_파일_폴더명칭_Service service = new 중복된_파일_폴더명칭_Service();
        // service.saveImage1();
        // service.saveImage2();
        // service.saveImage3();
        // service.saveImage4();
        service.saveImage5();
        String imgUrl = "https://media.bunjang.co.kr/product/79290165_2_1516278342_w360.jpg";
        service.kakaoSave(imgUrl);
    }
}
