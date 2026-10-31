class Solution {
    public boolean repeatedSubstringPattern(String s) {
      String s2 = s+s;
      String s3 = s2.substring(1,s2.length()-1);
      return s3.contains(s);
    }
}