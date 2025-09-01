package edu.inheritance.ex2;

public class Car extends Vehicle {
    private String fuelType; // 경적
    private int doors; // 트렁크 열기

    public Car(){
        super();
    }

    public Car(String brand, String model, int year, String color) {
        super(brand, model, year, color);
    }

    public Car(String brand, String model, int year, String color, String fuelType, int doors) {
        super(brand, model, year, color);
        this.fuelType = fuelType;
        this.doors = doors;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public void accelerate() {
        System.out.println("자동차가 액셀러레이터를 밟아 가속합니다.");
    }

    @Override
    public void brake() {
        System.out.println("자동차가 브레이크를 밟아 감속합니다.");
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("연료타입: " + getFuelType());
        System.out.println("문개수: " + getDoors());
    }

    public void honk(){}
    public void openTrunk(){}
}
