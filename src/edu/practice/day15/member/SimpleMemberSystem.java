package edu.practice.day15.member;

/**
 * 메인 클래스
 */

/**
 * ╔══════════════════════════════════╗
 * ║          회원 관리 시스템         ║
 * ║                                  ║
 * ║                                  ║
 * ╚══════════════════════════════════╝
 *
 * 시스템 폴더가 생성되었습니다:
 *    - 데이터: C:\MemberSystem\data
 *    - 이미지: C:\MemberSystem\images
 *
 * ════════════════════════════════════
 * 메인 메뉴
 * 1. 회원가입
 * 2. 프로그램 종료
 * ════════════════════════════════════
 * 선택하세요 (1-2): 1
 *
 * 회원가입
 * ════════════════════════════════════
 * 아이디 (3자 이상): user1
 * 비밀번호 (4자 이상): 1234
 * 이름: 김철수
 * 이메일: kim@email.com
 * 전화번호: 010-1234-5678
 * 이미지 URL (없으면 Enter): https://example.com/profile.jpg
 *
 * 처리 중...
 * 회원 정보가 저장되었습니다.
 * 회원가입이 완료되었습니다!
 * 이미지는 다음 폴더에 저장하세요: C:\MemberSystem\images
 *
 * 엔터키를 눌러 계속...
 */
public class SimpleMemberSystem {
    public static void main(String[] args) {
        FileManager fm = new FileManager();
        fm.createFolders();
        try {
            // MenuSystem 객체 생성 및 start() 호출
        } catch (Exception e) {
            // 예외 발생시 에러 메시지 출력
        }
    }
}
