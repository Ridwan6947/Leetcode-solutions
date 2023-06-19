class Solution {

    TreeNode curr;
    public TreeNode increasingBST(TreeNode root) {
        TreeNode first = new TreeNode(0);
        curr = first;
        inorder(root);
        return first.right;
    }
    
    private void inorder(TreeNode node){
        if(node == null) return;
        inorder(node.left);
        curr.right = new TreeNode(node.val);
        curr = curr.right;
        
        inorder(node.right);
    }
}
