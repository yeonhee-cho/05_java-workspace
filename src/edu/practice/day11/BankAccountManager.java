package edu.practice.day11;

import java.util.*; // util 내 모든 문서 파일

public class BankAccountManager {
    /**
     * try-catch가 없는 기능
     */
    public void method1() {
        Map<String, Integer> accountMap = new HashMap<>(); // 계좌번호 : 잔액
        Map<String, String> ownerMap = new HashMap<>();   // 계좌번호 : 예금주명
        Scanner sc = new Scanner(System.in);

        // 초기 데이터
        accountMap.put("1001-2345", 50000);
        accountMap.put("2002-3456", 75000);
        accountMap.put("3003-4567", 120000);
        ownerMap.put("1001-2345", "김철수");
        ownerMap.put("2002-3456", "이영희");
        ownerMap.put("3003-4567", "박민수");

        System.out.print("계좌번호를 입력하세요: ");
        String accountNumber = sc.nextLine();

        // 계좌번호 확인
        Integer 해당계좌금액 = accountMap.get(accountNumber); // accountMap에서 계좌번호에 해당하는 금액은 숫자(Integer)에 해당
        System.out.println("해당계좌금액 : " + 해당계좌금액);
        // 계좌번호 존재 여부 확인 (null 체크)
        if(해당계좌금액 == null){ // 돈이 없거나 계좌가 없어서 null 일 경우
            // 출금 금액 입력 시 NumberFormatException 처리
            throw new NumberFormatException("오류 : 입력하신 계좌번호가 존재하지 않습니다.");
            // return; // return이 내부에 존재하기 때문에 return 을 추가로 작성할 필요가 없음
            // throw new 이후 코드 실행할 수 없기 때문
        }

        System.out.print("출금할 금액을 입력하세요: ");
        int 출금할금액 = sc.nextInt();
        sc.nextLine();

        // 잔액 부족 시 IllegalArgumentException 발생 및 처리
        if(해당계좌금액 < 출금할금액){
            throw new IllegalArgumentException("잔액이 부족합니다. " + 해당계좌금액 + "원");
        }
    }
    /**
     * try-catch가 있는 기능
     */
    public void method2() {
        Map<String, Integer> accountMap = new HashMap<>(); // 계좌번호 : 잔액
        Map<String, String> ownerMap = new HashMap<>();   // 계좌번호 : 예금주명
        Scanner sc = new Scanner(System.in);

        // 초기 데이터
        accountMap.put("1001-2345", 50000);
        accountMap.put("2002-3456", 75000);
        accountMap.put("3003-4567", 120000);
        ownerMap.put("1001-2345", "김철수");
        ownerMap.put("2002-3456", "이영희");
        ownerMap.put("3003-4567", "박민수");

        System.out.print("계좌번호를 입력하세요: ");
        String accountNumber = sc.nextLine();
        try {
            // 계좌번호 확인
            Integer 해당계좌금액 = accountMap.get(accountNumber); // accountMap에서 계좌번호에 해당하는 금액은 숫자(Integer)에 해당
            System.out.println("해당계좌금액 : " + 해당계좌금액);
            // 계좌번호 존재 여부 확인 (null 체크)
            if(해당계좌금액 == null){ // 돈이 없거나 계좌가 없어서 null 일 경우
            // 출금 금액 입력 시 NumberFormatException 처리
                throw new NumberFormatException("오류 : 입력하신 계좌번호가 존재하지 않습니다.");
                // return; // return이 내부에 존재하기 때문에 return 을 추가로 작성할 필요가 없음
                // throw new 이후 코드 실행할 수 없기 때문
            }

            System.out.print("출금할 금액을 입력하세요: ");
            int 출금할금액 = sc.nextInt();
            sc.nextLine();

            // 잔액 부족 시 IllegalArgumentException 발생 및 처리
            if(해당계좌금액 < 출금할금액){
                throw new IllegalArgumentException("잔액이 부족합니다. " + 해당계좌금액 + "원");
            }

            System.out.print("계좌번호 주인의 성함을 입력하세요. : ");
            String 계좌주인이름 = sc.nextLine();
            // 계좌번호에서 가져온 계좌 주인이 일치하는지 일치하지 않은지 확인
            // 일치하지 않으면 NotFoundUserException을 이용해서 
            // 일치하는 계좌의 주인이 존재하지 않습니다. 출력
            String 해당계좌주인이름 = ownerMap.get(accountNumber); // 위에서 입력받은 계좌번호를 넣어서 계좌주인을 찾겠다.
            if(!해당계좌주인이름.equals(계좌주인이름) || 해당계좌주인이름 == null) {
                throw new NotFoundUserException("일치하는 계좌의 주인이 존재하지 않습니다.");
            } else {
                accountMap.put(accountNumber, 해당계좌금액 - 출금할금액);
                System.out.println("출금이 완료되었습니다. 남은 잔액 : " + (해당계좌금액 - 출금할금액) + "원");
            }
        } catch(NotFoundUserException e){
            System.out.println("일치하는 계좌의 주인이 존재하지 않습니다.");
        }  catch (NumberFormatException e) {
            System.out.println("오류 : 입력하신 계좌번호가 존재하지 않습니다.");
        } catch (IllegalArgumentException e) {
            System.out.println("잔액이 부족할 때 추후 관련 작업 진행 코드 작성");
        } catch (Exception e) {
            System.out.println("00 은행에서 생각치 못 한 문제가 발생했습니다.");
        } finally {
            // finally에서 Scanner 종료 및 "거래 완료" 메시지
            sc.close();
            System.out.println("거래 완료");
        }

    }
}
