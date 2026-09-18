class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int digitCount=0;
            int temp=nums[i];
            while(temp>0){
            int digits=temp%10;
            digitCount++;
            temp/=10;
            }
            if(digitCount%2==0){
                count++;
            }
        }
        return count;
    }
}