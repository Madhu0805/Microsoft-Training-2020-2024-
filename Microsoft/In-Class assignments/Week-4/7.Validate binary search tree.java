
class Solution {

Integer prev = null;
public boolean isValidBST(TreeNode root) {
    if(root == null){
        return true;
    }
     
    boolean left = isValidBST(root.left);
    
    if(prev == null){
        prev = root.val;
    }else if(root.val <= prev){
        return false;
    }else{
        prev = root.val;
    }
    
    boolean right =  isValidBST(root.right);
    
    return left && right;
}
}

