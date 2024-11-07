public class MinHeap {
    int a[];
    int size;
    MinHeap(int capacity){
        a = new int[capacity];
        size = 0;
    }

    MinHeap(){
        this(10);
    }

    void add(int ele){
        a[size] = ele;
        int ci = size;
        size++;
        while(ci > 0){
            int pi = (ci-1)/2;
            if(a[pi] > a[ci]){
                //swap a[pi] and a[ci]
                int temp = a[pi]; a[pi] = a[ci]; a[ci] = temp;
            }
            ci = pi;
        }
    }

    void print(){
        for(int i = 0; i < size; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
