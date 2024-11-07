import java.util.*;

public class ReadAdjList {
    Scanner sc = new Scanner(System.in);

    public Map<Integer, List<Integer>> readDirectedGraph(int nv, int ne){
        Map<Integer, List<Integer>> g = new HashMap<>();
        for(int i = 0; i < nv; i++)
            g.put(i, new ArrayList<>());
        for(int i = 0; i < ne; i++){
            int u = sc.nextInt(), v = sc.nextInt();
            g.get(u).add(v);
        }
        return g;
    }

    public Map<Integer,List<Integer>> readUndirectedGraph(int nv, int ne){
        Map<Integer,List<Integer>> g = new HashMap<>();
        for(int i = 0; i < nv; i++)
            g.put(i, new ArrayList<>());
        for(int i = 0; i < ne; i++){
            int u = sc.nextInt(), v = sc.nextInt();
            g.get(u).add(v);
            g.get(v).add(u);
        }
        return g;
    }

}
