import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BasicOperation {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Solution sol = new Solution();
        List<ListNode> list=new ArrayList<>();
        int count=sc.nextInt();
        while(count-->0)
        {
            list.add(sol.readList(sc.nextInt()));
        }
        
        ListNode head=sol.merge(list);
        printLL(head);
        sc.close();
    }
    static void printLL(ListNode head)
    {
        if(head!=null) {
            System.out.print(head.data+" ");
            printLL(head.next);
        }
    }
    static void printLLReverseRecursion(ListNode head)
    {
        if(head.next!=null) printLLReverseRecursion(head.next);
        System.out.print(head.data+" ");
    }
    
}
