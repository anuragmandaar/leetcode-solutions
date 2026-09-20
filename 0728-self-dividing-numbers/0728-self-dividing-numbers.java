class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> arr = new ArrayList<>();
        for(int i=left; i<=right; i++){
          char[] arr2 = String.valueOf(i).toCharArray(); 
          int count =0; 
          for (int j = 0; j < arr2.length; j++) {
           int digit = arr2[j] - '0';
           if (digit != 0 && i % digit == 0) {
            count+=1;
           }
        }
        if (count==arr2.length){
            arr.add(i);
           }
        }
        return arr;
    }
}