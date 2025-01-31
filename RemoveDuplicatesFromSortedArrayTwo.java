import java.util.HashMap;

public class RemoveDuplicatesFromSortedArrayTwo 
{
    public int removeDuplicates(int[] nums) 
    {
        int unique = 0;

        for(int num : nums)
        {
            while(unique < 2 || num > nums[unique - 2])
            {
                nums[unique++] = num;
            }
        }

        return unique;
    }
}
