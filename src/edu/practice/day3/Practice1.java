package edu.practice.day3;

public class Practice1 {
    /* 필드 = 속성 */
    private String title;
    private String author;
    private int price;
    private boolean isAvailable = true; // 대출 가능 여부, 기본 값 true

    /* 매서드 = 기능 */
    // 기본 생성자
    public Practice1() {
    }

    // 매개변수 생성자 에서 isAvailable 제외하고 만들기
    public Practice1(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // getter
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    /*
     * 도서 반납 기능
     * */
    public void returnBook(){
        if(!isAvailable){ // 대출 가능하지 않은 상태인데 책을 반납
            isAvailable = true; // 대출 가능한 상태로 변경하고
            System.out.println(getTitle() + "이(가) 반납되었습니다."); // 반납 완료임을 작성
        } else {
            System.out.println(getTitle() + "은(는) 이미 반납된 상태입니다."); // 가능상태일 경우 반납했다는 표기
        }
    }

    /*
     * 도서 대출 기능
     * */
    public void borrowBook(){
        if(isAvailable){
            isAvailable = false;
            System.out.println(getTitle() + "이(가) 대출되었습니다.");
        } else {
            System.out.println(getTitle() + "은(는) 이미 대출 중입니다.");
        }
    }

    /*
     * 도서 정보 출력 기능
     * 대출 가능 여부 isAvailable ? "가능" : "불가능"
     * */
    public void displayInfo() {
        System.out.printf("제목: %s\n저자: %s\n가격: %,d원\n대출 가능: %s \n", getTitle(), getAuthor(), getPrice(), (isAvailable() ? "가능" : "불가능"));
    }
}
