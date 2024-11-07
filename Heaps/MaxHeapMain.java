public class MaxHeapMain {
    public static void main(String[] args) {
        Heapify h=new Heapify();
        int a[]={1,2,3,4,5};
        h.buildMaxHeap(a,a.length);
        for(int i=0;i<5;i++) System.out.print(a[i]+" ");

    }
}
