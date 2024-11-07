import java.util.Scanner;

public class InversionCount {
    static Scanner sc = new Scanner(System.in);
    static int inv_c = 0;
    static int getInversionCount(int a[]){
        int n = a.length;
        int count = 0;
        for(int i = 0;i < n - 1; i++){
            for(int j = i + 1; j < n ;j++){
                if(a[i] > a[j])
                    count++;
            }
        }
        return count;

    }
    static void mergeSort(int a[]){
        mergeSortHelper(a,0,a.length-1);
    }
    static void mergeSortHelper(int a[],int l ,int h ){
        if(l<h){
            int m = l + (h-l)/2;
            mergeSortHelper(a, l, m);
            mergeSortHelper(a, m+1, h);
            merge(a,l,m,h);
        }
    }
    static void merge(int a[],int l,int m,int h){
        int t[] = new int[h-l+1];
        int i = l,j = m+1,k = 0;
        while(i <= m && j <= h){
            if(a[i] <= a[j]){
                t[k++] = a[i++];
            }
            else{
                t[k++] = a[j++];
                inv_c += m-i+1;
            }
        }
        while(i <= m)
            t[k++] = a[i++];
        while(j <= h)
            t[k++] = a[j++];

        for(i = l, j = 0; i <= h ;i++,j++)
            a[i] = t[j];
    }
    public static void main(String[] args) {
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i = 0; i < size ;i++)
            a[i] = sc.nextInt();
        
        System.out.println("Inversion count using brute force : "+getInversionCount(a));
        mergeSort(a);
        System.out.println("Sorted array : ");
        for(int i = 0 ;i < size ;i++)
            System.out.print(a[i]+" ");
        System.out.println();
        System.out.println("Inversion count using merge sort: "+inv_c);


    }
}
