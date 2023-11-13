class Solution {
    public String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                vowels.add(c);
            }
        }
        Collections.sort(vowels, Collections.reverseOrder());
        StringBuilder res = new StringBuilder();
        for(char ch: s.toCharArray()){
             if ("aeiouAEIOU".indexOf(ch) != -1) {
                res.append(vowels.get(vowels.size() - 1));
                vowels.remove(vowels.size() - 1);
            } else {
                res.append(ch);
            }
        }
        return res.toString();
    }
}
