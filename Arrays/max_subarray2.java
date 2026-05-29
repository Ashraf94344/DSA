//prefix

public class Main {
	public static void main(String[] args) {
		int arr1 [] = {2,4,-3,6,-1,-4,8,12};
		int cur_sum = 0;
		int max_sum = Integer.MIN_VALUE;
		int prefix[]= new int[arr1.length];
		
		prefix[0] = arr1[0];
		for(int i=1;i<prefix.length;i++){
			prefix[i] = prefix[i-1] + arr1[i];
		}
		
		for(int i=0;i<arr1.length;i++){
			int start = i;
			for(int j=i;j<arr1.length;j++){
				int end = j;
				cur_sum = start == 0? prefix[end] : prefix[end] - prefix[start-1];
				if(cur_sum>max_sum){
						max_sum = cur_sum;
				}
			}				
		}
		System.out.println(max_sum);
	}
}