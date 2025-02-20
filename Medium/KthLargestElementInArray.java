package Medium;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElementInArray
{
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(final int num: nums)
        {
            heap.offer(num);
        }

        for(int i = 0; i < k;++i)
        {
            if(i == k - 1)
            {
                return heap.poll();
            }

            else
            {
                heap.poll();
            }
        }
        return - 1;
    }
}