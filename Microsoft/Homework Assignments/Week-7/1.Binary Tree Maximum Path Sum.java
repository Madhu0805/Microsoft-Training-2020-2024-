
class Solution {
    public int maxPathSum(TreeNode root) {
        int a[]=new int[1];
        a[0]=Integer.MIN_VALUE;
        int k=task(root,a);
        return a[0];
    }
    public int task(TreeNode root, int a[])
    {
        if(root==null)
            return 0;
        int l=task(root.left,a);
        if(l<0)
            l=0;
        int r=task(root.right,a);
        if(r<0)
            r=0;
        a[0]=Math.max(a[0],l+r+root.val);
        return Math.max(r,l)+root.val;
    }
}
