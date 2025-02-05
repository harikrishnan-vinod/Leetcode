import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class SnakesAndLadders {
    public int snakesAndLadders(int[][] board) 
    {
        Queue<Integer> q = new ArrayDeque<>(List.of(1));
        final int n = board.length;
        boolean[] seen = new boolean[1 + n * n];

        int arr[] = new int[1 + n * n];
        for(int i = 0; i < n; ++i)
        {
            for(int j = 0; j < n;++j)
            {
                arr[(n - 1 - i) * n + ((n - i) % 2 == 0 ? (n - j): j + 1)] = board[i][j];
            }
        }

        for(int moves = 1; !q.isEmpty();++moves)
        {
            for(int sz = q.size(); sz > 0;--sz)
            {
                final int curr = q.poll();
                for(int next = curr + 1; next <= Math.min(curr + 6, n * n);++next)
                {
                    final int dest = arr[next] > 0 ? arr[next]: next;
                    if(dest == n * n)
                    {
                        return moves;
                    }
                    if(seen[dest])
                    {
                        continue;
                    }
                    q.offer(dest);
                    seen[dest] = true;
                }
            }
        }
        return -1;
    }
}
