import java.util.*;

public class GraphUsingAdjacencyList {
    private static  void printAdjList(Map<Integer,List<Integer>> graph){
        for(Map.Entry<Integer,List<Integer>> i: graph.entrySet()){
            System.out.println(i.getKey()+" : "+ i.getValue());
        }
    }
    private static void bfs(Map<Integer,List<Integer>> graph, int s, Set<Integer> vis){
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        vis.add(s);
        while(!q.isEmpty()){
            int u = q.poll();
            System.out.print(u + " ");
            for(int v : graph.get(u)){
                if(!vis.contains(v)) {
                    q.add(v);
                    vis.add(v);
                }
            }
        }
    }
    private static boolean isReachable(Map<Integer,List<Integer>> graph, int src, int dest){
        Queue<Integer> q  = new LinkedList<>();
        Set<Integer> vis = new HashSet<>();
        q.add(src);
        vis.add(src);
        while (!q.isEmpty()){
            int u = q.poll();
            if(u == dest)
                return true;
            for(int v : graph.get(u)){
                if(!vis.contains(v)){
                    q.add(v);vis.add(v);
                }
            }
        }
        return false;
    }
    private static void dfs(Map<Integer,List<Integer>> graph, int s, Set<Integer> vis){
        if(vis.contains(s))
            return;
        System.out.print(s + " ");
        vis.add(s);
        for(int v : graph.get(s)){
            dfs(graph,v,vis);
        }
    }
    public static void main(String[] args) {
        ReadAdjList rl = new ReadAdjList();
        Scanner sc = new Scanner(System.in);
        int nv = sc.nextInt(), ne = sc.nextInt();
        Map<Integer, List<Integer>> graph = rl.readUndirectedGraph(nv,ne);
        Set<Integer> vis = new HashSet<>();
        //bfs(graph,0,vis);
        //printAdjList(graph);
        //dfs(graph,0,vis);
        System.out.println(isReachable(graph,0, 3));
    }
}
