package array.ex;
import java.util.Scanner;


public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int number = input.nextInt();
        System.out.println();

        System.out.println(number + "개의 정수를 입력하세요:");
        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(arr.length);

        int maxInt = arr[0];
        int minInt = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (maxInt < arr[i]) {
                maxInt = arr[i];
            }
            if (minInt > arr[i]) {
                minInt = arr[i];
            }
        }

        System.out.println("maxInt 는 " + maxInt + "입니다");
        System.out.println("minInt 는 " + minInt + "입니다");

    }
}
