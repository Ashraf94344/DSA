import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word;
		word = sc.next();
		int n = 0;
		for(int i=0;i<word.length();i++){
			if(word.charAt(i) == word.charAt(word.length() -1 -i)){
				n = 1;
			} else {
				n = 0;
				break;
			}
		}
		if (n == 1){
			System.out.print("Palindrome");
		}
		else{
			System.out.print("Not a Palindrome");
		}
	}
}