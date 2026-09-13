class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        int no = x;
        int number = 0;
        while(x!=0){
            int digit=x%10;
            number = number*10+digit;
            x=x/10;
        }
        return (no==number);

    }
}