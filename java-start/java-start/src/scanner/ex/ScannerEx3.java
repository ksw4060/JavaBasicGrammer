package scanner.ex;
import java.util.Scanner;
public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름, 가격, 수량을 입력해주세요. ");

        System.out.print("음식의 이름를 입력 해주세요. ");
        String foodName = scanner.nextLine();
        System.out.print("음식의 가격을를 입력 해주세요. ");
        int foodPrice = scanner.nextInt();
        System.out.print("음식의 수량를 입력 해주세요. ");
        int foodQuantity = scanner.nextInt();

        System.out.println(foodName +" "+ foodQuantity+ "개를 주문하셨습니다. 총 가격은 " + foodPrice*foodQuantity + "원 입니다. ");
    }
}

