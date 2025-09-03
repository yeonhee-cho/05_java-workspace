package edu.polymorphism.pack2.ex2.model;

public class Question extends Post{
    // 추가 필드
    private int answerCount; // 답변 개수 (초기값: 0)

    // 생성자
    public Question() {
    }
    public Question(String postId, String title, String author, String content) {
        super(postId, title, author, content);
        this.answerCount = 0; // answerCount 응답개수의 경우 소비자한테 전달 받는 것이 아닌 개발자가 첫 응답 개수를 지정
    }

    // 게터 세터
    public int getAnswerCount() {
        return answerCount;
    }
    public void setAnswerCount(int answerCount) {
        this.answerCount = answerCount;
    }

    @Override
    public void displayPost() {
        System.out.println("[Q&A] " + getTitle() + "\n작성자: " + getAuthor() + "\n 답변 개수: " + getAnswerCount() + "개 \n내용: " + getContent() + "\n");


    }
}
