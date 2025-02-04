public class NumberOfIslands
{
    public int numIslands(char[][] grid) 
    {
        int answer = 0;
        for(int i = 0; i < grid.length;i++)
        {
            for(int j = 0; j < grid[0].length;j++)
            {
                if(grid[i][j] == '1')
                {
                    search(grid,i,j);
                    ++answer;
                }
            }
        }

        return answer;
    }


    private void search(char[][] grid, int i, int j)
    {
        if(i < 0 || i == grid.length || j < 0 || j == grid[0].length)
        {
            return;
        }

        if(grid[i][j] != '1')
        {
            return;
        }

        grid[i][j] ='2';

        search(grid, i + 1, j);
        search(grid, i - 1, j);
        search(grid, i, j + 1);
        search(grid, i, j - 1);
    }
}