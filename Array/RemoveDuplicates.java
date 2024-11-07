import java.util.Scanner;

public class RemoveDuplicates {

    //Array should not contain a element more than once
    static void removeDuplicates(int a[]){
        int n=a.length;
        int i=1,j=1;
        while(i<n){
            if(a[i]!=a[j-1]) {
                a[j]=a[i];
                i++;j++;
            }
            else 
                i++;
        }
    }
    //Array elements should not contain a element than twice
    static void removeDuplicatesII(int a[]){
        int n=a.length;
        int i=2,j=2;
        while(i<n){
            if(a[i]!=a[j-2]) {
                a[j]=a[i];
                i++;j++;
            }
            else 
                i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements");
        for (int i=0;i<n;i++) a[i]=sc.nextInt();

        removeDuplicates(a);

        System.out.println("After removing duplicates ");
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
}
