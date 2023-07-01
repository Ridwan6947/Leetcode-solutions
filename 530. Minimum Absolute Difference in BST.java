class Solution {
    int prev = Integer.MAX_VALUE;
    int ans = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return ans;
    }
    public void inorder(TreeNode root){
        if(root.left!= null)inorder(root.left);
        ans = Math.min(ans,Math.abs(root.val-prev));
        prev = root.val;
        if(root.right!=null) inorder(root.right);
    }
}
