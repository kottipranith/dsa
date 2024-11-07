import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class Solution {

    Scanner sc = new Scanner(System.in);
    ListNode readList(int n){
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        while(n-- > 0){
            ListNode nn = new ListNode(sc.nextInt());
            tail.next = nn;
            tail = nn;
        }
        return dummy.next;
    }
    ListNode merge(List<ListNode> lists)
    {
        PriorityQueue<ListNode> pq=new PriorityQueue<>((h1,h2)->h1.data-h2.data);
        ListNode dummy=new ListNode(-1);
        ListNode tail=dummy;
        
        for (ListNode node : lists)
        {
            if(node!=null)
        pq.add(node);
        }
        while(!pq.isEmpty())
        {
            tail.next=pq.poll();
            tail=tail.next;
            if(tail.next!=null)
            pq.add(tail.next);
        }
        
        return dummy.next;
    }
    long sumOfLL(ListNode head)
    {
        long total=0;
        for(ListNode ptr=head;ptr!=null;ptr=ptr.next)
        total+=ptr.data;
        return total;
    }
     ListNode insertEnd(int x,ListNode head)
     {
        ListNode newnode = new ListNode(x);
        if(head==null){
            
            return newnode;
        }
        ListNode ptr=head;
        while(ptr.next!=null)
        {
            ptr=ptr.next;
        }
        ptr.next=newnode;
        return head;
     }
     void printLL(ListNode head)
    {
        if(head!=null) {
            System.out.print(head.data+" ");
            printLL(head.next);
        }
    }
     void printLLReverse(ListNode head)
     {
        Stack<Integer> stk=new Stack<>();
        for(ListNode ptr=head;ptr!=null;ptr=ptr.next)
        stk.push(ptr.data);

        while(!stk.isEmpty())
        System.out.print(stk.pop()+" ");
        System.out.println();
     }

    ListNode KthNodeFromBegin(ListNode h,int k){
        ListNode t = h;
		int j = k - 1;
		while(t != null && j-->0){
			t = t.next;
		}
		return t;
    }
    int countNodes(ListNode h){
        int count=0;
        for(ListNode ptr=h;ptr!=null;ptr=ptr.next) count++;
        return count;
    }
    ListNode KthNodeFromLast(ListNode h,int k){
        int n = countNodes(h);
		int jumps = n-k;
		if (jumps<=0) return null;
		ListNode temp = h;
		while(jumps-->0){
			temp = temp.next;
		}
		return temp;
    }
    ListNode kthNodeFromLastOptimal(ListNode h,int k){
        ListNode slow=h,fast=h;
		for(int i=1;i<=k && fast!=null;i++)
		fast=fast.next;
		if(fast==null) return null;
		while(fast!=null){
			slow=slow.next;
			fast=fast.next;
		}
		return slow;
    }
    ListNode deleteKthLastNode(ListNode h,int k){
        ListNode s = h,f=h,p=null;
        int c=0,ok=k;
        while(f!=null && k-->0)
        {
            f=f.next;
            c++;
        }
        if(c<ok) return h;
        while(f!=null){

            p=s;s=s.next;f=f.next;
        }
        if(s!=h){
            p.next=s.next;
            return h;
        }
        else
        return h.next;
    }
}

