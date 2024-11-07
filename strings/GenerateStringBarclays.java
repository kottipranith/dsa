import java.util.Scanner;

public class GenerateStringBarclays{
    static Scanner sc = new Scanner(System.in);

    static String solve(String s1,String s2){
        String res = "";
        res += s1;
        for(int i = 1; i < s2.length(); i++){
            res += s1.charAt(s1.length()-1);
            if(s2.charAt(i) == 'T' && !s1.equals(res.substring(i)))
                return "-1";
        }
        return res;
    }
    public static void main(String[] args) {
        String s1 = sc.next();
        String s2 = sc.next();
        String res = solve(s1,s2);
        System.out.println(res);
    }
}