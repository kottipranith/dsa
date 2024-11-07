import java.util.*;

// Given a no of vertices and edges along with the  edges print the topological order assuming that it does not contain any loops

// java code

public class TopologicalOrderDfs {
    static Scanner sc = new Scanner(System.in);
    private static void dfs(Map<Integer,List<Integer>> g, int u, Set<Integer> vis, Stack<Integer> st){
        if(st.contains(u))
            return;
        vis.add(u);
        for(int v : g.get(u))
            if(!vis.contains(v))
                dfs(g,v,vis,st);
        st.push(u);

    }
    public static void main(String[] args) {
        ReadAdjList rl = new ReadAdjList();
        System.out.println("Enter no of vertices and edges");
        int nv = sc.nextInt();
        int ne = sc.nextInt();
//        Map<Integer, List<Integer>> g = rl.readUndirectedGraph(nv,ne);
        Map<Integer, List<Integer>> g = rl.readDirectedGraph(nv,ne);
        System.out.println(g);
        Set<Integer> vis = new HashSet<>();
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < nv; i++){
            if(!vis.contains(i))
                dfs(g,i,vis,st);
        }
        while(!st.isEmpty())
            System.out.print(st.pop() + " ");
    }
}

// python code

/*
nv, ne = map(int, input().split())
g = {}

for i in range(nv):
    g[i] = list()

for i in range(ne):
    u,v = map(int,input().split())
    g[u].append(v)

vis = set()
st = list()

def dfs(u):
    if u in vis:
        return
    vis.add(u)
    for v in g[u]:
        dfs(v)
    st.append(u)

for i in range(nv):
    if i not in vis:
        dfs(i)

print(st[::-1])


*/