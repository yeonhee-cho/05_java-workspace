package edu.inheritance.ex2;

public class Vehicle {
    // 필드 속성 인스턴스 변수
    private String brand;
    private String model;
    private int year;
    private String color;

    // 메서드
    // 기본 생성자
    public Vehicle() {}

    // 매개변수가 네가지 존재하는 생성자
    public Vehicle(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // getter / setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 추후 재사용할 메서드들 -> 만약 재 사용 시 변경될 사항이 없으면 자식 메서드에서 작성하지 않고 사용가능
    public void start() {
        System.out.println(getBrand() + " " + getModel() + "이(가) 시작합니다.");
    }

    public void stop() {
        System.out.println(getBrand() + " " + getModel() + "이(가) 정지합니다.");
    }

    public void accelerate() {
        System.out.println("oo가 액셀러레이터를 밟아 가속합니다.");
    }

    public void brake() {
        System.out.println("oo가 브레이크를 밟아 감속합니다.");
    }

    public void showInfo(){
        /*car
        브랜드: "현대", 모델: "아반떼", 연도: 2023, 색상: "흰색", 연료타입: "가솔린", 문개수: 4
        Motorcycle
        브랜드: "야마하", 모델: "R1", 연도: 2022, 색상: "파란색", 배기량: 998, 헬멧착용: true
        Bicycle
        "자이언트", "이스케이프", 2023, "빨간색", 21, true*/

        System.out.println("브랜드: " + getBrand());
        System.out.println("모델: " + getModel());
        System.out.println("연도: " + getYear());
        System.out.println("색상: " + getColor());

    }
}
