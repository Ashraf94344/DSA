public class Main {
	public static void main(String[] args) {
		int arr[] = {2,4,6,8,10,12};
		int start = 0, end = arr.length-1;
		int key = 8;
		int mid = 0;
		while(start<=end){
			mid = (start + end)/2;
			if(arr[mid] == key){
				System.out.print(mid + "th number ");
				break;
			}
			else if(arr[mid] < key){
				start = mid+1;
			}
			else{
				end = mid-1;
			}
		}
	}
}