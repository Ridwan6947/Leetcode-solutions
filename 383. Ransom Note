class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>map = new HashMap<>();
        int n = ransomNote.length();
        int m = magazine.length();
        for(int i = 0 ; i < n ; i++){
            if(!map.containsKey(ransomNote.charAt(i))){
                map.put(ransomNote.charAt(i),1);
            }else{
                map.put(ransomNote.charAt(i) , map.get(ransomNote.charAt(i))+1);
            }
        }
        for(int j=0;j<magazine.length();j++){
            if(map.containsKey(magazine.charAt(j))){
                map.put(magazine.charAt(j),map.get(magazine.charAt(j))-1);
                if(map.get(magazine.charAt(j))==0){
                   map.remove(magazine.charAt(j));
                }
            }
        }
        return map.size() == 0;

    }
}
