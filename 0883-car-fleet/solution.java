class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
       List<List<Integer>> calc = new ArrayList<>();
       double lastCarArrivalTime = 0;
       int counter = 0;
       for(int i = 0; i<position.length; i++){
           List<Integer> temp = new ArrayList<>();
           temp.add(position[i]);
           temp.add(speed[i]);
           calc.add(temp);
       }
       calc.sort((x,y)->Integer.compare(y.get(0), x.get(0)));
       for(List<Integer> temp : calc){
           double arrivalTime = (target - temp.get(0))/(double) temp.get(1);
           if(arrivalTime > lastCarArrivalTime){
               counter++;
               lastCarArrivalTime = arrivalTime;
           }
       }
       return counter;
    }
}
