class Solution {
    TreeNode treeFound;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    found(root,p,q);
    return treeFound;
        
    }
    
    public boolean[] found(TreeNode root, TreeNode p, TreeNode q){
     boolean[] pq =new boolean[2];
        if(treeFound!=null){
            return pq;
        }
        if(root==null){
            return pq;
        }
        if(root==p){
            pq[0]=true;
        }
        if(root==q){
            pq[1]=true;
        }

        boolean[] x= found(root.left,p,q);
        boolean[] y=found(root.right,p,q);
        pq[0]= x[0]||y[0]||pq[0];
        pq[1]= x[1]||y[1]||pq[1];
        if(pq[0] && pq[1] && treeFound==null){
        
        treeFound= root;}

        return pq;
        
    }
}
