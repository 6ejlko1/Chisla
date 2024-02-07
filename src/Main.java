import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] intList = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        Arrays.sort(intList);
        int count = 0;
        for (int x : intList) {
            if (x > 0) {
                if (x % 2 == 0) {
                    System.out.println(x);
                }
            }
        }
    }
}
