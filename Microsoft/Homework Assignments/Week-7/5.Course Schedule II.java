class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0 ; i < numCourses; i++){
            graph.add(new ArrayList<Integer>());
        }
        for(int[] cur : prerequisites){
            int course = cur[0];
            int pre = cur[1];
            graph.get(course).add(pre);
        }
        List<Integer> curResult = new ArrayList<>();
        int[] visited = new int[numCourses];
        for(int i = 0; i < numCourses; i++){
            if(findCircle(i, graph, curResult, visited)){
                return new int[0];
            }
        }
        int[] result = new int[curResult.size()];
        for(int i = curResult.size() - 1; i >= 0; i--){
             result[i] = curResult.get(i);
        }
        return result;
    }
    public boolean findCircle(int cur, List<List<Integer>> graph, List<Integer> curResult, int[] visited){
        if(visited[cur] == 1){
            return true;
        }
        if(visited[cur] == 2){
            return false;
        }
        visited[cur] = 1;
        for(int next : graph.get(cur)){
            if(findCircle(next, graph, curResult, visited)){
                return true;
            }
        }
        visited[cur] = 2;
        curResult.add(cur);
        return false;
    }
}
