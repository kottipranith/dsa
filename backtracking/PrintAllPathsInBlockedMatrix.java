import java.util.ArrayList;
import java.util.List;

public class PrintAllPathsInBlockedMatrix {
    static List<Character> cur = new ArrayList<>();
    static List<List<Character>> ans = new ArrayList<>();
    private static void visit(int m[][], int i, int j){
        if(i < 0 || j < 0 || i >= m.length || j >= m[0].length)
            return;
        if(m[i][j] == -1)
            return;
        if(i == m.length-1 && j == m[0].length-1){
            List<Character> temp = new ArrayList<>();
            temp.addAll(cur);
            ans.add(temp);
        }

        cur.add('B');
        visit(m, i+1, j);
        cur.remove(cur.size()-1);

        cur.add('R');
        visit(m, i, j+1);
        cur.remove(cur.size()-1);
    }
    public static void main(String[] args) {
        int m[][] = {{10,5,3},{2,-1,0},{3,5,11}};
        visit(m, 0, 0);
        System.out.println(ans);
    }
}
