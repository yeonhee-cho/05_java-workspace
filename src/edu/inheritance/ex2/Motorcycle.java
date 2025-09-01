package edu.inheritance.ex2;

public class Motorcycle extends Vehicle {
    private int engineSize; // 배기량
    private boolean hasHelmet; // 헬멧 착용여부

    public Motorcycle(){
        super();
    }

    public Motorcycle(String brand, String model, int year, String color, int engineSize, boolean hasHelmet) {
        super(brand, model, year, color);
        this.engineSize = engineSize;
        this.hasHelmet = hasHelmet;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public boolean isHasHelmet() {
        return hasHelmet;
    }

    public void setHasHelmet(boolean hasHelmet) {
        this.hasHelmet = hasHelmet;
    }

    @Override
    public void accelerate() {
        System.out.println("오토바이가 스로틀을 돌려 가속합니다.");
    }

    @Override
    public void brake() {
        System.out.println("오토바이가 브레이크 레버를 당겨 감속합니다.");
    }

    @Override
    public void showInfo(){
        super.showInfo();

        System.out.println("배기량: " + getEngineSize());
        System.out.println("헬멧착용: " + (isHasHelmet() ? "착용" : "미착용"));
    }

    public void wheelie(){}
    public void putOnHelmet(){}
}
