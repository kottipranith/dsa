import java.util.Scanner;
public class PairsDivisibleByK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int k=sc.nextInt();
        //logic 1(naive)
        System.out.println("Logic 1");
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if((a[i]+a[j])%k==0)
                count++;
            }
        }
        System.out.println(count);
        System.out.println("Logic 2");
        //logic 2(hashing)
        count=0;
        int freq[]=new int[k];
        for(int i=0;i<k;i++)
        freq[i]=0;

        for(int i:a)
        freq[i%k]++;

      
        for(int i=1;i<k/2;i++)
            {
                count+=freq[i]*freq[k-i];
            }
            count+=(freq[0]*(freq[0]-1))/2;
            count+=(freq[k/2]*(freq[k/2]-1))/2;
            System.out.println(count);
    }
}
