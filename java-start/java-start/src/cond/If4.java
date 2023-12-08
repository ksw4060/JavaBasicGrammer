package cond;
// else if 를 쓰면, 모든 if 문을 돌지 않아도 된다.
public class If4 {

    public static void main(String[] args) {
        int age  = 15;

        if (age <= 7) {
            System.out.println("미취학");
        } else if (age <= 13) {
            System.out.println("초등학생");
        } else if (age <= 16) {
            System.out.println("중학생");
        } else if (age <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }
    }
}
