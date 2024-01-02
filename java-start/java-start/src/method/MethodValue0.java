package method;

public class MethodValue0 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = num1; // num1 에 있는 값을 복사해서 넣어준다.
        num1 = 10;
        System.out.println(num1);
        System.out.println(num2);
    }
}
