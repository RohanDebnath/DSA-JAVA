import java.util.LinkedList;

public class UndirectedGraph {
    private LinkedList<Integer>[] adj;
    private int V;
    private int E;

    public UndirectedGraph(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];
        for (int v = 0; v < V; v++) {
            adj[v] = new LinkedList<>();
        }
    }

    void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }

    public String print(){
        StringBuilder sb = new StringBuilder();
        sb.append(V+" vertices "+E+" Nodes"+"\n");
        for(int v=0;v<V;v++)
        {
            sb.append(v+": ");
            for (int w: adj[v]) {
                sb.append(w+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        UndirectedGraph ug= new UndirectedGraph(4);
        ug.addEdge(0, 1);
        ug.addEdge(1, 2);
        ug.addEdge(2, 3);
        ug.addEdge(3, 0);
        System.out.println(ug.print());

    }
}
