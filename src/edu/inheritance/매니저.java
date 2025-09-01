package edu.inheritance;
// 직원 상속 받아서 아래 코드 완성!
public class 매니저 extends 직원 {
    private int teamSize;
    private double bonus;

    // 생성자를 활용
    public 매니저(String eName, int eId, double baseSalary, String department, int teamSize, double bonus) {
        super(eName, eId, baseSalary, department); // super는 this 보다 먼저 쓰기!!
        this.teamSize = teamSize;
        this.bonus = bonus;
    }

    // 게터 세터
    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // info
    // 관리팀 크기 : 00명
    // 관리 보너스 :  + 원
    @Override
    public void info(){
        super.info();
        System.out.println("관리팀 크기 : " + getTeamSize() + "명");
        System.out.println("관리 보너스 : " + getBonus()  + "원");
    }

    // work oo매니저가 oo명의 팀을 관리합니다.
    @Override
    public void work(){
        super.work();
        System.out.println(geteName() + "매니저가 " + getTeamSize() +"명의 팀을 관리합니다.");
    }

    // 매니저만 할 수 있는 업무들
    // meeting oo매니저가 팀 미팅을 진행합니다.
    public void meeting(){
        System.out.println(geteName() + "매니저가 팀 미팅을 진행합니다.");
    }
}
