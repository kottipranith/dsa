import java.util.HashMap;
import java.util.Map;

public class GenerateStringOfKeypad {

    static Map<Integer,String> mp ;
    private static void generateString(String ip, int i, String cur){
        if(i > ip.length())
            return;
        if(i == ip.length()) {
            System.out.println(cur);
            return;
        }
        String s = mp.get(ip.charAt(i)-'0');
        for(int ind = 0; ind < s.length(); ind++){
            generateString(ip, i+1, cur+s.charAt(ind));
        }
    }
    public static void main(String[] args) {
        mp = new HashMap<>();
        mp.put(1, "");
        mp.put(2, "abc");
        mp.put(3, "def");
        mp.put(4, "ghi");
        mp.put(5, "jkl");
        mp.put(6, "mno");
        mp.put(7, "pqrs");
        mp.put(8, "tuv");
        mp.put(9, "wxyz");

        generateString("72", 0, "");
    }
}
