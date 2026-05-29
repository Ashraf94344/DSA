import java.util.*;

public class Main {
	public static void main(String[] args) {
		int price[] = {7,1,5,3,6,4};
		int buy = Integer.MAX_VALUE;
		int sell = 0;
		int profit = 0;
		int max_profit = 0;
		for(int i=0;i<price.length;i++){
			if(price[i]<buy){
				buy = price[i];
			}
			else{
				profit = price[i] - buy;
				max_profit = Math.max(max_profit,profit);
			}
		}
		System.out.print(max_profit);
	}
}