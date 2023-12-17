package scanner.ex;

import java.util.Locale;
import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 이름를 입력 해주세요. ");
        String name = scanner.nextLine();
        System.out.print("당신의 나이를 입력 해주세요. ");
        int user_age = scanner.nextInt();

        System.out.println("당신은 이름은 " + name + "이고, 나이는 " + user_age + "살 입니다. ");
    }
}
