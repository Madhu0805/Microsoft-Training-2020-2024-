public class Solution {
public static boolean isValidSudoku(char[][] board) {
		Set<Character>[] setXX = new HashSet[9];
		Set<Character>[] setYY = new HashSet[9];
		Set<Character>[] setXY = new HashSet[9];
		for (int i = 0; i < 9; i++) {
			setXX[i] = new HashSet<>();
			setYY[i] = new HashSet<>();
			setXY[i] = new HashSet<>();
		}
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] == '.') {
					continue;
				}
				if(!setXX[i].add(board[i][j])){
					return false;
				}
				if(!setYY[j].add(board[i][j])){
					return false;
				}
				if(!setXY[(j / 3)* 3 + i / 3].add(board[i][j])){
					return false;
				}
			}
		}
		return true;
	}

}
