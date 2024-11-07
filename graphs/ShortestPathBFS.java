import java.lang.reflect.Array;
import java.util.*;

public class ShortestPathBFS {
    static Scanner sc = new Scanner(System.in);
    static ReadAdjList rlist = new ReadAdjList();
    static void bfs(Map<Integer,List<Integer>> g, int s, Set<Integer> vis, int[] dist, int parent[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        vis.add(s);
        dist[s] = 0;
        parent[s] = -1;
        while(!q.isEmpty()){
            int u = q.poll();
            //System.out.print(u + " ");
            for(int v : g.get(u)){
                if(!vis.contains(v)){
                    q.add(v);
                    vis.add(v);
                    dist[v] = dist[u] + 1;
                    parent[v] = u;
                }
            }
        }
    }
    public static void main(String[] args) {
        int nv = sc.nextInt(), ne = sc.nextInt();
        Map<Integer, List<Integer>> g = rlist.readUndirectedGraph(nv, ne);
        System.out.println(g);
        Set<Integer> vis = new HashSet<>();
        int dist[] = new int[nv]; // it is the array that contains shortest distance between source to every other index
        int parent[] = new int[nv];
        Arrays.fill(dist, -1);
        int src = 2;
        bfs(g, 2, vis, dist, parent);
        int des = 1;
        List<Integer> path = new ArrayList<>();
        int cur = des;
        path.add(cur);
        while(parent[cur] != -1){
            path.add(parent[cur]);
            cur = parent[cur];
        }
        System.out.println("Distance from " + src + " to " + des +" is " + dist[des] + " and path is " + path);
    }
}

