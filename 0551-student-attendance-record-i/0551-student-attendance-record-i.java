class Solution {
    public boolean checkRecord(String s) {
        int count=0;
    for(int i=0; i<s.length(); i++){
        if(s.charAt(i)=='A') count++;
        if(i<s.length()-2 && s.charAt(i) == s.charAt(i+1) && s.charAt(i+1) == s.charAt(i+2) && s.charAt(i+2) == 'L') return false;
    }   
    return count<2;
    }
}