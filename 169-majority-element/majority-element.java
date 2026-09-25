class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int a=n/2;
        int i=0;
        for( i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>a){
                return nums[i];
            }
        }
        return nums[i-1];
    }
}