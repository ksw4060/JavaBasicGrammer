package array.ex;
import java.util.Scanner;


public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요");
        int n = input.nextInt();

        int[][] students = new int[n][3];

        String[] subjects = {"국어", "영어", "수학"};

        int[] sum = new int[4];
        int[] average = new int[4];

        for (int row = 0; row < students.length; row++){
            System.out.println(row+1 + "번 학생의 성적을 입력하세요!");

            for (int column = 0; column < students[row].length; column++){
                System.out.print(subjects[column] + "점수 :" );
                students[row][column] = input.nextInt();
                sum[row] += students[row][column];
            }
        }
        for (int i = 0; i < students.length; i++) {
            average[i] = sum[i] / 3;
            System.out.println(i+1 + "번 학생의 총점 : " + sum[i] + ", 평균 : " + average[i]);
        }
    }
}
