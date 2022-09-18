class Solution {
  public boolean isBalanced(TreeNode root) {
    if (helper(root) == -1) return false;

    return true;
  }
  int helper(TreeNode root) {

    if (root == null) {
      return 0;

    }

    int l = helper(root.left);
    int r = helper(root.right);
    if (l == -1 || r == -1 || Math.abs(l - r) > 1) return -1;
    else return Math.max(l, r) + 1;

  }
}
