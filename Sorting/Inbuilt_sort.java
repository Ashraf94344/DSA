import java.util.Arrays;
import java.util.Collections;
public class Main {
	public static void main(String[] args) {
		int arr[] = {5,3,4,1,2};
		Arrays.sort(arr,0,3);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
		System.out.println();
		Integer[] arr1 = {5, 2, 8, 1, 9};
		Arrays.sort(arr1, 0, 3, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
		System.out.println();
		
		System.out.println();
	}
}