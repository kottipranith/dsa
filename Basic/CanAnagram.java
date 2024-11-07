import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class CanAnagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.next();

        // Logic 1
        // Map<Character,Integer> map=new HashMap<Character,Integer>();
        // for(int i=0;i<word.length();i++)
        // {
        //     if(map.containsKey(word.charAt(i)) && map.get(word.charAt(i))==1)
        //     map.put(word.charAt(i),0);
        //     else if(map.containsKey(word.charAt(i)) && map.get(word.charAt(i))==0)
        //     map.put(word.charAt(i),1);
        //     else
        //     map.put(word.charAt(i),1);
            
        // }
        // if(map.containsValue(1))
        // System.out.println("NO");
        // else
        // System.out.println("YES");

        //Logic 2
        int res=0;
        for(int i=0;i<word.length();i++)
        {
            res=res^word.charAt(i);
        }
        if(res==0)
        System.out.println("YES");
        else
        System.out.println("No");

    }
}
