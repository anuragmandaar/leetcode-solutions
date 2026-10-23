class Solution {
    public void moveZeroes(int[] nums) {
       int j=0;
       int k=nums.length;
       for(int i=0; i<nums.length; i++){
        if(nums[i]!=0){
            nums[j]=nums[i];
            j++;
        }
       } 
       while(k-1>=j){
        nums[k-1]=0;
        k--;
       }
    }
}