
public class tic_tac_score2 {
	public static void main(String[] args){
		char[][] mat={{'r','r','r','b','b'},{'b','b','b','r','b'},

		{'r','b','r','r','b'},{'b','r','r','r','b'},{'b','b','r','b','r'}};

		System.out.println("Red Count: " + count(mat,mat.length,'r'));
		System.out.println("Red Count: " + count(mat,mat.length,'b'));
		}

		public static int count(char[][] mat,int n, char p){
		int count=0;
		// Traverse row by row and check to see if there are three consecutive 

		//pieces with the same colour. 
		//left-right
		for(int i=0;i<n;i++){
		   for(int j=0;j<n-2;j++) { //as we are checking for three consecutive 		

			 //order we should not mention as n in for columns
			if(mat[i][j]==p&&mat[i][j+1]==p&&mat[i][j+2]==p){
				count++;
			}
		   }	
		}

		//top-bottom
		for(int i=0;i<n-2;i++){
		   for(int j=0;j<n;j++) { //as we are checking for three consecutive 		

			 //order we should not mention as n in for rows
			if(mat[i][j]==p&&mat[i+1][j]==p&&mat[i+2][j]==p){
				count++;
			}
		   }	
		}

		//Diagnol top-bottom
		for(int i=0;i<n-2;i++){
		   for(int j=0;j<n-2;j++) { //as we are checking for three consecutive 		

			 //order we should not mention as n in for rows and columns
			if(mat[i][j]==p&&mat[i+1][j+1]==p&&mat[i+2][j+2]==p){
				count++;
			}
		   }	
		}

		//top-bottom
		for(int i=n-1;i>1;i--){
		   for(int j=0;j<n-2;j++) { 
			if(mat[i][j]==p&&mat[i-1][j+1]==p&&mat[i-2][j+2]==p){
				count++;
			}
		   }	
		}

		return count;
		}
}
