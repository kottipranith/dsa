//not completed
import java.util.Scanner;

public class ReverseAlternateKNodes {
    static ListNode reverseLL(ListNode h){
        ListNode c=h,p=null,n=null;
        while(c!=null){
            n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        return p;
    }
    static ListNode alternateMerge(ListNode h,int k){
        if(h==null) return null;
        ListNode dummy=new ListNode(-1);
        ListNode tail=dummy,s=h,e=h;
        boolean flag=false;
        while(true){
            for(int i=1;i<k;i++) e=e.next;
            ListNode nex=e.next;
            e.next=null;
            if(flag==false){
                flag=true;
                tail.next=reverseLL(s);
                while(tail.next!=null) tail=tail.next;

            }
            else{
                flag=false;
                ListNode ptr=s;
                while(ptr!=e)
                {
                    tail.next=ptr;
                    tail=ptr;
                }
                tail.next=ptr;
                tail=ptr;
            }
            if(nex==null) 
            break;
            s=nex;
            e=nex;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();
        ListNode h=sol.readList(sc.nextInt());
        System.out.println("Enter k");
        int k=sc.nextInt();
        ListNode ans=alternateMerge(h,k);
        BasicOperation.printLL(ans);
        sc.close();
    }
}
