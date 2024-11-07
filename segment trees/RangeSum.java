import java.util.Arrays;

public class RangeSum {
    private int segTree[];
    int sizeOfArray;
    RangeSum(int a[]){
        segTree = new int[4*a.length+1];
        sizeOfArray = a.length;
        buildTree(0, 0, a.length-1, a);
        // System.out.println(Arrays.toString(segTree));
    }

    private void buildTree(int i, int l, int r, int a[]) {
        if(l == r){
            segTree[i] = a[l];
            return;
        }
        int mid = (l+r)/2;
        buildTree(2*i+1, l, mid, a);
        buildTree(2*i+2, mid+1, r, a);
        segTree[i] = segTree[2*i+1]+segTree[2*i+2];
    }


    public void update(int index, int l, int r, int value, int cur){
        System.out.println(l + " " + r + " " + segTree[cur]);
        if(l == r){
            segTree[cur] = value;
            return;
        }

        int mid = (l+r)/2;
        if(index <= mid){
            update(index, l, mid, value, 2*cur+1);
        }else{
            update(index, mid+1, r, value, 2*cur+2);
        }
        segTree[cur] = segTree[cur*2+1]+segTree[cur*2+2];
    }

    public int getRangeSum(int start, int end, int index, int l, int r){
        if(r < start || l > end) // range [l, r] is not included
            return 0;

        if(l >= start && r <= end)
            return segTree[index];
        int mid = (l+r)/2;
        return getRangeSum(start, end, 2*index+1, l, mid) + getRangeSum(start, end, 2*index+2, mid+1, r);
    }
}
