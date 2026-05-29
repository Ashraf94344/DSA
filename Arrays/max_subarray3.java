//kadans algorithms

public class Main {
	public static void main(String[] args) {
		int arr[] = {-3,-4,2,5,-1,3,6,-7,8,10};
		int cur_sum = 0;
		int max_sum = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			cur_sum = cur_sum + arr[i];
			if(cur_sum < 0){
				cur_sum = 0;
			}
			if(cur_sum > max_sum){
				max_sum = cur_sum;
			}
		}
		System.out.print(max_sum);
	}
}