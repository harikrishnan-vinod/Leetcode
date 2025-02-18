import java.util.HashMap;
import java.util.Map;

public class TwoSum
{
    public int[] twoSum(int[] nums, int target) 
    {
        Map<Integer, Integer> mapp = new HashMap<>();
        int numsLength = nums.length;
        
        for(int i = 0; i < numsLength;++i)
        {
            if(mapp.containsKey(target - nums[i]))
            {
                return new int[] {mapp.get(target - nums[i]), i};
            }
            mapp.put(nums[i], i);
        }

        throw new IllegalArgumentException();
    }
}