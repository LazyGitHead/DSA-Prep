class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int sum2=0;
        int m=nums.length;
        for(int i=0;i<=m;i++){
        sum+=i;
    }
    for(int i=0;i<m;i++){
    sum2+=nums[i];
    }
    return sum-sum2;
}
}

//         Arrays.sort(nums);
//         int n=nums.length;
//         int i=0;
//         while(i<n){
//         // for(int i = 0; i < nums.length-1; i++) {
//             if (nums[i] != i ) {
//                 return i;
//             }
//                 i++;
//     }
//         return n;
// }
// }