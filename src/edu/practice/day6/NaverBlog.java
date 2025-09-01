package edu.practice.day6;

public class NaverBlog extends NaverService{
    private int postCount; // 포스트 수
    private int visitorCount; // 방문자 수

    public NaverBlog(){
        super();
    }

    public NaverBlog(String serviceName, String userId, String userNickname, int userLevel) {
        super(serviceName, userId, userNickname, userLevel);
    }

    public NaverBlog(String serviceName, String userId, String userNickname, int userLevel, int postCount, int visitorCount) {
        super(serviceName, userId, userNickname, userLevel);
        this.postCount = postCount;
        this.visitorCount = visitorCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public void setPostCount(int postCount) {
        this.postCount = postCount;
    }

    public int getVisitorCount() {
        return visitorCount;
    }

    public void setVisitorCount(int visitorCount) {
        this.visitorCount = visitorCount;
    }

    @Override
    public void search() {
        System.out.println("블로그에서 포스트를 검색합니다.");
    }

    @Override
    public void writeContent() {
        System.out.println("블로그 포스트를 작성합니다.");
    }

    @Override
    public void showUserInfo(){
        super.showUserInfo();
        System.out.println("포스트 수 : " + getPostCount());
        System.out.println("방문자 수 : " + getVisitorCount());
    }

    // 이웃 추가
    public void addNeighbor() {
        System.out.println("이웃 추가");
    }

    // 테마 꾸미기
    public void customizeTheme() {
        System.out.println("테마 꾸미기");
    }
}
