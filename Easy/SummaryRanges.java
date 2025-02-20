package Easy;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        int arrayLength = nums.length;

        for (int i = 0; i < arrayLength;i++)
        {
            int j = i;
            while(j + 1 < arrayLength && nums[j + 1] == nums[j] + 1)
            {
                j++;
            }
            result.add(createRange(i, j, nums));
            i = j;
        }

        return result;
    }

    private String createRange(int startInt, int endInt, int[] nums)
    {
        if(startInt == endInt)
        {
            return Integer.toString(nums[startInt]);
        }

        else{
            return String.format("%d->%d", nums[startInt], nums[endInt]);
        }
    }

    public static void main(String[] args)
    {
        int[] nums = {0,1,2,4,5,7};
        SummaryRanges obj = new SummaryRanges();
        System.out.println(obj.summaryRanges(nums));
    }
}
