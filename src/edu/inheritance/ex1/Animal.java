package edu.inheritance.ex1;

/**
 * - **공통 필드**: `name`, `age`, `color` (private 선언)
 * - **생성자**: 기본 생성자, 매개변수 생성자
 * - **공통 메소드**: `eat()`, `sleep()`, `showInfo()`, getter/setter들
 * - **오버라이딩 대상 메소드**: `makeSound()`, `move()`
 */
public class Animal {
    // 공통 필드 속성 인스턴스 변수
    private String name;
    private int age;
    private String color;

    // 기능들 = 메서드
    // Dog dog1 = new Dog();
    // Cat cat1 = new Cat();
    // Bird bird1 = new Bird();
    // 위와 같이 Animal을 상속받는 생성자들의 기본 생성자를 사용하기 위해서는
    // 상속해주는 Animal을 자체에서 기본 생성자가 존재해야함
    // 생성자 - 기본 생성자
    public Animal() {
    }

    // 생성자 - 매개변수 생성자
    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // getter(데이터 전달할 수 있는 기능) setter(사용자가 작성한 데이터를 가지고 있는 기능)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 개발자가 필요로하는 기타 메서드들
    // 공통 메소드
    public void eat(){
        System.out.println(getName() + " 이(가) 음식을 먹고 있습니다.");
    }

    public void sleep(){
        System.out.println(getName() + " 이(가) 잠을 자고 있습니다.");
    }

    // 오버라이딩 대상 메소드 makeSound() move()
    public void makeSound(){
        System.out.println(getName() + " 이(가) 웁니다.");
    }

    public void move(){
        System.out.println(getName() + " 이(가) 다닙니다.");
    }

    public void showInfo() {
        System.out.println("=== 정보 ===");
        System.out.println("이름 : " + getName());
        System.out.println("나이 : " + getAge());
        System.out.println("색상 : " + getColor());
    }
}
