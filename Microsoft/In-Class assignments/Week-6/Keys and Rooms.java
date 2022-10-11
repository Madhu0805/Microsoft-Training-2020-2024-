class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        DFS(rooms, 0, visited);
        for (int i = 0; i < n; i++) {
            if (visited[i] == false) {
                return false;
            }
        }
        return true;
     }
    public void DFS(List<List<Integer>> graph, int root, boolean[] visited) {
        visited[root] = true;
        for (Integer n : graph.get(root)) {
            if (visited[n] != true) {
                DFS(graph, n, visited);
            }
        }
    }
}
