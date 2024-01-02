package repeat240101;
import java.util.Scanner;
public class Array01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] students_score = new int[5];
        System.out.println("학생의 성적을를 입력하세요. ");
        for (int i = 0; i <= students_score.length-1; i++) {
            students_score[i] = input.nextInt();
        }
    }
}
