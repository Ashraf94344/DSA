import java.util.*;
public class Main {
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int arr[] = {1,5,9,4,1,5,3,4,2,9,1,7,5,3};
		for(int i=0;i<arr.length;i++){
			max = Math.max(max, arr[i]);
			min = Math.min(min,arr[i]);
		}
		
		int count[] = new int[max+1];
		for(int i=0;i<arr.length;i++){
			count[arr[i]]++;
		}
		for(int i = 0; i < count.length; i++){
			if(count[i] > 0){
		      	System.out.println(i + " -> " + count[i]);
		     }
		}
		int n=0;
		for(int i=min;i<max;i++){
			while(count[i]>0){
				arr[n] = i;
				n++;
				count[i]--;
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}
}