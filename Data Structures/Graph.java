import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;

public class Graph<T> {
    private Map<T, List<T>> map = new HashMap<>();

    public void addNode(T node) {
        map.put(node, new LinkedList<T>());
    }

    public void addEdge(T src, T dest, boolean bidirectional) {
        if (!map.containsKey(src))
            addNode(src);
        if (!map.containsKey(dest))
            addNode(dest);

        map.get(src).add(dest);
        if (bidirectional) {
            map.get(dest).add(src);
        }
    }

    public List<T> neighbours(T node) {
        if (!map.containsKey(node))
            return new ArrayList<T>();

        return map.get(node);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        for (T node : map.keySet()) {
            str.append(node.toString() + " : ");
            for (T s : map.get(node)) {
                str.append(s.toString() + ",");
            }
            str.append("\n");
        }

        return str.toString();
    }

    public int[][] adjacencyMatrix() {
        int size = map.size();
        int matrix[][] = new int[size][size];

        Map<T, Integer> indexMap = new HashMap<>();
        int idx = 0;
        for (T node : map.keySet()) {
            indexMap.put(node, idx++);
        }

        for (T src : map.keySet()) {
            int i = indexMap.get(src);
            for (T dest : map.get(src)) {
                int j = indexMap.get(dest);
                matrix[i][j] = 1; 
            }
        }

        return matrix;
    }
}
