public class Main {
	public static void main(String[] args) {
		int sum = 0;
		fib(0,1,sum,1,10);
	}
	static void fib(int first, int second, int sum, int n, int lim){
		if(n>lim){
			return;
		}
		sum = first + second;
		System.out.print(first + " ");
		n++;
		fib(second,sum,sum,n,lim);
	}
}