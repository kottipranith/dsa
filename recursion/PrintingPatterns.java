public class PrintingPatterns {
    static void pattern1(int n){
        for(int i = n; i > 0;i--){
            for(int j = 1;j <= i ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern1Rec(int n){
        if(n <= 0)
            return ;
        for(int i = 0; i < n; i++)
            System.out.print("* ");
        System.out.println();
        pattern1Rec(n-1);
    }
    public static void main(String[] args) {
        pattern1(5);
    }
}
