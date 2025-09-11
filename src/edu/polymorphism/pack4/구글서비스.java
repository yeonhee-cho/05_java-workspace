package edu.polymorphism.pack4;

public class 구글서비스 {
    // 필드
    protected String 서비스이름;
    protected boolean 로그인유무;

    // 메서드
    // 기본 생성자 파라미터 생성자
    public 구글서비스(String 서비스이름) {
        this.서비스이름 = 서비스이름;
    }

    public void login(String email) {
        로그인유무 = true;
        System.out.println(email + " 로 " + 서비스이름 + "에 로그인 했습니다.");
    }
    
    public void logout(String email) {
        로그인유무 = false;
        System.out.println(서비스이름 + "에 로그아웃 했습니다.");
    }
}
