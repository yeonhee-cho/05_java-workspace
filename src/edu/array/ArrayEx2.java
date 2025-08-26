package edu.array;

import java.util.Arrays;

/*
* 배열 기능용 클래스
* */
public class ArrayEx2 {
    /*
    * 얕은 복사 : 주소만 복사
    * */
    public void method1() {
        int[] arr1 = {100,200,300,400};
        int[] arr2 = arr1; // arr2는 arr1의 주소만 복사해서 값 가져오기(바로가기)

        // 배열을 번호마다 출력하지 않고 한 번에 배열의 값을 출력하는 방법
        // Arrays.toString(배열 명칭);
        System.out.println("arr1 : " + Arrays.toString(arr1));
        System.out.println("arr2 : " + Arrays.toString(arr2));

        // 서로 다른 변수 이름을 이용해서 값을 변경
        arr1[0] = 1234;
        arr2[1] = 5678;

        // 얕은 복사(같은 주소를 참조하여 데이터를 사용)하는 상태이기 때문에
        // arr1, arr2, 모두 출력시 동일한 결과
        System.out.println("arr1 과 arr2에 새로운 데이터를 대입한 결과");
        System.out.println("arr1 : " + Arrays.toString(arr1));
        System.out.println("arr2 : " + Arrays.toString(arr2));
    }

    /*
    * 깊은 복사 : 값을 똑같이 복사한 배열 / 객체 생성
    * */
    public void method2() {
        int[] arr1 = {10,20,30,40}; // 원본 배열

        // 값을 복사할 배열(깊은 복사)
        int[] arr2 = new int[arr1.length]; // arr1 만큼의 칸 수만 설정
        int[] arr3 = new int[arr1.length]; // arr1 만큼의 칸 수만 설정
        System.out.println("arr1의 length : " + arr1.length);
        System.out.println("arr2의 length : " + arr2.length);
        System.out.println("arr3의 length : " + arr3.length);
        
        // 깊은 복사 방법 1 : for문 이용
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
            // arr2의 인덱스 0번 부터 length-1번까지
            // arr1의 인덱스 0번 부터 length-1번까지 그대로 arr2에 값을 복제
        }
        // Ctrl + d 한 줄 복제, 드래그 부분 그대로 복제
        // Shift + Alt 화살표 위 아래 현재 줄 위치 이동
        System.out.println("=== 복사 후 각 array의 값 ===");
        System.out.println("arr1의 length : " + arr1.length);
        System.out.println("arr2의 length : " + arr2.length);
        System.out.println("arr3의 length : " + arr3.length);

        // 깊은 복사 방법 2 : System.arraycopy() 이용
        /*
        * System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        * System.arraycopy(원본 배열 변수 이름, 원본 복사를 시작할 인덱스 위치, 복사해 놓을 배열 이름, 복사한 배열을 삽입하기 시작할 인덱스 위치, 복사할 총 길이)
        * */

        System.arraycopy(arr1, 0, arr3, 0, arr1.length);


        System.out.println("=== 복사 후 각 array의 length 값 ===");
        System.out.println("arr1의 데이터 확인 : " + Arrays.toString(arr1));
        // arr2 = for 문을 활용한 복제
        System.out.println("arr2의 데이터 확인 : " + Arrays.toString(arr2));
        // arr3 = arraycopy를 활용한 복제
        System.out.println("arr3의 데이터 확인 : " + Arrays.toString(arr3));
    }
}
