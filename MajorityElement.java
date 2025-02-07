import java.util.HashMap;
import java.util.Map;

public class MajorityElement {//this runs alot slower but uses lesser memory on Leetcode
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        final int n = nums.length;
        for (final int num : nums)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.get(num) > n/2)
            {
                return num;
            }
        }

        return -1;
    }

    public int majorityElement2(int[] nums) //this runs alot faster but uses alot more memory somehow on LeetCode
    {
        int majority = nums[0], votes = 0;

        for(int i = 0; i < nums.length;++i)
        {
            if(votes == 0)
            {
                majority = nums[i];
                votes++;
            }

            else
            {
                if(majority == nums[i])
                {
                    votes++;
                }
                else
                {
                    votes--;
                }
            }   
        }

        return majority;
    }
}
