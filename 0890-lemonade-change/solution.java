class Solution {
    public boolean lemonadeChange(int[] bills) {
        int bal5=0, bal10=0;
        for(int bill:bills){
            System.out.println("bill="+bill +"..5="+bal5+"..10="+bal10);
            if(bill ==5)
            bal5++;
            else if(bill ==10){
                bal10++;
                if(bal5 ==0)
                return false;
                bal5--;
            }else if(bill ==20){
                if((bal5>=1 && bal10>=1) || (bal5>=3)){
                    if(bal10>=1 && bal5 >=1){
                    bal10--;
                    bal5--;
                }else if(bal5>=3){
                    bal5-=3;
                }
            }
              else{
                    return false;
                }  
            }

            
        }
        return true;
    }
}
