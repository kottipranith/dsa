import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentElement {
    static void calMostFrequentEle(String s)
    {
        char arr[]=s.toCharArray();
        Map<Character,Integer> fq=new LinkedHashMap<>();
        int max=-1;
        char ele=' ';
        for(char ch:arr){
        fq.put(ch,1+fq.getOrDefault(ch, 0));
            if(max<=fq.get(ch))
            {
            max=fq.get(ch); 
            ele=ch;
            }
        }
        
         System.out.println("Max frequent element is \'"+ele+"\': "+max);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        calMostFrequentEle(str);
        sc.close();
    }
}
