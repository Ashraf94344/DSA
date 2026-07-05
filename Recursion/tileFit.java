public class Main {
	public static int tile(int n){
		if(n == 0 || n ==1){
			return 1;
		}
		int vart = tile(n-1);
		int hori = tile(n-2);
		int total = vart + hori;
		return total;
	}
	public static void main(String[] args) {
		System.out.print(tile(7));
	}
}