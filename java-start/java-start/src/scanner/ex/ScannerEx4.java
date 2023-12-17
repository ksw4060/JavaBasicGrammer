package scanner.ex;
import java.util.Scanner;
public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력한 숫자의 구구단을 출력합니다.");
        int number1 = scanner.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println( number1 + " * " + i + " = " + number1*i);
        }
    }
}
