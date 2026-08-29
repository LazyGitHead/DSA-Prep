class Solution {
    public int singleNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor=nums[i]^xor;
        }
        return xor;
    //     int count=0;
    //     int num=0;
    //     for(int i=0;i<nums.length;i++){
    //         num = nums[i];
    //         for(int j=0;j<nums.length;j++){
    //             if(nums[j]==num) count++;
    //             }
            
    //               if(count==1)  return num;
    // }
    //     return num;
    }
}
