import java.util.Scanner;

public class SingleNumber2 {
    static int singleNumber(int []nums){
        int ans=0;
        for(int i=0;i<32;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if((nums[j]&(1<<i))!=0) count++;
            }
            if(count %3 !=0)
            ans=ans|(1<<i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        System.out.println("Single element in array is : "+singleNumber(a));
    }
}
