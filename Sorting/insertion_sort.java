public class Main {
	public static void main(String[] args) {
		int arr[] = {5,3,4,1,2};
		for(int i=1;i<arr.length;i++){
			int prev = i-1;
			int cur = arr[i];
			while(prev >=0 && cur<arr[prev]){
				arr[prev+1] = arr[prev];
				prev--;
			}
			arr[prev + 1] = cur;
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
	}
}