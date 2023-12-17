package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력하는 모든 값들의 합을 출력합니다. (0입력시 종료) ");
        int intSum = 0;

        while (true){

            System.out.println("숫자를 입력 받습니다.");
            int num1 = scanner.nextInt();
            intSum = intSum + num1;
            System.out.println("지금까지 숫자의 합은 " + intSum + "입니다.");

            if (num1 == 0){
                System.out.println("0을 입력했기 때문에, 프로그램을 종료합니다");
                break;
            }
        }
    }
}
