package edu.practice.day15.member;

/**
 * 비즈니스 로직 클래스
 */
public class MemberService {
    private FileManager fileManager; // fileManager
    private Member currentUser; // currentUser (항상 null - 로그인 기능 없음)

    public MemberService() {
        // FileManager 초기화
        // currentUser는 null
        // fileManager.createFolders() 호출
    }

    // 회원가입
    public boolean register(String id, String password, String name, String email, String phone, String imageUrl) {
        // 1. isValidInput() 메서드로 입력값 검증
        // 2. isIdExists() 메서드로 ID 중복 검사
        // 3. 새 Member 객체 생성
        // 4. fileManager.saveMember() 호출
        // 5. 성공/실패 메시지 출력 후 boolean 반환
        return false;
    }

    // ID 중복 검사
    public boolean isIdExists(String id) {
        // fileManager.loadAllMembers()로 전체 회원 목록 가져오기
        // id와 일치하는 회원이 있으면 true, 없으면 false
        return false;
    }

    // 이미지 폴더 경로 반환
    public String getImagesFolderPath() {
        // fileManager.getImagesDir().toString() 반환
        return fileManager.getImagesDir().toString();
    }

    // 입력값 유효성 검사 (private)
    private boolean isValidInput(String id, String password, String name, String email, String phone) {
        // null 체크
        // trim() 후 길이 검사 (id: 3자 이상, password: 4자 이상)
        // 이메일에 "@" 포함 여부 확인
        // 전화번호 10자 이상 확인
        // 각 검증 실패시 에러 메시지 출력
        return false;
    }
}