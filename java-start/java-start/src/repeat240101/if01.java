package repeat240101;

public class if01 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 500;
            System.out.println("상품 가격이 10000원 이상이면, 500원을 할인 받습니다. ");
        }

        if (age <= 10) {
            discount = discount + 1500;
            System.out.println("10살 이하아이의 할인 가격은 1500원 입니다. 그러므로 상품 가격은 " + price + "원 입니다. ");
        }
        price = price - discount;
        System.out.println("상품 가격은 " + price + "원 입니다. ");
    }
}
