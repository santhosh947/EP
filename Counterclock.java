//Given a NXN matrix, starting from the upper left corner of the matrix start printing values in a counter-clockwise fashion. 
//
//Eg: Consider N = 4 
//
//Matrix= {a, b, c, d, 
//e, f, g, h, 
//i, j, k, l, 
//m, n, o, p} 
//
//Your function should output: dcbaeimnoplhgfjk 
//
//Another example would be 
//
//C I P E 
//R N K U 
//U O W O 
//L E S Y 
//
//The function should print: EPICRULESYOUKNOW 


public class Counterclock {
	public static void main(String[] args){
		char[][] c={{'C','I','P','E'},{'R','N','K','U'},{'U','O','W','O'},{'L','E','S','Y'}};
		char[][] b={{'1','2'},{'3','4'}};
		char[][] d={{'1','2','3'},{'4','5','6'},{'7','8','9'}};
		
		char[][] a={{'a','b','c','d','e','f'},{'g','h','i','j','k','l'},{'m','n','o','p','q','r'},{'s','t','u','v','w','x'},{'y','z','1','2','3','4'},{'5','6','7','8','9','0'}};
		format(c);
		System.out.print("\n");
		format(b);
		System.out.print("\n");
		format(a);
		System.out.print("\n");
		format(d);
		}

		public static void format(char[][] in){

			int n=in.length;
			boolean col_traversing =true;
			int r=0;
			int c=0;
			int temp=n;
			if(temp%2!=0){
				temp++;
			}
			for(int t=0;t<temp/2;t++){
				for(int i=n-1;i>=c;i--){
					System.out.print(in[r][i]);
				}
				for(int j=r+1;j<n-1;j++){
					System.out.print(in[j][c]);
				}
				for(int k=c;k<n-1;k++){
					System.out.print(in[n-1][k]);
				}
				for(int w=n-1;w>r;w--){
					System.out.print(in[w][n-1]);
				}	
				n=n-1;
				r++;
				c++;
			}
			
			
		}

}
