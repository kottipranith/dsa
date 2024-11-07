import java.util.Scanner;

public class MergeSort {
    private static ListNode getMid(ListNode h){
        ListNode s = h, f = h;
        while(f.next != null && f.next.next != null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
    private static ListNode merge(ListNode h1, ListNode h2){
        if(h1 == null) return h2;
        if(h2 == null) return h1;
        if(h1.data < h2.data){
            h1.next = merge(h1.next,h2);
            return h1;
        }
        h2.next = merge(h1,h2.next);
        return h2;
    }
    private static ListNode mergeSort(ListNode h){
        if(h == null || h.next == null)
            return h;
        ListNode mid = getMid(h);
        ListNode nextList = mid.next;
        mid.next = null;
        ListNode l1 = mergeSort(h);
        ListNode l2 = mergeSort(nextList);
        return merge(l1,l2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Solution sol = new Solution();
        System.out.println("Enter no of nodes");
        ListNode h = sol.readList(sc.nextInt());
        h = mergeSort(h);
        sol.printLL(h);
        sc.close();
    }
}
