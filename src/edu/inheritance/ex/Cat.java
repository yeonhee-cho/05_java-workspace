package edu.inheritance.ex;

public class Cat extends Animal{ // 이 줄에 빨간 에러가 뜨는 이유: 생성자를 만들어주지 않았기 때문!
    // 상속의 경우 부모에 작성된 필드와 생성자를 활용하겠다가 기본 정의이므로
    // 부모의 필드를 활용할 수 있는 생성자가 존재하지 않아 문제가 발생
    
    // 필드 속성 인스턴스 변수
    private Boolean isIndoor; // 실내묘 여부

    // 기본 생성자
    public Cat(){
        super();
    }

    // 매개변수가 4개 존재하는 생성자 Animal 3개 + Cat 1개
    public Cat(String name, int age, String color, Boolean isIndoor) {
        super(name, age, color);
        this.isIndoor = isIndoor;
    }

    // getter/setter
    public Boolean getIndoor() {
        return isIndoor;
    }

    public void setIndoor(Boolean indoor) {
        isIndoor = indoor;
    }

    // Animal 클래스에서 작성한 기능을 재사용
    @Override
    public void makeSound() {
        // Animal의 작성된 이름이 private = Animal 클래스에서만 사용할 수 있는 명칭으로
        // getName을 활용해서 setName에 담겨져 있는 데이터를 사용
        System.out.println(getName() + "이(가) 야옹 웁니다.");
    }

    @Override
    public void move() {
        System.out.println(getName() + "이(가) 네 발로 조용히 걸어다닙니다.");
    }

    // Cat 클래스에서만 사용할 수 있는 기능들
    public void purr(){
        System.out.println(getName() + "이(가) 골골 소리를 냅니다.");
    }

    public void scratch(){
        System.out.println(getName() + "이(가) 발톱으로 긁습니다.");
    }
}