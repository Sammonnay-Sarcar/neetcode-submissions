class Solution {
    public boolean buddyStrings(String s, String goal) {
    char[] sChars = s.toCharArray();
    char[] goalChars = goal.toCharArray();
    int c = 0;
      if (s.length() != goal.length()) {
            return false;
        }
    if(s.equals(goal)){
        Set<Character> temp = new HashSet<>();
            for (char ch : s.toCharArray()) {
                temp.add(ch);
            }
        return temp.size()<goal.length();
    }
     int firstDiff = -1, secondDiff = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (firstDiff == -1) {
                    firstDiff = i;
                } else if (secondDiff == -1) {
                    secondDiff = i;
                } else {
                    return false; // More than 2 differences
                }
            }
        }
        // Check if there are exactly 2 differences and swapping makes strings equal
        return secondDiff != -1 && s.charAt(firstDiff) == goal.charAt(secondDiff) && s.charAt(secondDiff) == goal.charAt(firstDiff);
    }
}
