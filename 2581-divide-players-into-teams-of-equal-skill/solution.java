class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long sum = 0;
        int pair = skill[0]+skill[skill.length - 1];
        for(int i = 0; i<skill.length/2;i++){
            if(skill[i]+ skill[skill.length - i -1] != pair){
                return -1;
            }
            sum += skill[i]* skill[skill.length - i -1];
        }
        return sum;
    }
}
