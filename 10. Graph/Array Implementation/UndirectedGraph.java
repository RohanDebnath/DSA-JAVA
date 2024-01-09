public class UndirectedGraph {
    private int V;
    private int E;
    private int matrix[][];

    UndirectedGraph(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.matrix = new int[nodes][nodes];
    }

    void addEgde(int u, int v) {
        matrix[u][v] = 1;
        matrix[v][u] = 1;
        E++;
    }

    String arrayFormat() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " Vertices " + E + " Edges" + "\n");
        // System.out.println();
        for (int v = 0; v < V; v++) {
            sb.append(v + ": ");
            for (int w : matrix[v]) {
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        UndirectedGraph ug = new UndirectedGraph(4);
        ug.addEgde(0, 1);
        ug.addEgde(1, 2);
        ug.addEgde(2, 3);
        ug.addEgde(3, 0);
        System.out.println(ug.arrayFormat());
    }
}
