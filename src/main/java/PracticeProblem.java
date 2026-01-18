public class PracticeProblem {

	public static void main(String args[]) {


	}
	public static int searchMazemoves(String[][] arr) {
		int curRow = arr.length - 1;
		int curCol = 0;
		int noOfMoves = 0;
		return dfsHelper(arr, curRow, curCol, noOfMoves);
	}

	public static int dfsHelper(String[][] arr, int curRow, int curCol, int noOfMoves) {
		if (curRow < 0 || curCol >= arr[0].length) {
			return Integer.MAX_VALUE;
		}
		if (arr[curRow][curCol].equals("X")) {
			return Integer.MAX_VALUE;
		}
		if (arr[curRow][curCol].equals("F")) {
			return noOfMoves;
		}
		int right = dfsHelper(arr, curRow, curCol + 1, noOfMoves + 1);
		int up = dfsHelper(arr, curRow - 1, curCol, noOfMoves + 1);
		return Math.min(right, up);
	}

	public static int noOfPaths(String[][]arr) {
		int curRow = arr.length - 1;
		int curCol = 0;
		return countHelper(arr, curRow, curCol);
	}

	public static int countHelper(String[][] arr, int curRow, int curCol) {
		if (curRow < 0 || curCol >= arr[0].length) {
			return 0;

		}
		if (arr[curRow][curCol].equals("X")) {
			return 0;
		}
		if (arr[curRow][curCol].equals("F")) {
			return 1;
		}
		int right = countHelper(arr, curRow, curCol + 1);
		int up = countHelper(arr, curRow - 1, curCol);
		return right + up;
	}

	

}
