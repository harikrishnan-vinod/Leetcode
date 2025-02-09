public class RemoveElement {
    public int removeElement(int[] nums, int val) 
    {
        int change = 0;
        for(final int num: nums)
        {
            if(num != val)
            {
                nums[change++] = num;
            }
        }
        return change;
    }
}
