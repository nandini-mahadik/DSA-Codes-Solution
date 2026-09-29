import java.util.Arrays;

public class max_frquency {
    public int maxFrequency(int[] nums, int k) {

        Arrays.sort(nums);

        int left = 0;
        long sum = 0;
        int maxFreq = 1;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            long windowSize = right - left + 1;

            long requiredOperations = (long) nums[right] * windowSize - sum;

            while (requiredOperations > k) {

                sum -= nums[left];
                left++;

                windowSize = right - left + 1;

                requiredOperations = (long) nums[right] * windowSize - sum;
            }

            maxFreq = Math.max(maxFreq, right - left + 1);
        }

        return maxFreq;
    }
}
