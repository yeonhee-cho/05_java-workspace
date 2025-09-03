package edu.practice.day7.model;

/**
 * 부모 클래스 이지만
 * 부모클래스를 상속받은
 * 자식 클래스 들이 반드시 작성해야하는 기능이 포함되어 있는 클래스
 */
public abstract class KakaoService {
    // 공통 필드
    protected String serviceName;
    protected String userId;
    protected String userNickname;
    protected boolean  isLoggedIn;

    // 서비스 타입 구분용
    private String serviceType; // "TALK", "PAY", "MAP"


    // 생성자
    public KakaoService() {
    }
    public KakaoService(String serviceName, String userId, String userNickname,String serviceType) {
        this.serviceName = serviceName;
        this.userId = userId;
        this.userNickname = userNickname;
        this.isLoggedIn = false;
        this.serviceType = serviceType;
    }

    // getter / setter
    public String getServiceName() {
        return serviceName;
    }
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserNickname() {
        return userNickname;
    }
    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }
    public boolean isLoggedIn() {
        return isLoggedIn;
    }
    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    // 일반 메서드
    // 로그인 메서드
    public void login() {
        this.isLoggedIn = true;
        System.out.println(getUserNickname() + "님이 " + getServiceName() + "에 로그인했습니다.");
    }

    // 로그아웃 메서드
    public void logout() {
        this.isLoggedIn = false;
        System.out.println(getUserNickname() + "님이 " + getServiceName() + "에서 로그아웃했습니다.");
    }

    // 사용자 정보 표시
    public void showUserInfo(){
        System.out.println("=== 사용자 정보 ===");
        System.out.println("서비스: " + serviceName);
        System.out.println("아이디: " + userId);
        System.out.println("닉네임: " + userNickname);
        System.out.println("로그인 상태: " + (isLoggedIn ? "로그인" : "로그아웃"));
        System.out.println("서비스 타입: " + serviceType);
    };


    // 추상 메서드
    public abstract void startService();
    public abstract void stopService();
    public abstract String getServiceType();
    public abstract void performSpecialAction();

    // 서비스 시작 (모든 서비스를 하나의 메서드에서 처리)
    public abstract void sendNotification(String message);
    public abstract void receiveNotification(String message);
}
