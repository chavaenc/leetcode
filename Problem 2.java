class Solution {
    public int unequalTriplets(int[] nums) {
        int count = 0;
        if (nums.length == 3) {
            if (nums[0] != nums[1] && nums[0] != nums[2] && nums[1] != nums[2]) {
                return 1;
            } else {
                return 0;
            }
        } else {
            for (int i = 0; i<nums.length-2;i++){
                for(int j = i+1; j<nums.length-1;j++) {
                    for(int k = j+1; k<nums.length;k++) {
                        if(nums[i] != nums[j] && nums[i]!=nums[k] && nums[j]!=nums[k]){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
