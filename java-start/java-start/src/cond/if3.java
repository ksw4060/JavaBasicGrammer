package cond;

public class if3 {
    public static void main(String[] args) {
        int age = 37;

        if (age <= 7) {
            System.out.println("미취학 아동입니다");
        }
        if (age >= 8 && age <= 13) {
            System.out.println("초등학생입니다");
        }
        if (age >= 14 && age <= 16) {
            System.out.println("중학생입니다");
        }
        if (age >= 17 && age <= 19) {
            System.out.println("고등학생입니다");
        }
        if (age >= 20) {
            System.out.println("성인입니다");
        }
        // 이 코드의 문제점은, 모든 if 문을  돌려야 한다는 것.
        // 그래서 나온 문법이 else if
    }
}
