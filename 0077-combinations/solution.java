class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> combinations = new ArrayList<>();
        List<List<Integer>> answer = new ArrayList<>();
        combinator(k, combinations,answer, 0, n  );
        return answer;
    }
    public static void combinator(int len, List<Integer> combinations, List<List<Integer>> answer, int start, int end){
        if(len == 0){
            answer.add(new ArrayList<>(combinations));
        }else{
            for(int i = start+1; i<= end; i++ ){
                combinations.add(i);
                combinator(len-1, combinations, answer,i, end);
                combinations.remove(combinations.size() - 1);
            }
        }
    }
}
