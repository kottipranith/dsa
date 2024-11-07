/* 
Question:
---------
You are given an array A, of N elements. Find minimum index based distance between two elements of the array,
x and y such that (x!=y).

sample i/p:            sample o/p:
4                       1
1 2 3 2
1 2
 */

import java.util.Scanner;

public class MinimumDistanceBetweenNumbers {
    static int minDist(int a[],int n,int x,int y)
    {
        int p = -1,dist = Integer.MAX_VALUE;

        for(int i = 0;i < n;i++)
        {
            if(a[i] == x || a[i] == y)
            {
                if(p != -1 && a[p] !=a [i])
                {
                    dist = Math.min(Math.abs(p-i), dist);
                }
                p = i ;
            }
        }
        if(dist==Integer.MAX_VALUE) return -1;
        return dist;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();

        int x = sc.nextInt(),y = sc.nextInt();

        int res=minDist(a,n,x,y);
        System.out.println("The minimum distance between "+x+" "+y+" is  : "+res);
        sc.close();
    }
}
