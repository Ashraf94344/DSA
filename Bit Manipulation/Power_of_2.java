public class Main {
	public static void main(String[] args) {
		int n = 16;
		if((n & (n-1)) == 0){
			System.out.print("power of 2");
		}
		else{
			System.out.print("Nit the power of 2");
		}
	}
}