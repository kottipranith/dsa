import java.util.Arrays;

public class SelectionSortRec {
    static void selectionSort(int a[],int sortedUpTo){
        if(sortedUpTo <=0 )
            return;
        int mx = 0;
        for(int j = 1;j <= sortedUpTo; j++){
            if(a[mx] < a[j])
                mx = j;
        }
        int t = a[mx];
        a[mx] = a[sortedUpTo];
        a[sortedUpTo] = t;
        selectionSort(a, sortedUpTo-1);

    }
    public static void main(String[] args) {
        int a[] = {5,4,3,2,1};
        selectionSort(a, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
