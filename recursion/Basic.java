import java.util.Scanner;

public class Basic {
    static Scanner sc = new Scanner(System.in);
    static Solution sol = new Solution();
    public static void main(String[] args) {
        sol.nto1(5);
        System.out.println();
        sol.oneton(5);
        System.out.println();
        System.out.println(sol.factorial(5));
        System.out.println(sol.sumOfN(10));
        System.out.println(sol.sumOfDigits(1432));
        System.out.println(sol.productOfDigits(1432));
        System.out.println(sol.reverseNumber(1234));
    }
}
