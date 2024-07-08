import java.util.ArrayList;
import java.util.Arrays;

public class Recursion {

    static int fib(int num) {
        if (num <= 1) {
            return num;
        }
        return fib(num - 1) + fib(num - 2);
    }

    static int fib(int num, int[] array) {
        if (num <= 1) {
            array[num] = num;
            return num;
        }
        else {
            if (array[num - 1] == -1) {
                array[num - 1] = fib(num - 1, array);
            }
            if (array[num - 2] == -1) {
                array[num - 2] = fib(num - 2, array);
            }
            return array[num - 1] + array[num - 2];
        }
    }
//    0, 1, 1, 2, 3, 5, 8, 13, 21, 34f

    public static void main(String[] args) {
        int[] array = new int[9];
        Arrays.fill(array, -1);
        System.out.println(fib(9, array));
    }
}