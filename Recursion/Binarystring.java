public class Main {
	public static void binString(String str,int n, int lastdigit){
		if(n == 0){
			System.out.println(str);
			return;
		}
		binString(str+"0",n-1,0);
		if(lastdigit == 0){
			binString(str+"1",n-1,1);
		}
	}
	public static void main(String[] args) {
		binString("",3,0);
	}
}