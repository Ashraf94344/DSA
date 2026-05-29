public class Main {
	public static void main(String[] args) {
		int arr1 [] = {2,4,6,8,10,12};
		for(int i=0;i<arr1.length;i++){
			for(int j=i;j<arr1.length;j++){
				for(int k=i;k<=j;k++){
					System.out.print(arr1[k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}