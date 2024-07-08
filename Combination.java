public class Combination {

    /*
    * This combination formula is solved using Pascal's Triangle.
    *             1         level - 1
    *           1   1       level - 2
    *         1   2   1     level - 3
    *       1   3   3   1   level - 4
    *     1   4   6   4   1 level - 5
    *
    * Explanation:
    * level - 1: 1 = 0c0
    * level - 2: 1 = 1c0, 1 = 1c1
    * level - 3: 1 = 2c0, 2 = 2c1, 2 = 2c2
    * level - 4: 1 = 3c0, 3 = 3c1, 3 = 3c2, 1 = 3c3
    *
    * So we can see the pattern.
    * The extremes have 1 where either n == r or r == 0
    * Lets consider one example to trace: 4c2 = 6
    * How it can be evaluated using recursion:
    * For the value 6 (4c2) we can see that it requires 3 (3c1) and 3 (3c2) above
    * So calculate (n-r C r-1) (4-1 C 2-1) and (n-1 C r) (4-1 C 2) = (3c1) & (3c2)
    * Similarly you can see 3 requires 1 & 2 and 2 & 1 respectively from the Pascal's triangle.
    * So recursively find the value using bottom up approach and get the value.
    * Look the below function you will understand how we are using the Pascal's triangle to calculate nCr = n!/r!(n-r)!
    * */

    static int ncrFromPascalTriangle(int n, int r) {
        if (r == 0 || n == r) {
            return 1;
        }
        return ncrFromPascalTriangle(n-1, r-1) + ncrFromPascalTriangle(n-1, r);
    }

    public static void main(String[] args) {
        int n = 7;
        int r = 5;
        System.out.println(ncrFromPascalTriangle(n, r));
    }
}