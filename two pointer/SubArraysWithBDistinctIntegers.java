import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubArraysWithBDistinctIntegers{

    //atmost b distinct integers
    public static int atmostBDistinctIntegers(int[] a, int b) {
        int count=0;
        Map<Integer,Integer> mp=new HashMap<>();
        int i=0,j=0;
        while(j<a.length){
            mp.put(a[j],1+mp.getOrDefault(a[j],0));
            
            while(mp.size()>b){
                mp.put(a[i],mp.get(a[i])-1);
                if(mp.get(a[i])==0) mp.remove(a[i]);
                i++;
            }
            count+=j-i+1;
            j++;
        }
        
        return count;
    }

    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        System.out.println("enter the elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.println("enter b");
        int b=sc.nextInt();

        //atmost B distinct integers
        System.out.println("Atmost "+atmostBDistinctIntegers(a, b));

        //exact B distinct integers
        System.out.println("Exactl"+(atmostBDistinctIntegers(a, b)-atmostBDistinctIntegers(a, b-1)));
        
        sc.close();
    }
}