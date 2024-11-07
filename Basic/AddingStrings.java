import java.util.Scanner;

public class AddingStrings {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        String s1=sc.next();
        String s2=sc.next();
        String sum=addTwoNums(s1,s2);
        System.out.println(sum);
    }
    static String addTwoNums(String s1,String s2){
        StringBuilder ans=new StringBuilder();
        int i=s1.length()-1,j=s2.length()-1;
        int a=0,b=0,c=0,sum=0;
        while(i>=0 || j>=0){
            a=(i>=0)?s1.charAt(i)-48:0;
            b=(j>=0)?s2.charAt(j)-48:0;
            sum=a+b+c;
            c=sum/10;
            ans.append(String.valueOf(sum%10));
            i--;
            j--;
        }
        if(c==1)
        ans.append("1");
        return ans.reverse().toString();

    }
}
