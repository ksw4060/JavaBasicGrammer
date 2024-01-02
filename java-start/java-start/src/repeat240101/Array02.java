package repeat240101;

public class Array02 {
    private static int bae = 10;

    public static void main(String[] args) {
        int[][] fiveArray = new int[5][5];
        int intNumber = 1;
        for (int i = 0; i < fiveArray.length; i++) {
            for (int j = 0; j < fiveArray[i].length; j++) {
                fiveArray[i][j] = intNumber++;
            }
        }
        for (int i = 0; i < fiveArray.length; i++) {
            for (int j = 0; j < fiveArray[i].length; j++) {
                System.out.println(fiveArray[i][j]);
            }
        }
    }
}
