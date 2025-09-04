package edu.collection.pack1.service;

import edu.collection.pack1.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// service.ListService로 폴더와 클래스 한 번에 만들기
public class ListService {
    // List : 자료를 순차적으로 나열한 자료 구조(배열 비슷)
    // -> 인덱스가 존재함
    // -> 인덱스로 순서가 구분되기 때문에 중복 데이터 저장 가능
    // 인덱스란? 0번부터 순차적으로 변수 명칭이나 데이터들에 자리번호를 생성하는 것
    // for 문 작성할 때 사용하는 i = index 의 약자로 많이 사용됨

    /**
     * List 사용해보기 -> Array 보다 편리함
     */
    public void method1(){
        int[] a = {1,2,3};
        String[] b = {"1","2","3"}; // String 문자열이기 때문에 "" 로 감싸진 데이터 이 외 모두 불가
        // 위와 같이 목록 데이터 형태를 만들 때, 자료의 제약을 해결하기 위해 만들어진 컬렉션
        // List list = new ArrayList(E);
        // E = element 요소로 숫자, 문자, 논리형 등 값을 가리지 않고, 모든 자료형이 들어갈 수 있음
        
        // List 객체 생성
        // - List(인터페이스) : 특정 기능을 기준으로 만들어진 클래스 파일을 이용할 예정
        //                      -> 인터페이스 이기 때문에 객체 생성 불가 -> 다형성을 이용해서 사용
        // - ArrayList(클래스 문서가 존재) List의 후손 클래스
        List list = new ArrayList(); // ArrayList 는 고무줄처럼 공간이 늘었다 줄었다 하기 때문에 처음부터 몇 칸인지 설정을 안해줘도 됨

        // 1. .add(E e); 목록에서 마지막에 e에 해당하는 데이터를 추가
        // add 를 작성하는 만큼 무제한으로 추가됨
        list.add(1);
        list.add("아무거나 작성합니다.");
        
        System.out.println("List : " + list);
        
        // 2. E get(int index) : List에서 index 번째 요소 반환 받기
        
        // 3. int size() : List에 저장된 요소(객체)의 개수를 반환 length 대신 사용
        System.out.println("list 변수이름에 저장된 데이터 개수 : " + list.size());

        // List에서 ArrayList는 언제 사용하는가?
        // -> 회원 목록 조회, 검색한 데이터를 모두 가져올 때, 상품리스트 모두 조회 등
        // 데이터를 DB에서 2개 이상 가지고 온 후, 사용자에게 보여주어야 할 때 사용
    }

    /**
     * 컬렉션 List + 제너릭(타입제한)
     * ArrayList 형태인데, 목록에 들어올 수 있는 자료형을 개발자가 제한한 목록 리스트
     */
    public void method2(){
        // String 데이터만 무제한으로 담고ㅡ 무제한으로 목록을 제거할 수 있는 리스트
        // 앞 <> 에는 필수로 String 형태만 담을 수 있도록 설정, 오른쪽 <> 에는 String을 작성해도 되고, 안해도 됨
        // List<String> strList = new ArrayList<>();
        List<String> strList = new ArrayList<String>();
        
        strList.add("닭갈비");
        strList.add("치킨");
        strList.add("보쌈");
        // strList.add(1234); // 필요한 타입 : String , 제공된 타입 : int
        // strList에서 필요한 타입은 String 인데 int타입이 제공되어서 발생하는 문제

        System.out.println("strList 0번 째 : " + strList.get(0));
        System.out.println("strList 1번 째 : " + strList.get(1));
        System.out.println("strList 2번 째 : " + strList.get(2));
        // System.out.println("strList 3번 째 : " + strList.get(3)); // ArrayList 데이터가 3개만 있는데 4개를 불러와서 문제 발생 
        // 오류 : Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3

        System.out.println("=".repeat(20) + " for문을 활용하여 출력하기 " + "=".repeat(20));
        // for문
        // 위 작성해준 get처럼 반복형태의 경우는 for문을 활용해서 한 번에 출력 가능
        for (int i = 0; i < strList.size(); i++) {
            System.out.println("strList " + i + "번 째 : " + strList.get(i)); // 와 같이 작성 가능
        }
        
        // 3. void add(int index, E e) : index 번 째에 중간에 삽입 가능
        strList.add(1, "막국수");
        
        // 4. String toString() : List 인터페이스를 만들면서 toString을 추가로 작성하는 것에 번거로움을 느낌
        System.out.println(strList); // strList.toString(); 마치 작성한 것처럼 리스트 내부의 값을 전체 조회 가능

        // 5. E set(int index, E e) :
        // index 번 째 요소를 e로 수정해주고 수정 전 요소가 반환된 다음 수정됨
        // 수정전str 변수이름에는 치킨에서 양념치킨으로 데이터가 수정되기 전의 데이터 상태로 저장됨
        // 그리고 나서 strList 2번 째 index의 데이터가 변화됨
        String 수정전str = strList.set(2,"양념치킨");
        System.out.println("수정 전 str : " + 수정전str);
        System.out.println("수정 후 str : " + strList.get(2));
        System.out.println(strList);
        
        // 6. int indexOf(E e) : 
        // List 내부에 e와 같은 요소가 있으면 해당 인덱스 값을 반환, 없으면 무조건 -1 값을 반환
        System.out.println(strList.indexOf("보쌈")); // 인덱스 3번 자리에 위치
        System.out.println(strList.indexOf("막국수")); // 인덱스 1번 자리에 위치
        System.out.println(strList.indexOf("콩국수")); // -1 strList에 존재하지 않음

        // 7. boolean contains(E e) :
        // List 내부에 e와 같은 요소가 있으면 true, 없으면 false로 반환, 요소 존재 유무
        System.out.println(strList.contains("막국수")); // true
        System.out.println(strList.contains("콩국수")); // false

        // 8. E remove(int index) :
        // index 번 째 요소를 제거
        // -> 제거된 요소가 반환됨
        String target = strList.remove(0); // 0번 째 인덱스 요소를 제거하겠다.
        // target에는 strList 에서 제거되기 전에 제거될 데이터의 값이 담겨진 후 해당 데이터가 제거됨
        System.out.println("제거된 요소 : " + target);
        System.out.println(strList);
    }

    /**
     * List : 목록에 관련된 컬렉션
     * ArrayList : 배열 형태의 리스트
     * - 장점 : 검색이 빠름
     * - 단점 : 중간 삽입, 제거가 느림
     * - 사용 예시 : 학생 성적 관리(조회가 많은 경우)
     *               게시판 목록(순서대로 보기)
     *              설정 값들 저장(가끔 수정)
     *              대부분의 일반적인 상황은 거의 사용
     *
     * LinkedList : 서로 연결된 링크 형태의 리스트(기차)
     * - 장점 : 중간 삽입, 제거가 빠름
     * - 단점 : 검색이 느림
     * - 사용 예시 : 음악 플레이리스트(중간에 곡 삽입/삭제)
     *              실행 취소 기능 (앞 뒤로 이동)
     *              대기열 관리 (앞에서 째고 뒤에서 넣기)
     * 
     * 대부분의 경우에는 ArrayList를 주로 사용
     * LinkedList 의 경우에는 중간에 삽입/삭제가 정말 많을 때만 사용하고, 확실한 이유가 있을 때만 사용
     */

    public void bookManage(){
        // while 이용해서 도서 추가, 전체 조회, 종료
        List<Book>  bookList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int input = 0; // 추후 메뉴 번호를 입력받고, 번호를 가지고 있을 공간의 명칭 = input

        while(true){

        }
    }
}
