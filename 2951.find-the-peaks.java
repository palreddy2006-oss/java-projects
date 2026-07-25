class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer>  al = new ArrayList<>();
        for (int  i = 1 ; i <= mountain.length-2 ; i++){
            if(mountain[i-1] < mountain[i] && mountain[i] > mountain[i+1]){
                al.add(i);
            }
        }
        return al;
    }
}