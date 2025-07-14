class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int [] diff = new int[nums.length];
        for(int i = 0; i<nums.length; i++) {
            
            int [] arr = distinctCount(nums, i);
            System.out.println(Arrays.toString(arr));
            int prefix = arr[0];
            int suffix = arr[1];
           
            diff[i] = prefix - suffix;
        }
        return diff;
    }

    public int[] distinctCount(int[] nums, int index) {
        int res[] = new int[2];
        res[0] = index +1;
        res[1] = nums.length - (index+1);
      

        for(int i = index+1; i<nums.length-1;i++) {
            for(int j = i+1;j<nums.length;j++) {
                if (nums[i] == nums[j]) {
                    System.out.println(i);
                    System.out.println(j);
                    res[1]--;
                }
            }
            
        }
        for(int i = index; i>0;i--) {
             for(int j = i-1;j>=0;j--) {
                if(nums[i]==nums[j]){
                    res[0]--;
                }
            }
            
        }
       
        return res;
    }
}
