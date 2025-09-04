package edu.collection.pack1.model;
// 클래스를 생성할 때 mode.Book와 같은 형식으로 작성하면 model이라는 폴더와 Book 문서가 동시 생성
public class Book {
    private String title; // 제목
    private String writer; // 저자(글쓴이)
    private int price; // 가격

    // 메서드 생성자 파라미터 생성자 게터 세터 toString 생성
    // 아래 작성한 모든 기능들은 추후 @생성자 @파라미터생성자 @게터 @세터 @투스트링과 같은 형태로 
    // 추후에는 가볍고 편하게 작성할 예정
    // 디폴트 생성자
    public Book() {
    }
    // 파라미터 생성자
    public Book(String title, String writer, int price) {
        this.title = title;
        this.writer = writer;
        this.price = price;
    }
    // 게터 세터
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getWriter() {
        return writer;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    // 개발자들이 만드는 모든 클래스는 extends Object문서를 상속받는다가 기본
    // extends Object 를 작성하지 않아도 무조건 자동 설정
    // Object 클래스 문서 내에는 개발자들이 공통적으로 필요로 하는 기능들이 작성되어 있음
    // 그 중 대표적으로 가장 많이 사용하는 것이 toString

    @Override
    public String toString() {
        return "Book [title='" + title + '\'' +
                ", writer='" + writer + '\'' +
                ", price=" + price + ']';
    }
}
