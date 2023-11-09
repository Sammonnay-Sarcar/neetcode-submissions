class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        StringBuilder S = new StringBuilder();
        String[] pathArray = path.trim().split("/");
        for(String s : pathArray){
            if(s.equals("") || s.equals("."))continue;
            //important; else in the second else if, if there is null in array, null is pushed  to stack and when pop is called, it pops null instead of the string. Could have added a condition there such as, push only if it is not null. This is more readable(using another if condition)
            else if(s.equals("..") && !stack.isEmpty())
            {stack.pop();
           }
            else if(!s.equals("..") && !s.equals("."))
            stack.push(s);
        }
        if (stack.isEmpty())
        return "/";
        for(String s: stack){
            if(!s.equals(""))
            S.append("/"+s);
        }
        return S.toString();
    }
}
