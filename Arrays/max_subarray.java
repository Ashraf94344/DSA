//bruttfoece algorithms

public class Main {
	public static void main(String[] args) {
		int arr1 [] = {2,4,-3,6,-1,-4,8,12};
		int cur_sum = 0;
		int max_sum = Integer.MIN_VALUE;
		for(int i=0;i<arr1.length;i++){
			for(int j=i;j<arr1.length;j++){
				cur_sum = 0;
				for(int k=i;k<=j;k++){
					cur_sum += arr1[k];
					if(cur_sum>max_sum){
						max_sum = cur_sum;
					}
				}
			}
		}
		System.out.println(max_sum);
	}
}