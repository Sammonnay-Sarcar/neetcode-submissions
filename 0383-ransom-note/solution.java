class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineMap = new HashMap<Character, Integer>();
        for(int i =0; i<magazine.length(); i++){
            char ch = magazine.charAt(i);
            if(magazineMap.containsKey(ch)){
                magazineMap.put(ch, magazineMap.get(ch) + 1 );
            }
            else
            magazineMap.put(ch, 1);
        }
        for(int i =0; i<ransomNote.length();i++){
            char ch = ransomNote.charAt(i);
            if(!magazineMap.containsKey(ch) || magazineMap.get(ch)<1){
                return false;
            }
            magazineMap.put(ch, magazineMap.get(ch) - 1);
        }
        return true;
    }
}
