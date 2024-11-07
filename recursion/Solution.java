public class Solution {
    int factorial(int n){
        if( n == 0)
            return 1;
        return n*factorial(n-1);
    }
    void nto1(int n){
        if(n == 1){
            System.out.print( n+" ");
            return;
        }
        System.out.print(n+" ");
        nto1(n-1);
    }
    void oneton(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        oneton(n-1);
        System.out.print(n+" ");
    }
    int sumOfN(int n){
        if(n == 0)
            return 0;
        return n + sumOfN(n-1);
    }
    int sumOfDigits(int n){
        if(n == 0)
            return 0;
        return n%10 + sumOfDigits(n/10);
    }
    int productOfDigits(int n){
        if(n == 1)
            return 1;
        return n%10*productOfDigits(n/10);
    }
    String reverseNumber(int n){
        if(n == 0)
            return "";
        return String.valueOf(n%10)+reverseNumber(n/10);
    }
}
