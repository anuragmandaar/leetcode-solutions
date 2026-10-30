class Solution {
    public int[] sortedSquares(int[] nums) {
    int n = nums.length;
    int[] arr = new int[n];
    int i = 0;
    int j = n-1;
    int a = n-1;
    while(i<=j){
        if(nums[i]*nums[i] > nums[j]*nums[j]){
            arr[a]=nums[i]*nums[i];
            i++;
        }
        else{
            arr[a]=nums[j]*nums[j];
            j--;
        }
        a--;
    }
    return arr;
    }
}