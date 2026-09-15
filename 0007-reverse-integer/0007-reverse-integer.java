class Solution {
    public int reverse(int x) {
      int n=0;
      while(x!=0){
        int j=x%10;
        if(n > 214748364 ||(n == 214748364 && j>7) || n<-214748364 || (n == -214748364 && j< -8)){
    return 0;
    }
        n=n*10+j;
        x=x/10;
      }
    
    return (n);
    }
}