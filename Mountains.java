//Given a M * N matrix, if the element in thematrix is larger 
//than other 8 elements who stay around it, then named thatelement be mountain point. Print all the mountain points.

public class Mountains {

	public static void main(String[] args){
		 int[][] mat={{1,2,3,4,5},{2,9,1,6,7},{7,8,2,8,3},{8,9,0,6,1},{1,2,3,4,5}};
		 mountain(mat);
		}

		public static void mountain(int[][] mat){
			int m=5,n=5;
			//int m=mat.length;
			//int n=mat.length;
		//	System.out.print(m + "\n" + n +"\n");
		 for(int r=1;r<m-1;r++){
		  for(int c=1;c<n-1;c++){
		      if((mat[r][c+1]<mat[r][c]) && (mat[r+1][c+1]<mat[r][c]) && (mat[r-1][c+1]<mat[r][c]) && (mat[r][c-1]<mat[r][c]) &&
			 (mat[r-1][c]<mat[r][c]) && (mat[r+1][c]<mat[r][c]) && (mat[r+1][c-1]<mat[r][c]) && (mat[r-1][c-1]<mat[r][c])){
			System.out.print(mat[r][c] +"\n");
			}
		   }
		  }
		}

}
