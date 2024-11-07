import java.util.Stack;

public class UDFS {
    int n;
    int p[];
    int islands_count;
    public UDFS(int n){
        this.n = n;
        islands_count = n;
        p = new int[n];
        for(int i = 0; i < n; i++)
            p[i] = i;
    }
    public int find(int x){
        if(x == p[x])
            return x;
        return p[x] = find(p[x]);
    }
    public boolean merge(int x, int y){ // the boolean return type is find weather it has a cycle or not
        int lx = find(x), ly = find(y);
        if(lx == ly)
            return true; // has cycle
        p[ly] = lx;
        islands_count--;
        return false; // no cycle
    }
}
