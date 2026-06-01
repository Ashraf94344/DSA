public class Main {
	public static void main(String[] args) {
		int arr[][] = {
		{10,20,30,40},
		{15,25,35,45},
		{27,29,37,48},
		{32,33,39,50}
		};
		int key = 33;
		int row = 0, col = arr[0].length-1;
		while(row<arr.length && col>=0){
			if(key == arr[row][col]){
				System.out.print(row+"th row "+col+"th col");	
				break;
			}
			else if(key < arr[row][col]){
				col--;
			}
			else if(key > arr[row][col]){
				row++;
			}
			else{
				System.out.print("Key not found");
			}
		}
	}
}