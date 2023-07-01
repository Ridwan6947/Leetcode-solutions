class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i = 0 ; i <s.length(); i++){
            char t = s.charAt(1);
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        List<Character> sorted= new ArrayList<>(map.keySet());
        Collections.sort(sorted, (a,b) -> map.get(b)-map.get(a));


        String t="";
        for(int i=0;i<sorted.size();i++){
            char d= sorted.get(i);
            for(int j=0; j<map.get(d);j++){
                t+=d;
            }
        }
        return t;
    }
}
