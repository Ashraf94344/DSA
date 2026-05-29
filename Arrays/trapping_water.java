import java.util.*;

public class Main {
	public static void main(String[] args) {
		int hight[] = {4,2,0,6,3,2,5};
		int n = hight.length;
		int vol = 0;
		
		int left_arr[] = new int[n];
		left_arr[0] = hight[0];
		for(int i=1;i<n;i++){
			left_arr[i] = Math.max(hight[i], left_arr[i-1]);
		}
		
		int right_arr[] = new int[n];
		right_arr[n-1] = hight[n-1] ;
		for(int i=n-2;i>=0;i--){
			right_arr[i] = Math.max(hight[i], right_arr[i+1]);
		}
		
		for(int i=0;i<n;i++){
			int min_len = Math.min(left_arr[i], right_arr[i]);
			int contain = min_len - hight[i];
			vol +=contain;
		}
		System.out.print(vol);
	}
}