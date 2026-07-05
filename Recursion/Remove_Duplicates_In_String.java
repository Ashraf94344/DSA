public class Main {
	
	public static void remDupChar(String str,int idx,StringBuilder sb, boolean arr[]){
		if(idx == str.length()){
			System.out.print(sb);
			return;
		}
		char curChar = str.charAt(idx);
		if(arr[curChar - 'a'] == true){
			remDupChar(str,idx+1,sb,arr);
		}
		else{
			arr[curChar - 'a'] = true;
			remDupChar(str,idx+1,sb.append(curChar),arr);
		}
	}
	public static void main(String[] args) {
		String str = "apnacollege";
		remDupChar(str, 0, new StringBuilder(""), new boolean [26]);
	}
}