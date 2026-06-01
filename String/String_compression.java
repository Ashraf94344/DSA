public class Main {
	public static void main(String[] args) {
		String str = "aaaabbbccccdde";
		StringBuilder sb = new StringBuilder("");
		for(int i = 0;i<str.length();i++){
			int n = 1;
			while(i < str.length()-1  && str.charAt(i) == str.charAt(i+1)){
				n++;
				i++;
			}
			sb.append(str.charAt(i) + Integer.toString(n));
		}
		System.out.print(sb.toString());
	}
}