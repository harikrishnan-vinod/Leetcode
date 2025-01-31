public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int numsLength = nums.length;
        int answer = Integer.MAX_VALUE;
        int sum = 0;

        for(int i = 0, j = 0; j < numsLength; j++)
        {
            sum += nums[j];
            while(sum >= target)
            {
                answer = Math.min(j - i + 1, answer);
                sum -= nums[i++];
            }
        }
        return answer == Integer.MAX_VALUE ? 0 : answer;
    }
}
