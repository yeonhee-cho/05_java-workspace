package edu.collection.pack1.ex1;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeRun {
    // model, service, run 으로 나누지 않고 한 번에 작업,
    // 메인메서드에서 모든 동작을 진행할 예정,
    // 왜냐하면 List - ArrayList를 단순히 익히기 위한 실습이기 때문에 한 번에 작성
    public static void main(String[] args) {
        // problem1(); // function javascipt 처럼 기능 실행 가능
        // problem2();
        // problem3();
        // problem4();
        problem5();
    }

    // void 앞에 static이 붙는다는 것은 변수이름에 의하여 호출되지 않고, 
    // 기능들 단독적으로 호출할 수 있도록 사용한다는 의미
    // 나의 취미 리스트 만들기
    public static void problem1(){
        System.out.println("제대로 단독적으로 실행가능한지 확인합니다.");

        // 1. String 타입의 ArrayList를 생성하세요
        List<String> list = new ArrayList<>();

        // 2. 본인의 취미 3개를 추가하세요 (예: "게임", "독서", "요리")
        list.add("게임");
        list.add("독서");
        list.add("요리");

        // 3. 리스트의 크기를 출력하세요
        System.out.println(list.size());

        // 4. 모든 취미를 출력하세요 (반복문 사용)
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    // 점수 관리 시스템
    public static void problem2() {
        // 1. Integer 타입의 ArrayList를 생성하세요
        List<Integer> list = new ArrayList<>();

        // 2. 시험 점수 5개를 추가하세요 (85, 90, 78, 92, 88)
        list.add(85);
        list.add(90);
        list.add(78);
        list.add(92);
        list.add(88);

        // 3. 3번째 점수(인덱스 2)를 95로 수정하세요
        list.set(2, 95);

        // 4. 수정 후 모든 점수를 출력하세요
        System.out.println(list);

        // 5. 가장 첫 번째 점수를 제거하고, 제거된 점수를 출력하세요
        int removeItem = list.remove(0);
        System.out.println("제거된 점수 : " + removeItem);

        System.out.println(list);
    }

    // 음식 메뉴 검색
    public static void problem3() {
        // 1. 음식 메뉴 리스트를 만들고 다음 메뉴를 추가하세요
        //    "김치찌개", "된장찌개", "불고기", "비빔밥", "냉면"
        List<String> list = new ArrayList<>();
        list.add("김치찌개");
        list.add("된장찌개");
        list.add("불고기");
        list.add("비빔밥");
        list.add("냉면");

        // 2. "불고기"가 몇 번째 인덱스에 있는지 출력하세요
        System.out.println(list.indexOf("불고기"));

        // 3. "라면"이 메뉴에 있는지 확인하세요 (true/false 출력)
        System.out.println(list.contains("라면"));

        // 4. "김치찌개"가 메뉴에 있는지 확인하세요
        System.out.println(list.contains("김치찌개"));
        
        // 5. 마지막 메뉴("냉면")를 제거하고 결과를 출력하세요
        list.remove("냉면");
        System.out.println(list);
    }

    // 간단한 쇼핑 카트
    public static void problem4() {
        // 1. 쇼핑 카트 리스트를 만드세요
        List<String> list = new ArrayList<>();

        // 2. "사과", "바나나", "우유" 를 추가하세요
        list.add("사과");
        list.add("바나나");
        list.add("우유");

        // 3. 장바구니에 총 몇 개 상품이 있는지 출력하세요
        System.out.println(list.size());

        // 4. 2번째 상품을 "오렌지"로 바꾸세요
        list.set(1, "오렌지");
        System.out.println(list); // 확인

        // 5. 모든 상품을 "상품: 사과", "상품: 오렌지" 형태로 출력하세요
        for (int i = 0; i < list.size(); i++) {
            System.out.println("상품: " + list.get(i));
        }
    }

    //
    public static void problem5() {
        // 1. 숫자 리스트를 만들고 [1, 3, 5, 7, 9, 2, 4, 6, 8, 10] 을 추가하세요
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);

        // 2. 짝수만 찾아서 출력하세요 (힌트: 숫자 % 2 == 0)
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0){
                System.out.print(list.get(i) + " ");
            }
        }
        System.out.println();

        // 3. 5보다 큰 숫자의 개수를 세어보세요
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) > 5){
                count++;
            }
        }
        System.out.println("5보다 큰 숫자의 개수 : " + count);

        // 4. 가장 큰 숫자를 찾아서 출력하세요
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            max = Math.max(max, list.get(i));
        }
        System.out.println("가장 큰 숫자 : " + list.size());
    }


}
