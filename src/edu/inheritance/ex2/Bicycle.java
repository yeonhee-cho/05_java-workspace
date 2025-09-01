package edu.inheritance.ex2;

public class Bicycle extends Vehicle {
    private int gearCount; // 기어 수
    private boolean isElectric; // 전기자전거 여부

    public Bicycle(){
        super();
    }

    public Bicycle(String brand, String model, int year, String color) {
        super(brand, model, year, color);
    }

    public Bicycle(String brand, String model, int year, String color, int gearCount, boolean isElectric) {
        super(brand, model, year, color);
        this.gearCount = gearCount;
        this.isElectric = isElectric;
    }

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public void accelerate() {
        System.out.println("자전거가 페달을 밟아 가속합니다.");
    }

    @Override
    public void brake() {
        System.out.println("자전거가 브레이크를 잡아 감속합니다.");
    }

    @Override
    public void showInfo(){
        super.showInfo();

        System.out.println("기어 수: " + getGearCount());
        System.out.println("전기자전거 여부: " +  (isElectric() ? "전기자전거" : "일반자전거"));
    }

    public void ringBell(){}
    public void pedal(){}
}
