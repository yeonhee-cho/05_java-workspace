package edu.polymorphism.pack2.ex1;

/**
 * 부모 클래스에 해당
 * 일반회원, VIP 회원
 * 필수로 Member 클래스를 상속받는 자식 클래스는 각 회원 타입에서 할인율을 다르게 구현
 * 로그인 로그아웃은 자식 클래스에서 굳이 추가적으로 구현하지 않아도 됨
 */
public abstract class Member {
    // 필그 인스턴스 변수 속성
    protected String memberId;
    protected String memberName;
    protected String memberEmail;

    // 기능들 () 붙으면 메서드
    // 디폴트(기본) 생성자 메서드
    public Member(){}
    
    // 파라미터(매개변수) 생성자 메서드
    public Member(String memberId, String memberName, String memberEmail) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberEmail = memberEmail;
    }
    
    // 게터 세터
    public String getMemberId() {
        return memberId;
    }
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
    public String getMemberName() {
        return memberName;
    }
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    public String getMemberEmail() {
        return memberEmail;
    }
    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }
    
    // 수정이 필요없는 공통 실행 기능 메서드 - 모든 회원이 동일하게 재활용없이 사용할 기능
    // log = 기록 blog = blog blob = 큰 데이터 저장 혹은 web + log
    // vlog = video  + log
    // login = 특정 프로그램 접속해서 개발자는 이 접속한 유저가 어떤 행동을 하는지 기록 시작
    // logout = 접속한 유저에 대한 기록을 중지하겠다.
    public void login(){
        System.out.println(getMemberName() + " 님이 로그인 했습니다.");
    }

    public void logout(){
        System.out.println(getMemberName() + " 님이 로그아웃 했습니다.");
    }

    // 오류 : 비추상 클래스에 추상 메서드가 있습니다-> public과 class 사이에 abstract
    // 필수로 자식클래스에서 작성해야한다는 표기가 존재하지 않는데 abstract를 쓰려고 할 때!
    public abstract double 할인율();

    public abstract void 쿠폰과혜택();
    // 일반Member는 보유하고 있는 쿠폰과 혜택이 존재하지 않습니다.
    // 구독서비스에 따라 쿠폰과 혜택을 받으실 수 있습니다.

    // 프리미엄Member는 현재 ooo쿠폰을 보유하고 있습니다.
    // 아쉽게도 혜택은 존재하지 않습니다.
    // VIP로 구독 업그레이드 하기

    // VIPMember는 현재 ooo 쿠폰과 ooo 혜택 이용이 가능합니다

    // 위 내용을 MemberService에서 회원.쿠폰과혜택()으로 확인하기
}
