package Easy;

public class SearchInsertPosition
{
    public int searchInsert(int[] nums, int target) 
    {
        int r = nums.length;
        int l = 0;
        while(l < r)
        {
            final int pivot = (l + r)/2;
            if(nums[pivot] == target)
            {
                return pivot;
            }

            if(nums[pivot] < target)
            {
                l = pivot + 1;
            }

            else
            {
                r = pivot;
            }
        }

        return l;
    }
}