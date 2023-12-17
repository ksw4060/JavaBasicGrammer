package scanner.ex;
import java.util.Scanner;
public class ScannerEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("종료를 입력하면, 프로그램이 종료됩니다.");
            System.out.print("당신의 이름을 입력하세요. : ");
            String name = scanner.nextLine();
            if (name == "종료") {
                System.out.println("프로그램이 종료되었습니다. ");
                break;
            }
            System.out.print("당신의 나이를 입력하세요. : ");
            int age = scanner.nextInt();
            System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "살입니다. ");
            System.out.println("------------------------------- ");
            System.out.println(" ");
        }
    }
}
