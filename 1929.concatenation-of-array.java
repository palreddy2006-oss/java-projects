class Solution {
    public int[] getConcatenation(int[] arr) {
        
        
        int n = arr.length ;
        int size = 2 * n;
        int[] nums = new int[size];
        int  i;
        for (i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
            nums[i + n] = arr[i];
        }
       
        return nums;
    
        
    }
}