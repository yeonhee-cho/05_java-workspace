package edu.practice.day15.member;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 회원 정보 클래스
 */
public class Member {
    private String id; // id - 회원 아이디
    private String password; // password - 비밀번호
    private String name; // name - 이름
    private String email; // email - 이메일
    private String phone; // phone - 전화번호
    private String imageUrl; // imageUrl - 이미지 URL
    private String joinDate; // joinDate - 가입일시
    private String lastLogin; // lastLogin - 마지막 로그인


    // 회원가입용 생성자 (6개 매개변수)
    public Member(String id, String password, String name, String email, String phone, String imageUrl) {
        // joinDate는 getCurrentTime() 메서드로 설정
        // lastLogin은 빈 문자열("")로 설정
    }

    // 파일에서 읽어올 때 생성자 (8개 매개변수)
    public Member(String id, String password, String name, String email, String phone, String imageUrl, String joinDate, String lastLogin) {
        // 모든 필드 초기화
    }

    // 현재 시간 반환 (private)
    private String getCurrentTime() {
        // LocalDateTime 사용하여 "2025-01-16 14:30:25" 형식으로 반환
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    // 파일 저장 형식으로 변환
    public String toFileFormat() {
        // "|"로 구분하여 모든 필드를 하나의 문자열로 반환
        // 예: "user1|1234|김철수|kim@email.com|010-1234-5678|https://...|2025-01-16 14:30:25|"
        return id + "|" + password + "|" + name + "|" + email + "|" + phone + "|" + imageUrl + "|" + joinDate + "|" ;
    }

    // 파일에서 읽은 문자열을 Member 객체로 변환 (static)
    public static Member fromFileFormat(String line) {
        // line.split("\\|")으로 분리하여 Member 객체 생성
        // 8개 요소가 있을 때만 객체 생성, 아니면 null 반환
        return null;
    }

    // toString() 오버라이드 - 회원 정보 보기좋게 출력
    // 모든 getter 메서드들
    // setLastLogin() 메서드만 (다른 setter는 없음)

}
