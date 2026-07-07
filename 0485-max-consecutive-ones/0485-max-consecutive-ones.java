class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(1 == nums[i])
            {
                count++;
                max=Math.max(count,max);
            }
            else {
               
              
                 count=0;
            }
        }
        return max;
    }
}