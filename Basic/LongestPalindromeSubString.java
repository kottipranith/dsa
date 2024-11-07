import java.util.Scanner;

public class LongestPalindromeSubString {
    static String revString(String s){
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int mx=1;
        for(int i=0;i<s.length();i++){
            String t="";
            for(int j=i;j<s.length();j++){
                t+=s.charAt(j);
                if(t.equals(revString(t)) && mx<t.length())
                mx=t.length();
            }
        }
        System.out.println(mx);
    }
}
