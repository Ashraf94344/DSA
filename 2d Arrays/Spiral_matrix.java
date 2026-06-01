public class Main {
	public static void main(String[] args) {
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int col_limit = arr[0].length;
		int row_limit = arr.length;		
		int row_start = 0, row_end = row_limit-1;
		int col_start = 0, col_end = col_limit-1;
		while(row_start<=row_end && col_start <= col_end){
			for(int i=col_start;i<=col_end;i++){
				System.out.print(arr[row_start][i] +" ");
			}
			for(int i=row_start+1;i<=row_end;i++){
				System.out.print(arr[i][col_end]+" ");
			}
			for(int i=col_end-1;i>=col_start;i--){
				if(row_start == row_end){
					break;
				}
				System.out.print(arr[row_end][i]+" ");
			}
			for(int i=row_end-1;i>=row_start+1;i--){
				if(col_start == col_end){
					break;
				}
				System.out.print(arr[i][col_start]+" ");
			}
			col_start++;
			row_start++;
			col_end--;
			row_end--;
		}
	}
}