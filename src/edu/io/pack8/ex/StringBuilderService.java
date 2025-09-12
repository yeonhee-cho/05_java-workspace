package edu.io.pack8.ex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StringBuilderService {
    // 도서 정보 저장하기
    /**
     * 도서 정보를 입력하세요 (완료를 입력하면 저장됩니다)
     * 제목: 자바의 정석
     * 저자: 남궁성
     * 출판년도: 2022
     * 제목: 완료
     *
     * 도서 목록이 저장되었습니다: book_list.txt
     * 저장된 내용:
     * 제목: 자바의 정석, 저자: 남궁성, 출판년도: 2022
     */
    public void saveBooks() {
        Scanner sc = new Scanner(System.in);
        Path bookDir = Path.of("books");
        Path bookFile = Path.of("books", "book_list.txt");
        StringBuilder bookData = new StringBuilder();

        try {
            Files.createDirectories(bookDir);
            System.out.println("도서 정보를 입력하세요 (완료를 입력하면 저장됩니다)");

            while (true) {
                System.out.print("제목 : ");
                String title = sc.nextLine();

                if(title.equals("완료")) {
                    break; // 기능 중지
                }

                System.out.print("저자 : ");
                String author = sc.nextLine();
                System.out.print("출판년도 : ");
                String year = sc.nextLine();

                bookData.append("제목: " + title + ", 저자: " + author + ", 출판년도: " + year  + "\n");
                System.out.println();
            }

            Files.writeString(bookFile, bookData.toString());
            // while 로 데이터를 추가하는 동안은 파일 아래에 지속적으로 추가되지만,
            // savaBooks 을 다시 실행하면 초기화 된 상태로 데이터가 다시 저장됨
            // 이어쓰기인지 매번 새로운 파일을 만드는지 파일을 만드는 목표를 확인하고, 옵션 설정
            System.out.println("도서 목록이 저장되었습니다: " + bookFile.getFileName());
            String content = Files.readString(bookFile);
            System.out.println("저장된 내용 : " + content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    // 학생 성적 관리 (날짜별로 저장)
    /**
     * 학생 성적을 입력하세요 (종료를 입력하면 저장됩니다)
     * 이름: 김철수
     * 국어: 85
     * 영어: 90
     * 수학: 78
     * 이름: 종료
     *
     * 오늘 성적표가 작성되었습니다: 2025-09-12_성적표.txt
     */
    public void manageGrades() {
        Scanner sc = new Scanner(System.in);
        String today = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        Path gradeDir = Path.of("grades");
        Path gradeFile = Path.of("grades", today + "_성적표.txt");
        StringBuilder gradeData = new StringBuilder();


        try {
            // 1. 폴더 확인 및 생성
            Files.createDirectories(gradeDir);
            System.out.println("학생 성적을 입력하세요 (종료를 입력하면 저장됩니다)");

            while (true) {
                System.out.print("이름 : ");
                String name = sc.nextLine();

                if(name.equals("종료")) {
                    break;
                }

                System.out.print("국어 : ");
                int ko = sc.nextInt();
                sc.nextLine();
                System.out.print("영어 : ");
                int en = sc.nextInt();
                sc.nextLine();
                System.out.print("수학 : ");
                int math = sc.nextInt();
                sc.nextLine();

                double avg = (ko + en + math)/3.0;
                gradeData.append("이름: " + name + ", 국어: " + ko + ", 영어: " + en + ", 수학: " + math  + ", 평균: " + avg + "\n");
            }
            // 모든 입력이 완료되어, 종료를 작성했다면
            Files.writeString(gradeFile, gradeData.toString());
            System.out.println("오늘 성적표가 작성되었습니다: " + gradeFile.getFileName());
            String content = Files.readString(gradeFile);
            System.out.println("저장된 내용 : " + content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 가계부 기록 남기기
    /**
     * 가계부 내역을 입력하세요 (끝을 입력하면 저장됩니다)
     * 항목: 급여
     * 금액: 3000000
     * 수입/지출: 수입
     * 항목: 끝
     *
     * 가계부 기록이 추가되었습니다.
     * === 전체 가계부 기록 ===
     * 2025-09-12 14:30:25 - 급여: +3000000원 (수입)
     */
    public void recordAccount() {
        Scanner sc = new Scanner(System.in);
        Path householdDir = Path.of("household");
        Path accountFile = Path.of("household", "account_book.txt");
        String timestamp = getCurrentTime();
        StringBuilder accountData = new StringBuilder();

        System.out.println("가계부 내역을 입력하세요 (끝을 입력하면 저장됩니다)");

        while (true) {
            System.out.print("항목 : ");
            String title = sc.nextLine();

            if(title.equals("끝")) {
                break;
            }
            System.out.print("금액 : ");
            int price = sc.nextInt();
            sc.nextLine();
            // 숫자나 소수자리는 작성하고 나면 줄바꿈처리가 되기 때문에 반드시 nextLine() 넣어주기

            System.out.print("수입/지출 : ");
            String type = sc.nextLine();

            accountData.append(timestamp + " - " + title + " : " + price + "원 (" + type + ")\n");
        }

        try {
            Files.createDirectories(householdDir);
            Files.writeString(accountFile, accountData.toString(), StandardOpenOption.CREATE,  StandardOpenOption.APPEND);
            System.out.println("가계부 기록이 추가되었습니다.\n" +
                    "=== 전체 가계부 기록 ===");
            String content = Files.readString(accountFile);
            System.out.println(content);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public String getCurrentTime(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    // 고객 정보 등록
    /**
     * 고객 정보를 입력하세요 (exit을 입력하면 저장됩니다)
     * 이름: 박민수
     * 전화번호: 010-1234-5678
     * 이메일: park@email.com
     * 주소: 서울시 강남구
     * 이름: exit
     *
     * 새로운 고객 명단을 생성합니다.
     * 고객 명단이 저장되었습니다: customer_list.txt
     */
    public void registerCustomer(){
        Path customerDir = Path.of("customers");
        Path customerFile = Path.of("customers", "customer_list.txt");
        StringBuilder customerData = new StringBuilder();
        // Files.exists()
        // StandardOpenOption.CREATE

        System.out.println("고객 정보를 입력하세요 (exit을 입력하면 저장됩니다)");
        while(true) {
            Scanner sc = new Scanner(System.in);

            System.out.print("이름 : ");
            String name = sc.nextLine();

            if(name.equals("exit")) {
                break;
            }

            System.out.print("전화번호 : ");
            String phone = sc.nextLine();
            System.out.print("이메일 : ");
            String email = sc.nextLine();
            System.out.print("주소 : ");
            String address = sc.nextLine();

            customerData.append("이름 : " + name + "\n전화번호 : " + phone + "\n이메일 : " + email + "\n주소 : " + address + "\n");
        }
        try {
            if(!Files.exists(customerFile.getParent())){
                Files.createDirectories(customerDir);
                Files.writeString(customerFile, customerData.toString(), StandardOpenOption.CREATE);
                System.out.println("\n새로운 고객 명단을 생성합니다.");
                System.out.println("고객 명단이 저장되었습니다 : " + customerFile.getFileName());
                String content = Files.readString(customerFile);
                System.out.println(content);
            } else {
                System.out.println("\n기존 고객 명단을 업데이트합니다.");
                Files.writeString(customerFile, customerData.toString(), StandardOpenOption.CREATE);
                String content = Files.readString(customerFile);
                System.out.println(content);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 메뉴 주문 시스템
    /**
     * 메뉴 주문을 입력하세요 (주문완료를 입력하면 저장됩니다)
     * 메뉴명: 김치찌개
     * 수량: 2
     * 가격: 8000
     * 메뉴명: 주문완료
     *
     * 주문 내역이 저장되었습니다: order_history.txt
     */
    public void processOrder(){
        Path orderDir = Path.of("orders");
        Path orderFile = Path.of("orders", "order_history.txt");
        StringBuilder orderData = new StringBuilder();
        int totalAmount = 0;
        // getCurrentTime();

        System.out.println("메뉴 주문을 입력하세요 (주문완료를 입력하면 저장됩니다)");
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("메뉴명 : ");
            String menu = sc.nextLine();

            if(menu.equals("주문완료")) {
                break;
            }

            System.out.print("수량 : ");
            int amount = sc.nextInt();
            sc.nextLine();
            System.out.print("가격 : ");
            int price = sc.nextInt();
            sc.nextLine();

            int itemTotal = amount * price;
            totalAmount += itemTotal;

            orderData.append("메뉴: " + menu + ", 수량: " + amount + ", 단가: " + price + "원, 총액: " +  itemTotal + "원 \n");
        }
        try {
            Files.createDirectories(orderDir);
            String content = "=== 주문 내역서 ===\n" + "주문시간: " + getCurrentTime() + "\n" + orderData.toString() + "전체 주문금액: " + totalAmount + "원\n";
            Files.writeString(orderFile, content,StandardOpenOption.CREATE,  StandardOpenOption.APPEND);
            System.out.println("주문 내역이 저장되었습니다: " + orderFile.getFileName());
            content = Files.readString(orderFile);
            System.out.println(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
