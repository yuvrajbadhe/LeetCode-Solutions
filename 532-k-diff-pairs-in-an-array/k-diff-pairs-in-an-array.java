class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0){
            return 0;
        }
        Arrays.sort(nums);
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int sum = nums[j] - nums[i];

                if (sum == k) {
                    count++;
                    break;
                }

                if (sum > k) {
                    break;
                }
            }
        }

        return count;
    }
}