public class Main {
	public static void main(String[] args) {
		int n = 5;
		int bit = 1;
		if((n & bit) == 1){
			System.out.print("odd");
		}else{
			System.out.print("even");
		}
	}
}