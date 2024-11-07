import java.util.Scanner;

public class Sorting {
    static void bubbleSort(int a[])
    {
        int n=a.length;
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    static void selectionSort(int a[])
    {
        int n=a.length;
        for(int i=1;i<n;i++)
        {
            int max_index=0;
            for(int j=1;j<n-i+1;j++)
            {
                if(a[max_index]<a[j]) max_index=j;
            }
            int temp=a[max_index];
            a[max_index]=a[n-i];
            a[n-i]=temp;
        }
    }
    static void insertionSort(int a[])
    {
        int n=a.length;
        for(int i=1;i<n;i++)
        {
            int ele=a[i];
            int j=i-1;
            while(j>=0  && a[j]>ele)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=ele;
        }
    }
    static void merge(int a[],int low,int mid,int high)
    {
        int c[]=new int[high-low+1];
        int k=0,i=low,j=mid+1;
        while(i<=mid && j<=high)
        {
            if(a[i]<a[j])
            c[k++]=a[i++];
            else
            c[k++]=a[j++];
        }
        while(i<=mid) c[k++]=a[i++];
        while(j<=high) c[k++]=a[j++];
        for( i=low;i<=high;i++)
        a[i]=c[i-low];
    }
    static void mergeSort(int a[],int low,int high)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
            mergeSort(a, low, mid);
            mergeSort(a, mid+1, high);
            merge(a,low,mid,high);
        }
    }
    static void quickSort(int a[],int l,int u)
    {
        
        if(l<u)
        {
            int pivot=l;
            int i=l;
            int j=u;
            while(i<j){
            while(i<=u && a[pivot]>=a[i] ) i++;
            while(j>=l && a[j]>a[pivot] ) j--;
            if(i<j)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;

            }
        }
        int temp=a[j];
        a[j]=a[pivot];
        a[pivot]=temp;
        quickSort(a, l, j-1);
        quickSort(a, j+1, u);
        }
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        System.out.println("Sort by : ");
        System.out.println("1.Bubble sort\n2.Selection sort\n3.Insertion sort\n4.Merge sort\n5.Quick sort\nEnter you choice");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                bubbleSort(a);
                System.out.println("The sorted array is : ");
                for(int x:a) System.out.print(x+" ");
                System.out.println();
                break;

            case 2:
                selectionSort(a);
                System.out.println("The sorted array is : ");
                for(int x:a) System.out.print(x+" ");
                System.out.println();
                break;

            case 3:
                insertionSort(a);
                System.out.println("The sorted array is : ");
                for(int x:a) System.out.print(x+" ");
                System.out.println();
                break;
                
            case 4:
                mergeSort(a,0,n-1);
                System.out.println("The sorted array is : ");
                for(int x:a) System.out.print(x+" ");
                System.out.println();
                break;
            case 5:
                quickSort(a,0,n-1);
                System.out.println("The sorted array is : ");
                for(int x:a) System.out.print(x+" ");
                System.out.println();
                break;
        }
    }
}
