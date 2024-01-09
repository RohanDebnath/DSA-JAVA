import java.util.*;

public class Graph {
    private LinkedList<Integer> adj[];
    private int E;
    private int V;

    public Graph(int nodes) {
        this.adj = new LinkedList[nodes];
        this.V = nodes;
        this.E = 0;

        for (int v = 0; v < V; v++) {
            adj[v] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }

    public String printing() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " vertices " + E + " edges \n");
        for (int v = 0; v < V; v++) {
            sb.append(v + " :");
            for (int w : adj[v]) {
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    public void DFS(int s){
        boolean[] visited=new boolean[V];
        Stack<Integer> stack= new Stack<>();
        stack.push(s);
        visited[s]=true;
        while (!stack.isEmpty()) {
            int u=stack.pop();
            System.out.print(u+" ");
            for (int w : adj[u]) {
                if(!visited[w]){
                    visited[w]=true;
                    stack.push(w);
                }
            }
        }
    }
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        g.addEdge(2, 4);
        System.out.println(g.printing());
        g.DFS(0);
    }
}
