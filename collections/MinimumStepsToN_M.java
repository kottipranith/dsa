/* 
Question:
--------
Vasya has found a strange device. On the front panel of a device there are: a red button, 
a blue button and a display showing some positive integer. After clicking the red button, 
device multiplies the displayed number by two. After clicking the blue button, 
device subtracts one from the number on the display. If at some point the number stops being positive, 
the device breaks down. The display can show arbitrarily large numbers. Initially, the display shows number n.

*/

import java.util.*;
class  Pair
{
    int val;
    int level;
    public Pair(int val,int level)
    {
        this.val=val;
        this.level=level;
    }
}
public class MinimumStepsToN_M {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        Queue<Pair> queue=new LinkedList<>();
        queue.add(new Pair(n, 0));
        Set<Integer> set=new HashSet<>();
        set.add(n);
        while(true)
        {
            Pair p=queue.poll();
            if(p.val==m) {
                System.out.println(p.level);break;
            }
            if(!set.contains(p.val*2))
            {
                queue.add(new Pair(p.val*2,p.level+1));
                set.add(p.val*2);
            }
            if(!set.contains(p.val-1))
            {
                queue.add(new Pair(p.val-1,p.level+1));
                set.add(p.val-1);
            }
        }
        
    }
}
