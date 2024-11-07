/*
Question: leetcode 42
---------------------
Given n non-negative integers representing an elevation map where the width of each bar is 1, 
compute how much water it can trap after raining.
*/
import java.util.*;
class TrappingRainWater{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
            int left[]=new int[n],right[]=new int[n];
            for(int i=0;i<n;i++)
            {
                if(i==0)
                left[i]=a[i];
                else left[i]=Math.max(left[i-1],a[i]);
                
            }
            for(int i=n-1;i>=0;i--)
            {
                if(i==n-1)
                right[i]=a[i];
                else right[i]=Math.max(right[i+1],a[i]);
                
            }
            long ans=0;
            for(int i=0;i<n;i++)
            {
                ans+=Math.min(left[i],right[i])-a[i];
            }
            System.out.println(ans);
        }
    }
}