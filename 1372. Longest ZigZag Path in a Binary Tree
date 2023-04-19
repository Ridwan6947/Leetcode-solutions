class Solution {
    int LongestPath = 0;
    public int longestZigZag(TreeNode root) {
        int[] a = helper(root);
        return LongestPath;
    }
    
    //  {Longest Path Ending At leftNode, Longest Path Ending At RightNode}
    public int[] helper(TreeNode root) {
        if (root == null) {
            return new int[]{-1, -1};
        }
        int[] left = helper(root.left);
        int[] right = helper(root.right);
        int[] answer = new int[]{left[1] + 1, right[0] + 1};
        LongestPath = Math.max(LongestPath, Math.max(answer[0], answer[1]));
        return answer;
    }
}
