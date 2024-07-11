public class Hanoi {

    // For n-1 disks we have to from tower 1 to 2 using 'c' as auxiliary tower
    // And later move those all disks from tower 2 to 3 using 'a' as auxiliary tower

    static void towerOfHanoi(int n, int a, int b, int c) {
        if (n != 0) {
            towerOfHanoi(n-1, a, c, b);
            System.out.printf(" %d --> %d \n", a, c);
            towerOfHanoi(n-1, b, a, c);
        }
    }

    public static void main(String[] args) {
        towerOfHanoi(3, 1, 2, 3);
    }
}