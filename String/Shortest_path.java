import java.util.*;
public class Main {
	public static void main(String[] args) {
		String dir = "wneenesenn";
		int x = 0, y = 0;
		for(int i=0;i<dir.length();i++){
			if(dir.charAt(i) == 'n'){
				x++;
			}
			else if(dir.charAt(i) == 's'){
				x--;
			}
			else if(dir.charAt(i) == 'w'){
				y++;
			}
			else if(dir.charAt(i) == 'e'){
				y--;
			}
		}
		System.out.print(Math.sqrt(x*x + y*y) );
	}
}