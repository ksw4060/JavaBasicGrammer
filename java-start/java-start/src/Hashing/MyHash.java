package Hashing;
import java.util.HashMap;

public class MyHash {
    public static void main(String[] args) {
        // HashMap 객체 생성
        HashMap<String, Integer> myMap = new HashMap<>();

        // 키-값 쌍 추가
        myMap.put("one", 1);
        myMap.put("two", 2);
        myMap.put("three", 3);

        // HashMap 출력
        System.out.println(myMap);
    }
}
