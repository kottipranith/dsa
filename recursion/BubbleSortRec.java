import java.util.Arrays;

public class BubbleSortRec {
    static void bubbleSort(int a[],int step){
        if(step == a.length)
            return ;
        for(int j = 0;j < a.length-step; j++){
            if(a[j] > a[j+1]){
                int t = a[j];
                a[j] = a[j+1];
                a[j+1] = t;
            }
            bubbleSort(a, step+1);
        }
    }
    public static void main(String[] args) {
        int a[] = {5,4,3,2,1};
        bubbleSort(a, 1);
        System.out.println(Arrays.toString(a));
    }
}
