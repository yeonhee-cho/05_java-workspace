package edu.polymorphism.pack1;

import org.w3c.dom.ls.LSOutput;

/**
 * Object 클래스 
 * 개발자가 만드는 모든 클래스(문서)는 extends Object를 한 상태에서 만들어짐
 * 
 * public class SmartPhone extends Object {
 *     
 * } 
 * 당연히 extends Object 를 작성해야하기 때문에 굳이! 작성하지 않음
 *
 * Object 개발자들이 기본적으로 필요하다 여기는 기능들을 작성해놓은 문서
 * Java 개발자를 포함하여 모든 개발자들이 만드는 Class 변수이름 뒤에 상속
 * 예) toString equals() : System.out.println();과 같은 형태로 모든 필드의 정보를 출력하기 위해
 *                        작성하는 코드를 단축하기 위하여 필드에 대한 정보를 출력하기 위해 만들어진 기능
 *
 *                         inheritance 에서 작성한 showInfo 와 같은 출력문을
 *                         toString 메서드를 활용해서 단축하여 작성 할 수 있음
 *    두 객체가 같은 클래스 주소를 가리키는가? 와 같은 비교
 * 
 * 부모 클래스 역할
 */
public class SmartPhone /* extends Object */ {
    // 인스턴스 변수, 필드, 속성
    protected String display; // 화면
    protected String newsAgency; // 통신사
    protected String ap; // 스마트폰 CPU

    // 메서드 시작!
    // 기본 생성자 : 파라미터가 하나도 없는 생성자
    public SmartPhone() {
    }

    // 매개변수 생성자 : 파라미터가 1개 이상 존재하는 생성자
    public SmartPhone(String display, String newsAgency, String ap) {
        this.display = display;
        this.newsAgency = newsAgency;
        this.ap = ap;
    }

    public String getDisplay() {
        return display;
    }

    public String getNewsAgency() {
        return newsAgency;
    }

    public String getAp() {
        return ap;
    }

    // 우리가 showInfo와 같은 출력문을 하나씩 작성하지 않아도 알아서 변수이름들에 대한 데이터 정보를 출력할 수 있도록 // TODO
    // 기능을 재사용하여 정보확인에 대한 기능을 편리하게 사용할 수 있음
    // Object class 객체 문서파일에서 메서드를 SmartPhone class 문서를 작성하는
    // 개발자가 SmartPhone class 문서 필드에 대한 정보를 확인할 수 있도록 재사용한 것
    @Override
    public String toString() { // Alt + Insert -> toString()
        return "SmartPhone{" +
                "display='" + display + '\'' +
                ", newsAgency='" + newsAgency + '\'' +
                ", ap='" + ap + '\'' +
                '}';
    }
}

// 객체 : A A를담을변수이름 = new A
// 폴더 이름
// main(){
//     sc.nextInt(); -> 1번을 클릭하면 google Drive
//     2번을 클릭하면 클래스룸
//     3번을 클릭하면 이메일
//
//     switch(){
//         case 1: GoogleDrive drive = new GoogleDrive();
//         case 2: ClassRoom cr = new ClassRoom();
//         case 3: Gmail g = new Gmail();
//     }
// }
// 
// ------------------------------------------------------------
// 
// 회원가입 HTML에서 소비자가 작성한 데이터를 DB에 저장하기 위해 Java를 통해 저장
// DB에 저장된 데이터 확인
// A. 생성자를 이용해서 특정 데이터를 사용할 수 있도록 전달
// B. set 변수 이름 또는 변수 내에 저장되어 있는 데이터
// C. main이나 service 메서드에서 객체로 생성
// C -> B -> A (C에서 전달한 데이터를 B에서 가지고 있고, B에서 작성된 내용을 확인하기 위해 C 사용)
// 회원가임이 완료되었습니다. 회원가입된 정보를 보여줄 때 C 사용