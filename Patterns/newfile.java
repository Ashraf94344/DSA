public class Main {
	public static void main(String[] args) {
		int n=5;
		System.out.println("pattern 1");
		for(int i=0;i<=n;i++){
			for(int j=0;j<=n;j++){
				if(j<=i){
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println("pattern 2");	
		for(int i=0;i<=n;i++){
			for(int j=0;j<=n-i;j++){
				System.out.print("*");			
			}
			System.out.println();
		}
		
		System.out.println("pattern 3");	
		for(int i=0;i<=n;i++){
			for(int j=0;j<=n;j++){
				if(i == 0 || i == n || j == 0 || j == n){
					System.out.print("*");
				}
				else{
					System.out.print("  ");	
				}		
			}
			System.out.println();
		}
		
		System.out.println("pattern 4");	
		for(int i=1;i<=n;i++){
			for(int j=n-i;j>0;j--){
				System.out.print(j);			
			}
			System.out.println();
		}
		
		int num = 1;		
		System.out.println("pattern 5");	
		for(int i=0;i<=n;i++){
			for(int j=0;j<=n;j++){
				if(j<=i){
					System.out.print(num + " ");	
					num++;
				}		
			}
			System.out.println();
		}
		
		System.out.println("pattern 6");	
		for(int i=0;i<=n;i++){
			for(int j=0;j<=n;j++){
				if(j<=i){
					if((i+j)%2==0){
						System.out.print(1 +" ");	
					}
					else{
						System.out.print(0 +" ");
					}
				}		
			}
			System.out.println();
		}
		
		int m=8;
		System.out.println("pattern 7");	
		for(int i=0;i<n;i++){
			for(int j=0;j<=m;j++){
				if(j<=i || j>=m-i){
					System.out.print("*");
				}		
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<=m;j++){
				if(j <= (m/2)-i || j >=(m/2)+i ){
					System.out.print("*");
				}		
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("pattern 8");	
		for(int i=0;i<=n;i++){
			for(int j=0;j<=n*2;j++){
				if(j>=n-i && j<=(n*2)-i){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("pattern 9");	
		for(int i=0;i<=n;i++){
			for(int j=0;j<=n*2;j++){
				if(j>=n-i && j<=(n*2)-i){
					if(i == 0 || i == n || j == n-i || j== n*2-i){
						
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("pattern 10");
		int a=4;
		int mid=n/2;
		for(int i=0;i<a;i++){
			for(int j=0;j<=a;j++){
				if(j>=mid-i && j<=mid+i){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=0;i<=a;i++){
			for(int j=0;j<=a;j++){
				if(j>=i && j<=a-i){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

/*
pattern 1
*
**
***
****
*****
******
pattern 2
******
*****
****
***
**
*
pattern 3
******
*        *
*        *
*        *
*        *
******
pattern 4
4321
321
21
1

pattern 5
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18 19 20 21
pattern 6
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
0 1 0 1 0 1
pattern 7
*       *
**     **
***   ***
**** ****
*********
*********
**** ****
***   ***
**     **
*       *
pattern 8
     ******
    ******
   ******
  ******
 ******
******
pattern 9
     ******
    *    *
   *    *
  *    *
 *    *
******
pattern 10
  *
 ***
*****
*****
*****
 ***
  *

*/