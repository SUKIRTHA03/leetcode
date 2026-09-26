class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int count=0;
        int far=0;
        int cur=0;
        for(int i=0;i<n-1;i++){
            if(i+nums[i]>far){
                far=i+nums[i];
            }
            if(i==cur){
                count++;
                cur=far;
            }
        }
        return count;
    }
}