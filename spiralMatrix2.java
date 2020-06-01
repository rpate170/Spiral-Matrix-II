class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int count = 1;
        int cs = 0, ce = n-1;
        int rs = 0, re = n-1;
        
        while (rs <= re && cs <= ce) {
            //left to right
            for (int col = cs; col <= ce; col++) {
                matrix[rs][col] = count;
                count++;
            }
            //top to bottom
            for (int row = rs+1; row <= re; row++) {
                matrix[row][ce] = count;
                count++;
            }
            //right to left
            for (int col = ce-1; col >= cs; col--) {
                if (ce == cs) {
                    break;
                }
                matrix[re][col] = count;
                count++;
            }
            //bottom to top
            for (int row = re-1; row > rs; row--) {
                if (re == rs) {
                    break;
                }
                matrix[row][cs] = count;
                count++;
            }
            rs++;
            re--;
            cs++;
            ce--;
        }
        return matrix;
    }
}
