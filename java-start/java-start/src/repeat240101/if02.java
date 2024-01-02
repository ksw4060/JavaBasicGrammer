package repeat240101;
import java.util.InputMismatchException;
import java.util.Scanner;
public class if02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int selectMenu;
        int product_num = 0;
        int priceSum = 0;
        // 입력값이 정수인지 확인
        while (true) {
            try {
                System.out.println("메뉴를 선택하세요!");
                selectMenu = input.nextInt();
                input.nextLine();

                if (selectMenu == 1) {
                    System.out.print("상품 명을 입력하세요: ");
                    String productName = input.nextLine();

                    System.out.print("상품 가격을 입력하세요: ");
                    int productPrice = input.nextInt();
                    priceSum += productPrice;
                    product_num += 1;

                    System.out.println("상품명: " + productName + ", 상품 가격: " + productPrice);
                } else if (selectMenu == 2) {
                    System.out.println("현재까지 상품 가격의 총합은 " + priceSum + "원 입니다.");
                } else if (selectMenu == 3) {
                    System.out.println("프로그램을 종료합니다.");
                    System.out.println("======================================");
                    System.out.println("등록된 상품의 갯수는 " + product_num + "개 이고, ");
                    System.out.println("총 가격은 " + priceSum  + "원 입니다. ");
                    System.out.println("======================================");

                    break;
                } else {
                    System.out.println("올바른 메뉴를 선택하세요.");
                }
            } catch (InputMismatchException e) {
                System.out.println("정수가 아닌 다른 타입을 입력하셨습니다. 1, 2, 3 메뉴 중 하나를 선택해주세요.");
                input.nextLine(); // 입력 버퍼 비우기
            } finally {

            }
        }
    }
}
