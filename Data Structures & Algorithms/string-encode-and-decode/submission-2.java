class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()){
            return "";
        }
        StringBuilder res = new StringBuilder();
        for(String s : strs){
            res.append(s.length()+"#"+s);
        }
        return res.toString();                   
    }

    public List<String> decode(String str) {
        if(str.equals("")){
            return new ArrayList<String>();
        }
        System.out.println(str);
        List<String> res = new ArrayList<>();
        int i = 0;
        while(str!=""){
            int length = Integer.parseInt(str.substring(0,str.indexOf('#')));
            i = str.indexOf('#')+1;
            res.add(str.substring(i,i+length));
            str = str.substring(i+length);    
        }
        return res;
    }
}
