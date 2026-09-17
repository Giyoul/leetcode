class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> verticalSet;
        Set<Character> horizontalSet;
        Set<Character> squareSet;

        for(int i = 0; i < 9; i++) {
            verticalSet = new HashSet<>();
            horizontalSet = new HashSet<>();

            for(int j = 0; j < 9; j++) {
                if(verticalSet.contains(board[i][j]) || horizontalSet.contains(board[j][i])){
                    return false;
                }
                if(board[i][j] != '.'){
                    verticalSet.add(board[i][j]);
                }
                if(board[j][i] != '.'){
                    horizontalSet.add(board[j][i]);
                }                
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                squareSet = new HashSet<>();

                for (int row = i * 3; row < i * 3 + 3; row++) {
                    for (int col = j * 3; col < j * 3 + 3; col++) {
                        char val = board[row][col];
                        if (val != '.') {
                            if (squareSet.contains(val)) return false;
                            squareSet.add(val);
                        }
                    }
                }
            }
        }

        return true;
    }
}