package scanner.ex;
import java.util.Scanner;
public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요! 0을 입력하면, 종료됩니다");
        int num1 = scanner.nextInt();

        while (true) {
            if (num1 % 2 == 0) {
                System.out.println("짝수입니다");
                break;
            } else {
                System.out.println("홀수 입니다.");
                break;
            }
        }
    }
}
