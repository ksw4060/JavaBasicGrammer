package array.ex;
import java.util.Scanner;
public class ArrayEx9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 10;
        String[] productNames = new String[n];
        int[] productPrices = new int[n];
        int productCount = 0;

        while (true) {
            System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료 \n 메뉴를 선택하세요 : ");
            try {
                int inputNumber = input.nextInt();
                input.nextLine(); // 다음 줄로 넘어가기
                if (inputNumber == 1) {
                    if (productCount > n) {
                        System.out.println("더 이상 상품을 등록할 수 없습니다.");
                        break;
                    }
                    System.out.print("상품 이름을 입력하세요 : ");
                    productNames[productCount] = input.nextLine();

                    System.out.print("상품 가격을 입력하세요 : ");
                    productPrices[productCount] = input.nextInt();

                    productCount++;
                } else if (inputNumber == 2) {
                    for (int i = 0; i < productCount; i++) {
                        System.out.println(productNames[i] + " : " + productPrices[i] + "원");
                    }
                } else if (inputNumber == 3) {
                    System.out.println("프로그램을 종료 합니다!");
                    break;
                } else {
                    System.out.println("잘못된 값을 입력하셨습니다.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("숫자를 입력하세요.");
                input.nextLine();
            }
        }
    }
}
