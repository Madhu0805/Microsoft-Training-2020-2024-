class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        
        if (root.val == key) {
            // delete
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            
            TreeNode minNode = getMin(root.right);
            root.right = deleteNode(root.right, minNode.val);
            minNode.left = root.left;
            minNode.right = root.right;
            root = minNode;
        }
        
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        }
        
        if (key > root.val) {
            root.right = deleteNode(root.right, key);
        }
        return root;
    }
    
    public TreeNode getMin(TreeNode node) {
        while (node.left != null) node = node.left;
        return node;
    }
}
