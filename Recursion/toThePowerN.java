public class Main {
	public static int pow(int number, int n){
		if(n==0){
			return 1;
		}
		int rec = pow(number, n-1);
		int mul = number*rec;
		return mul;
	}
	public static void main(String[] args) {
		System.out.print(pow(2,10));
	}
}