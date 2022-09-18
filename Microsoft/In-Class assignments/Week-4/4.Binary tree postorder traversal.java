
class Solution {
    public List<Integer> list = new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null){
            return list;
        }
        if(root.left != null){
            callPostorder(root.left);
        }
        if(root.right != null){
            callPostorder(root.right);
        }
        list.add(root.val);
        return list;
    }
    public void callPostorder(TreeNode node){
        if(node.left != null){
            callPostorder(node.left);
        }
        if(node.right != null){
            callPostorder(node.right);
        }
        list.add(node.val);
    }
}
