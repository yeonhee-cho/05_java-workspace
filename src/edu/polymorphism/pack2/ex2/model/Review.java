package edu.polymorphism.pack2.ex2.model;

public class Review extends Post {
    // 추가필드
    private int rating;

    // 생성자
    public Review() {
    }
   public Review(String postId, String title, String author, String content, int rating) {
        super(postId, title, author, content);
        this.rating = rating;
    }

    // 게터 세터
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public void displayPost() {
        System.out.println("[후기]\n" + getTitle() + "\n작성자: " + getAuthor() + "\n평점: " + getRating() + "/5점 \n내용: " + getContent() + "\n");
    }
}
