import java.util.*;
public class NGE
{
    static List<Integer> NGE(List<Integer> list)
    {
        List<Integer> ans=new ArrayList<Integer>();
        
        for(int i=0;i<list.size();i++) ans.add(0);
        Stack<Integer> stack=new Stack<Integer>();
        
        for(int i=0;i<list.size();i++)
        {
            while(!stack.isEmpty() && list.get(i)>list.get(stack.peek()))
            {
                int index=stack.pop();
                ans.set(index,i);
            }
            stack.push(i);
        }
        while(stack.size()>0){
            int index=stack.pop();
        ans.set(index,list.size());
        }
        return ans;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++) list.add(sc.nextInt());
		List<Integer> ans=NGE(list);
		System.out.println(ans);
	}
}
