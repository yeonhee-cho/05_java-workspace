package edu.oop.constructor;

public class MemberRun {
    public static void main(String[] args) {
        // html에서 사용자에게 전달할 데이터나 사용자가 작성한 데이터를
        // setter getter를 활용해서 가져오고 전달하는 기능 수행
        // 회원객체 생성 객체 이름은 m 기본생성자 매개변수가 존재하지 않음
        Member m = new Member();

        // html 에서 기입한 회원정보를 가져옴

        // 가입할 때, 이미 존재하는 email이 존재하는지 확인하고 저장

        if("데이터 베이스에서 email 컬럼에 사용자가 작성한 이메일이 존재한다면" == ""){
            // return "이미 존재하는 이메일입니다.";
        }
        // 이메일이 존재하지 않음
        // m.setEmail(); // 개발자가 사용자가 작성한 이메일이 존재하는지 확인 검증에서 ok가 되면
        // DB에 저장하기 전에 자바에서 데이터 담아두기 설정

        if("데이터 베이스에서 nickname 컬럼에 사용자가 원하는 닉네임을 누군가 이미 쓰고 있다면" == ""){
            // return "이미 사용중인 닉네임입니다. 를 html에 전달해주기";
        }
        // 존재하지 않는 닉네임
        // 원m.setNickname(); // DB에 저장하기 전에 자바에서 데이터 담아두기 설정

        // 추후 set으로 가져오거나 매개변수 생성자로 가져온 데이터를 DB레 저장하는 로직 작성
    }
}
