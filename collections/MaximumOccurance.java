import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class MaximumOccurance{
    static int minElement(List<Integer> list)
    {
        int min=list.get(0);
        for(int i=0;i<list.size();i++)
        {
            if(min>list.get(i))
            min=list.get(i);
        }
        return min;
    }
    static int maxElement(List<Integer> list)
    {
        int max=list.get(0);
        for(int i=0;i<list.size();i++)
        {
            if(max<list.get(i))
            max=list.get(i);
        }
        return max;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            map.put(arr[i],map.get(arr[i])+1);
            else
            map.put(arr[i],1);
        }
        int max=-1;
        for(Integer i:map.keySet())
        {
            if(max<map.get(i))
            max=map.get(i);
        }
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(Integer i:map.keySet())
        {
            if(max==map.get(i))
            list.add(i);
        }
        if(list.size()==1)
        System.out.println(list.get(0));
        else{
            System.out.println("Min Element: "+minElement(list));
            System.out.println("Max Element: "+maxElement(list));
            for (int i=0;i<n;i++)
            {
                if(max==map.get(arr[i])){
                    System.out.println("First occurance: "+arr[i]); 
                    break;
                }
            }
            
        }
        
    }
}