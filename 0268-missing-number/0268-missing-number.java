class Solution {
    public int missingNumber(int[] nums) {
        int x=nums.length;
        int ans=x*(x+1)/2;
        int res=0;
        for(int num:nums){
            res+=num;
        }
        return ans-res;
    }
}