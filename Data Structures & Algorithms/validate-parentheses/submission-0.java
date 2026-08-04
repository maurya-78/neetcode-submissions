class Solution {
    public boolean isValid(String s) {
       int n = s.length();
       while(s.contains("()") || s.contains("{}") ||s.contains("[]")){
        s = s.replace("()","")
             .replace("{}","")
             .replace("[]","");
       }
       return s.isEmpty();
    }
}
