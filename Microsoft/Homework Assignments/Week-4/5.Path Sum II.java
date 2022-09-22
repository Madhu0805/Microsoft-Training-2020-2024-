class Solution{
public boolean hasPathSum(TreeNode root, int targetSum) {
		return helper(root, targetSum);
	}

private boolean helper(TreeNode root, int targetSum){
	if(root == null){
		return false;
	}
	targetSum -= root.val;
	if(targetSum == 0 && root.left == null && root.right == null){
		return true;
	}

	return helper(root.left, targetSum) || helper(root.right, targetSum);
}
}
