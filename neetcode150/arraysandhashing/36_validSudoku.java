
class Solution {
    public boolean isValidSudoku(char[][] board) {
/*for unique values always use hashsets...
  We create a hashset data structure, we loop through the char board...
  if the val is not ',' and that value is not already a value in its row, column and box, we continue. if the value is already in the row,box or column, we return false.
  We use the hashsets boolean value of seen.add() to not only use the operation, but to return false if its value in the parameters already in it.


*/

        HashSet<String> seen = new HashSet();

        for(int i=0;i<9;i++) {
            for(int j=0; j<9;j++) {
                char val = board[i][j];
                if(current_val != '.') {
                    if(!seen.add(val + " found in row " + i) ||
                            !seen.add(val + " found in column " + j) ||
                            !seen.add(val + " found in subbox " +  i/3 + "-" + j/3))return false;;
                }

            }
        }
        return true;









    }
}