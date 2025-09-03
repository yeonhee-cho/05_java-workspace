package edu.polymorphism.pack3.ex1;

public class 플랫폼실행하기 {
    public static void main(String[] args) {
        Facebook faceBook = new Facebook("자연인");
        faceBook.login(); // Meta플랫폼 클래스에서 상속받은 기능
        faceBook.post("오늘도 자연은 아름답네요.^^"); // 인터페이스 구현 메서드
        faceBook.like("post001"); // 인터페이스 구현 메서드
        faceBook.logout(); // Meta플랫폼 클래스에서 상속받은 기능

        System.out.println();
        Instagram instagram = new Instagram("이코딩");
        instagram.login(); // Meta플랫폼 클래스에서 상속받은 기능
        instagram.post("맛있는 음식"); // 인터페이스 구현 메서드
        instagram.like("photo456"); // 인터페이스 구현 메서드
        instagram.logout(); // Meta플랫폼 클래스에서 상속받은 기능
    }
}
