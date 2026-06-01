public class Main {
	public static void main(String[] args) {
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int sum = 0;
		int n = arr.length;
		for(int i=0;i<n;i++){
			for(int j=0;j<=n;j++){
				if(i == j){
					sum = sum + arr[i][i];
				}
				if(n-1-i == n-1-j){
					sum = sum + arr[n-1-i][n-1-i];
				}
			}
		}
		System.out.print(sum);
	}
}