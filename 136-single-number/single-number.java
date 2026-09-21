class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        boolean found;
        int i;
        for(i=0;i<n;i++){
            found=false;

            for(int j=0;j<n;j++){
                if(i!=j && nums[i]==nums[j]){
                    found = true;
                    break;
                }
            }
        
        if(found==false)
        return nums[i];
        }
        return -1;
    }
}