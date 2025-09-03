package edu.polymorphism.pack2.ex2.model;

public class Notice extends Post {
    // 추가 필드
    private String priority; // 중요도

    // 생성자
    public Notice() {
    }
    public Notice(String postId, String title, String author, String content) {
        super(postId, title, author, content);
    }

    // 게터 세터
    public String getPriority() {
        return priority;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }

    // Post 클래스에서 강제로 작성해야하는 메서드만 필히 작성하기!
    @Override
    public void displayPost() {
        System.out.println("[공지사항]\n" + getTitle() + "\n작성자: " + getAuthor() + "\n중요도: " + getPriority() + "\n내용: " + getContent() + "\n");
    }
}
