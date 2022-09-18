
class Solution {
    List<Integer>arr=new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        preorder(root);
        return arr;
    }
    public void preorder(TreeNode root){
        if(root!=null){
            preorder(root.left);
            arr.add(root.val);
            preorder(root.right);
        }
    }
}
