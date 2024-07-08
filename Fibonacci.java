import java.util.Arrays;

public class Fibonacci {

    /*
     * Here we are using an array to store the computed result of Fibonacci.
     * We Store the value of computed result in array, so later we don't call the same recursive function to get the value
     * and reduce the calls to stack.
     * This is also known as Memoization, and it comes under Dynamic Programming approach also.
     * */

    static int[] array = new int[10];

    static int fib(int num) {
        if (num <= 1) {
            array[num] = num;
            return num;
        } else {
            if (array[num - 1] == -1) {
                array[num - 1] = fib(num - 1);
            }
            if (array[num - 2] == -1) {
                array[num - 2] = fib(num - 2);
            }
            return array[num - 1] + array[num - 2];
        }
    }

    public static void main(String[] args) {
        Arrays.fill(array, -1);
        System.out.println(fib(10));
    }
}