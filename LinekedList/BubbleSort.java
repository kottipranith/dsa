import java.util.Scanner;

public class BubbleSort {
    static ListNode insert(ListNode head,int data){
        ListNode newnode=new ListNode(data);
        if(head==null)
        return newnode;
        ListNode ptr=head;
        while(ptr.next!=null) ptr=ptr.next;
        ptr.next=newnode;
        return head;
    }
    static void printLL(ListNode head)
    {
        
        for(ListNode ptr=head;ptr!=null;ptr=ptr.next)
        {
            System.out.print(ptr.data+" ");
        }
        System.out.println();
    }
    static void sortOnBubble(ListNode head)
    {
        for(ListNode i=head;i.next!=null;i=i.next)
        {
            for(ListNode j=head;j.next!=null;j=j.next)
            {
                if(j.data>j.next.data)
                {
                    int temp=j.data;
                    j.data=j.next.data;
                    j.next.data=temp;
                }
            }
        }

    }


    public static void main(String[] args) {
        ListNode head=null;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0)
        {
            head=insert(head,sc.nextInt());
        }
        System.out.println("The elements of ListNode before sorting are : ");
        printLL(head);

        //Sorting ListNode
        sortOnBubble(head);

        System.out.println("The elements of ListNode after sorting are : ");
        printLL(head);
        sc.close();
    }
}
