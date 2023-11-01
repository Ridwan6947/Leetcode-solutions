class Solution {
    public int[] findMode(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        inOrder(root,list);

        int maxCount = 0;

        for(int i : list){
            map.put(i , map.getOrDefault(i,0) + 1);
            maxCount = Math.max(maxCount , map.get(i));
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == maxCount){
                ans.add(entry.getKey());
            }
        }

        int arr[] = new int[ans.size()];
        for(int i = 0 ; i < ans.size() ; i++){
            arr[i] = ans.get(i);
        }
        return arr;

        
    }
    public void inOrder(TreeNode root , List<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        inOrder(root.left,list);
        inOrder(root.right,list);
    }
}