class Solution {
    int preindx=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       
        TreeNode ans=solve(preorder,inorder,0,inorder.length-1);
        return ans;
    }
    public TreeNode solve(int[] preorder, int[] inorder,int s,int e){
        if (s>e){
            return null;
        }
        int ele=preorder[preindx++];
       TreeNode temp=new TreeNode(ele);
        int pos=find(inorder,ele,s,e);
        temp.left=solve(preorder,inorder,s,pos-1);
        temp.right=solve(preorder,inorder,pos+1,e);
        return temp;
    }
    public int find(int inorder[],int ele,int s,int e){
        for(int i=s; i<=e; i++){
            if(ele==inorder[i])
                return i;        }
        return -1;
    }
}
