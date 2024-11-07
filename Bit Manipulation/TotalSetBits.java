import java.util.Scanner;

public class TotalSetBits{
    static int totalSetBits(int n){
        if(n==0 || n==1) return n;
        int p=(int)(Math.log(n)/Math.log(2));     
        int count=p* (1<<(p-1));//(int)Math.pow(2,p-1)*p;
        int pn=n-(1<<p)+1;//n-(int)Math.pow(2,p)+1;
        count+=pn;
        count+=totalSetBits(pn-1);
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        System.out.println(totalSetBits(sc.nextInt()));
    }
}