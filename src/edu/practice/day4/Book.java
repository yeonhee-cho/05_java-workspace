package edu.practice.day4;

public class Book {
    private String title; // 책 제목
    private String author; // 저자
    private String isbn; // ISBN
    private boolean isAvailable; // 대출가능 상태

    // 기본생성자
    public Book() {
    }

    // 필수생성자
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // getter, setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // 대출 가능하면 상태 변경 후 "대출 성공", 불가능하면 "이미 대출중"
    public String borrowBook(){
        return isAvailable ? "대출 성공" : "이미 대출중";
    }

    // 반납 처리 후 "반납 완료"
    public String returnBook(){
        if(!isAvailable) {
            isAvailable = true;
            return "반납 완료";
        } else {
            return "대출 가능";
        }
    }
}
