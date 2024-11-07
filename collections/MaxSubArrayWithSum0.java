/*
Q : Given an array find the maximum length of subarray with sum 0.
sample i/p:
5
6 1 2 -3 8

sample o/p:
3 ie{1,2,-3}

Appraoach:
->Construct a new array such that the element at ith index is the sum its previous value 
and the element at the ith index of given array.
ie sum={6,7,9,6,14}
->And for every new element insert into the map with its index.
->If it already exixts then maximum length will be max(maxlen,i-map.get(sum[i]))
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MaxSubArrayWithSum0 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        Map<Integer,Integer> map=new HashMap<>();
        int maxLen=0;
        for(int i=0;i<n;i++)
        {
            if(i==0)
            a[i]=sc.nextInt();
            else
            a[i]=a[i-1]+sc.nextInt();
            if(map.containsKey(a[i]))
            maxLen=Math.max(maxLen,i-map.get(a[i]));
            else 
            map.put(a[i],i);

        }
        System.out.println("Maximum Length : "+maxLen);
    }
}
