import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SetOperationsUsing2Pointer {
    static List<Integer> AUB(int a[],int b[]){
        List<Integer> ans=new ArrayList<>();
        int m=a.length;
        int n=b.length,i=0,j=0;
        while(i<m && j<n){
            if(a[i]==b[j]){
                ans.add(a[i]);
                i++;j++;
            }else if(a[i]<b[j]){
                ans.add(a[i]);
                i++;
            }else{
                ans.add(b[j]);
                j++;
            }
        }
        while(i<m){
            ans.add(a[i++]);
        }
        while(j<n){
            ans.add(b[j++]);
        }
        return ans;
    }
    static List<Integer> A_Intersetion_B(int a[],int b[]){
        int m=a.length,n=b.length;
        List<Integer> ans=new ArrayList<>();
        int i=0,j=0;
        while(i<m && j<n){
            if(a[i]==b[j]){
                ans.add(a[i]);
                i++;j++;
            }else if(a[i]<b[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return ans;
    }
    static List<Integer> A_Difference_B(int a[],int b[]){
        List<Integer> ans=new ArrayList<>();
        int m=a.length,n=b.length,i=0,j=0;
        while(i<m && j<n){
            if(a[i]==b[j]){
                i++;j++;
            }else if(a[i]<b[j]){
                ans.add(a[i]);
                i++;
            }else{
                j++;
            }
        }
        while(i<m)
        ans.add(a[i++]);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sizes of 2 arrays");
        int m=sc.nextInt(),n=sc.nextInt();
        int a[]=new int[m],b[]=new int[n];
        System.out.println("Enter the elements of 1st array");
        for(int i=0;i<m;i++) a[i]=sc.nextInt();
        System.out.println("Enter the elements of 2nd array");
        for(int i=0;i<n;i++) b[i]=sc.nextInt();

        System.out.println("Set opeartions\n1.Union\n2.Intersection\n3.Difference\n\nEnter your choice ");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                List<Integer> ans=AUB(a,b);
                System.out.println(ans);
                break;
            case 2:
                List<Integer> res=A_Intersetion_B(a, b);
                System.out.println(res);
                break;
            case 3:
                List<Integer> sol=A_Difference_B(a, b);
                System.out.println(sol);
                break;
        }


    }
}
