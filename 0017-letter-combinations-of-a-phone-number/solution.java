class Solution {
    public List<String> letterCombinations(String digits) {
         if (digits.isEmpty()) return Collections.emptyList();
        String[] arr ={"abc","def","ghi","jkl","mno","pqrs","tuv", "wxyz"};
        List<String> answer = new ArrayList<>();
        combinator("", arr, digits, answer);
        return answer;
    }
    public static void combinator(String res, String[] arr, String digits, List<String> answer ){
        if(digits.isEmpty()){
            answer.add(res);
        }else{
            String letters = arr[digits.charAt(0) - '2'];
            for(char letter : letters.toCharArray()){
                combinator(res+letter,arr, digits.substring(1), answer);
            }
        }
    }
}
