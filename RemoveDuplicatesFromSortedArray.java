public class RemoveDuplicatesFromSortedArray 
{
    public int removeDuplicates(int[] nums) 
    {
        int intLength = nums.length;
        int unique = 1;

        for(int i = 1; i < intLength;++i)
        {
            if(nums[i] != nums[i - 1])
            {
                nums[unique] = nums[i];
                unique++;
            }
        }

        return unique;
    }
}
