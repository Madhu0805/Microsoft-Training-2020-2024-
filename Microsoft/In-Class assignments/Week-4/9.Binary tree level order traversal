class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(q.isEmpty() == false){
            List<Integer> list = new ArrayList<>();
            int count = q.size();
    
            for(int i = 0; i < count; i++){
                TreeNode curr = q.poll();
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
                list.add(curr.val);
            }
            
            ans.add(list);
        }
        
        return ans;
    }
}
