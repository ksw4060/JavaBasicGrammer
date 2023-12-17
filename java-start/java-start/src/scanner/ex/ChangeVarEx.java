package scanner.ex;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;
        System.out.println("a = " + a + "이고, b = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + "이고, b = " + b);
    }
}
