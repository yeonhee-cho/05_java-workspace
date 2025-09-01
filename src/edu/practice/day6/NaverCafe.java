package edu.practice.day6;

public class NaverCafe extends NaverShopping {
    private String cafeGrade; // 카페 등급
    private int articleCount; // 작성글 수

    public NaverCafe(){
        super();
    }

    public NaverCafe(String serviceName, String userId, String userNickname, int userLevel) {
        super(serviceName, userId, userNickname, userLevel);
    }

    public NaverCafe(String serviceName, String userId, String userNickname, int userLevel, String cafeGrade, int articleCount) {
        super(serviceName, userId, userNickname, userLevel);
        this.cafeGrade = cafeGrade;
        this.articleCount = articleCount;
    }

    public String getCafeGrade() {
        return cafeGrade;
    }

    public void setCafeGrade(String cafeGrade) {
        this.cafeGrade = cafeGrade;
    }

    public int getArticleCount() {
        return articleCount;
    }

    public void setArticleCount(int articleCount) {
        this.articleCount = articleCount;
    }

    @Override
    public void search() {
        System.out.println("카페에서 게시글을 검색합니다.");
    }

    @Override
    public void writeContent() {
        System.out.println("카페 게시글을 작성합니다.");
    }

    @Override
    public void showUserInfo(){
        super.showUserInfo();
        System.out.println("카페 등급 : " + getCafeGrade());
        System.out.println("작성글 수 : " + getArticleCount());
    }

    // 카페 가입
    public void joinCafe(){
        System.out.println("카페 가입");
    }

    // 파일 업로드
    public void uploadFile(){
        System.out.println("파일 업로드");
    }
}
