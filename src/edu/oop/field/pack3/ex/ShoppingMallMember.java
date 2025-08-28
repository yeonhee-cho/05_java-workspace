package edu.oop.field.pack3.ex;

public class ShoppingMallMember {
    // 공유 정보 (static)
    public static int totalMemberCount; // 전체 회원 수
    public static int dailyVisitorCount; // 일일 방문자 수

    // 공통 규정 (static final)
    public static final String SHOPPING_MALL_NAME = "가나다 온라인 쇼핑몰";
    public static final String SERVICE_CENTER_NUMBER = "1588-1234";
    public static final int MAX_CART_ITEMS = 50;
    public static final int MIN_PASSWORD_LENGTH = 8;

    // 개인 정보 (인스턴스 변수)
    private String memberId;
    private String memberName;
    private String email;
    private int cartItemCount;

    // 인스턴스 초기화 블록
    {
        memberId = "guest123";
        memberName = "게스트";
        email = "guest@emall.com";
        cartItemCount = 0;
    }

    // static 초기화 블록
    static {
        totalMemberCount = 0;
        dailyVisitorCount = 0;
        System.out.println("=== " + SHOPPING_MALL_NAME + " 시스템 시작 ===");
    }

    public ShoppingMallMember() {
    }

    // setter 메서드들
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCartItemCount(int cartItemCount) {
        this.cartItemCount = cartItemCount;
    }

    // getter 메서드들
    public String getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getEmail() {
        return email;
    }

    public int getCartItemCount() {
        return cartItemCount;
    }

    // 메서드 개발자가 만들어 놓은 기능들
    // 회원가입 (전체 회원 수 +1)
    public void joinMember(){
        totalMemberCount++;
        System.out.printf("%s님이 회원가입하셨습니다. (회원번호: %s)\n", getMemberName(), getMemberId());
        /*
        * getMemberName()과 memberName는 캡슐화 규칙인지 아닌지의 차이
        * */
    }

    // 사이트 방문 (일일 방문자 수 +1)
    public void visitSite(){
        dailyVisitorCount++;
        System.out.println("----- 회원가입 후 통계 -----");
        System.out.printf("%s님이 사이트를 방문했습니다.", getMemberName());


    }

    // 장바구니 추가
    public void addToCart(int itemCount){
        // char String 은 equals를 활용
        // static final에 관계없이 >= > <= < ==과 같은 부등호는
        //       int              int           int와 같이 숫자(실수, 정수)에만 가능
        if(MAX_CART_ITEMS >= cartItemCount + itemCount) {
            cartItemCount += itemCount;
            System.out.printf("%s님이 장바구니에 %d개 상품을 추가했습니다.\n", getMemberName(), itemCount);
        } else {
            System.out.printf("장바구니 최대 수량(%d)를 초과할 수 없습니다.\n",MAX_CART_ITEMS);
        }
    }

    // 회원 정보 출력
    public void printMemberInfo(){
        System.out.println("회원ID : " + getMemberId());
        System.out.println("회원명 : " + getMemberName());
        System.out.println("이메일 : " + getEmail());
        System.out.println("장바구니 : " + getCartItemCount());
    }
}
