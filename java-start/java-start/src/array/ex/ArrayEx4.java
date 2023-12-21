package array.ex;
import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int number = input.nextInt();
        System.out.println();

        System.out.println(number + "개의 정수를 입력하세요:");
        int[] arr = new int[number];
        int sum = 0;

        for (int i=0; i< arr.length; i++) {
            arr[i] = input.nextInt();
            System.out.println("arr = " + arr[i]);
            sum += arr[i];
        }
        double average = (double) sum / arr.length ;
        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입력한 정수의 평균 : " + average);
    }
}
