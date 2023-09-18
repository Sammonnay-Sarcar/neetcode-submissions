class Solution {
    public int romanToInt(String s) {
        int length = s.length();
        int number = 0;
        for(int i = length-1; i>= 0; i--){
            char ch = s.charAt(i);
            int num;
            switch(ch){
                case 'I': num = 1;
                break;
                case 'V': num = 5;
                break;
                case 'X': num = 10;
                break;
                case 'L': num = 50;
                break;
                case 'C': num = 100;
                break;
                case 'D': num = 500;
                break;
                case 'M': num = 1000;
                break;
                default: num = 0;
            }
            if(4*num < number)
            number -= num;
            else
            number += num;
        }
        return number;
    }
}
