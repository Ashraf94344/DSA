public class Main {
	public static void main(String[] args) {
		//Get ith bit
		int n = 7;
		int i = 0;
		int bitMask = 1<<i;
		if((n & bitMask) == 1){
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		//set ith bit
		int setBit = 1<<i;
		System.out.println(n | setBit);
		
		//clear ith bit
		int clearBit = 1<<i;
		int not = ~clearBit;
		System.out.println(n & not);
		
		//clear last ith bit
		int lastIthBit = (~0)<<i;
		System.out.println(n & lastIthBit);
		
	}
}