package array;

import java.util.Arrays;

public class Array1Ref1 {
    public static void main(String[] args) {
        int[] students;
        students = new int[5];

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        System.out.println("students[0] = " + students[0]);
        System.out.println("students[0] = " + students[1]);
        System.out.println("students[0] = " + students[2]);
        System.out.println("students[0] = " + students[3]);
        System.out.println("students[0] = " + students[4]);
    }
}
