class Solution {
    List<String> answer =  new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root,new ArrayList<>());
        return answer;
    }
    private void dfs(TreeNode root, List<Integer> list){
        if(root == null) return;
        list.add(root.val);
        if(root.left == null && root.right==null){
            StringBuilder sb = new StringBuilder();
            for(int l: list) sb.append("->"+l);
            answer.add(sb.substring(2));
        }
        dfs(root.left,list);
        dfs(root.right,list);
        list.remove(list.size()-1);
    }
}
