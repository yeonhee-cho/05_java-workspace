package edu.polymorphism.pack2.ex2.model;

/* abstract  업스트렉트 */
// 부모 클래스 내에는 상속받을 때 강제로 작성해야하는 기능이 존재합니다. 표기
public abstract class Post {
    // 공통 필드
    protected String postId; // 게시글 ID
    protected String title; // 제목
    protected String author; // 작성자
    protected String content; // 내용
    
    // 생성자
    public Post() {
    }
    public Post(String postId, String title, String author, String content) {
        this.postId = postId;
        this.title = title;
        this.author = author;
        this.content = content;
    }

    // 게터 세터
    public String getPostId() {
        return postId;
    }
    public void setPostId(String postId) {
        this.postId = postId;
    }
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
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    // 메소드
    public void like(){
        System.out.println(getTitle() + "게시글에 좋아요를 눌렀습니다.");
    }
    public void share(){
        System.out.println(getTitle() + "게시글을 공유했습니다.");
    }

    // 추상 메소드
    public abstract void displayPost();
}
// 접근제한
// 접근 범위
// default 배포 전 기능적으로 쓸 때  -> 로그인 / 로그아웃
