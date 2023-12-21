package scanner.ex;
import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int input = 0;

        while (true) {
            System.out.println("숫자를 입력하세요! 합계와 평균을 계산해드립니다. (-1을 입력하시면, 종료됩니다.) ");
            input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            sum += input;
            count ++;
        }
        double average = (double) sum / count;
        System.out.println("입력한 숫자들의 합계 : " + sum);
        System.out.println("입력한 숫자들의 평균 : " + average);
    }
}
