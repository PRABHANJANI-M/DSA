class Solution {

    public int[] sortArrayByParityII(int[] nums) {

        int left = 0;
        int right = 1;

        while(left < nums.length && right < nums.length) {

            if(nums[left] % 2 == 0) {
                left += 2;
            }

            else if(nums[right] % 2 != 0) {
                right += 2;
            }

            else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left += 2;
                right += 2;
            }
        }

        return nums;
    }
}