import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UniqueElementsInWindow {

    //Approach : 1  time : O(n^2)
    static void uniqueElements1(int a[],int k)
    {
        int n = a.length;
        for(int ws = 0;ws < n-k+1; ws++)
        {
            Set<Integer> st = new HashSet<>();
            for(int j = ws;j < ws+k ;j++)
            {
                st.add(a[j]);
            }
            System.out.print(st.size()+" ");
        }
    }

    //Apparoach : 2 time: O(n)
    static List<Integer> uniqueElements2(int a[],int k)
    {
        int n = a.length;
        Map<Integer,Integer> mp = new HashMap<>();

        for(int i = 0;i < k;i++)
        {
            mp.put(a[i],1+mp.getOrDefault(a[i], 0));
        }
        List<Integer> ans = new ArrayList<>();
        ans.add(mp.size());

        for(int ws = 1;ws < n-k+1;ws++)
        {
            mp.put(a[ws-1],mp.get(a[ws-1])-1);
            if(mp.get(a[ws-1])==0) mp.remove(a[ws-1]);
            mp.put(a[ws+k-1],1+mp.getOrDefault(a[ws+k-1], 0));
            ans.add(mp.size());
        }
        return ans;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0;i < n;i++)
        a[i] = sc.nextInt();
        System.out.println(uniqueElements2(a, k));
    }
}
