class Solution {
    public List<List<String>> solveNQueens(int n) {
           List<List<String>> ansList = new ArrayList<>();
           int board[][] = new int[n][n];
           solve(0 , n, board, ansList);
           return ansList;
    }

    public void solve(int row, int n, int[][] board, List<List<String>> ansList){
        if(row>=n)
        {
            ansList.add(constructSolution(n , board));
            return;
        }
        for(int col= 0;col<n;col++)
        {
            if(isSafe(row, col, board, n))
            {
                board[row][col] = 1;
                solve(row+1, n , board, ansList );
                board[row][col] = 0;
            }
        }
    }

    public boolean isSafe(int row, int col, int board[][], int n)
    {
        for(int i=0;i<row;i++)
        {
            if(board[i][col]==1) return false;
        }

        for(int i=row, j = col; i>=0 && j>=0;i--,j--)
        {
            if(board[i][j]==1) return false;
        }

        for(int i = row, j = col ; i>=0 && j<n;i--,j++)
        {
            if(board[i][j]==1) return false;
        }

        return true;
    }

    public List<String> constructSolution(int n, int[][] board){
        List<String> ans = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<n;j++)
            {
                if(board[i][j]==1) sb.append('Q');
                if(board[i][j]==0) sb.append('.');
            }
            ans.add(sb.toString());
        }
        return ans;
    }
}