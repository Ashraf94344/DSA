public class Main {
	public static int pow(int n, int number){
		if(n ==0){
			return 1;
		}
		int mul = pow(n/2, number);
		int mulSqr = mul * mul;
		if(n %2 != 0){
			mulSqr = mulSqr * number;
		}
		return mulSqr;
	}
	public static void main(String[] args) {
		System.out.println(pow(10,2));
	}
}