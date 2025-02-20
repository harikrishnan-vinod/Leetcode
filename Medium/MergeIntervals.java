package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals 
{
    public int[][] merge(int[][] intervals) 
    {
        int numsLength = intervals.length;
        if (numsLength <= 1)
        {
            return intervals;
        }
        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        result.add(intervals[0]);

        for(int i = 0; i < numsLength;i++)
        {
            int start = intervals[i][0];
            int end = intervals[i][1];

            int[] lastMergedInterval = result.get(result.size() - 1);
            if(lastMergedInterval[1] < start)
            {
                result.add(intervals[i]);
            }

            else{
                lastMergedInterval[1] = Math.max(lastMergedInterval[1], end);
            }
        }

        return result.toArray(new int[result.size()][]);
    }


    public static void main(String[] args)
    {
        int[][] hello = {{1,6},{2,12}, {1,4}, {8,10},{15,18}};
        System.out.println(Arrays.deepToString(hello));
        Arrays.sort(hello, (a,b) -> a[1] - b[1]);
        System.out.print(Arrays.deepToString(hello));
        
    }
}
