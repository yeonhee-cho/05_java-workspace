package edu.polymorphism.pack3.ex2;

/**
 * 추상 없는 부모클래스 공통된 필드 + 공통된 메서드 작성
 */
public class DeliveryApp {
    protected String appName; // 어플이름
    protected String userName; // 유저이름

    public DeliveryApp() {
    }
    public DeliveryApp(String appName, String userName) {
        this.appName = appName;
        this.userName = userName;
    }

    public String getAppName() {
        return appName;
    }
    public void setAppName(String appName) {
        this.appName = appName;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    // 공통 메서드
    public void showAccount(){
        System.out.println("[" + getAppName() + "]" + getUserName() + "님의 계정입니다.");
    }

    public void payMoney(int amount){ // DB에서 가져오거나 저장할 데이터가 아니기 때문에 우선은 get이 아님
        System.out.println("[" + getAppName() + "]" + amount + "원을 결제했습니다.");
    }
}
