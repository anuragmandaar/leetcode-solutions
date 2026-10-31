class Solution {
    public boolean repeatedSubstringPattern(String s) {
      int n=s.length();
      for(int i=1; i<=n/2; i++){
        if(n%i==0){
            String s2 = s.substring(0,i);
            if(s2.repeat(n/i).contains(s)){
                return true;
            }
        }
      }
      return false;
    }
}