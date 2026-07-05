public class Main {
	public static void main(String[] args) {
		int fac = rec(5,1);
		System.out.println(fac);
	}
	public static int rec(int n, int mul){
		if(n == 0){
			return mul;
		}
		mul *= n;
		return rec(n-1, mul);
	}
}