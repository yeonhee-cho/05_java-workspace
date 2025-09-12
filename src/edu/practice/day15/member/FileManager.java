package edu.practice.day15.member;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * 파일 관리 클래스
 */
public class FileManager {
    private static final Path MEMBER_FILE = Path.of("C:", "MemberSystem", "data", "members.txt");
    private static final Path IMAGES_DIR = Path.of("C:", "MemberSystem", "images");

    // 폴더 생성
    public void createFolders() {
        // Files.createDirectories() 사용
        // 데이터 폴더와 이미지 폴더 생성
        try {
            Files.createDirectories(MEMBER_FILE.getParent());
            System.out.println(MEMBER_FILE.getParent() +  "폴더 생성 완료");
            Files.createDirectories(IMAGES_DIR.getParent());
            System.out.println(IMAGES_DIR.getParent() + "폴더 생성 완료");
            // 생성 완료 메시지 출력
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 회원 정보 저장 (추가)
    public void saveMember(Member member) {
        // member.toFileFormat() + "\n"
        // Files.writeString() 사용
        // StandardOpenOption.CREATE, StandardOpenOption.APPEND 옵션
    }

    // 모든 회원 정보 읽기
    public List<Member> loadAllMembers() {
        // Files.readAllLines() 사용
        // 각 줄을 Member.fromFileFormat()으로 변환
        // 빈 줄 제외하고 List<Member>로 반환
        return null;
    }

    // 이미지 폴더 경로 반환
    public Path getImagesDir() {
        return IMAGES_DIR;
    }

}
