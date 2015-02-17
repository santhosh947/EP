import java.util.ArrayList;


class cord{
	public int row;
	public int col;
	
	cord(int row,int col){
		this.row=row;
		this.col=col;
		
	}
}
public class word_search {

	public static void main(String[] args){
		//char[][] mat={{'e','p','i','c','b'},{'a','e','d','i','c'},{'f','p','e','p','g'},{'c','i','p','e','h'},{'i','c','j','k','l'}};
		char[][] mat={{'e','a','e','a','a','a'},{'a','p','p','c','a','a'},{'a','a','i','a','a','e'},
				{'a','p','c','c','p','a'},{'e','a','a','i','a','a'},{'a','a','c','a','a','a'}};
		count(mat,mat.length,"epic");
		count(mat,mat.length,"cipe");
		
		}

	public static void count(char[][] mat,int n, String p){
		int count=0;
		int index=0;
		boolean flag=false;
		ArrayList<cord> word_cor=new ArrayList<cord>();
		if(p.length()<=mat.length){
			//left-right
			for(int i=0;i<n;i++){
				   for(int j=0;j<n-p.length()+1;j++) { 		
					   
					if(mat[i][j]==p.charAt(index)){
						index++;
						word_cor.add(new cord(i,j));
						for(int k=j+1;k<j+p.length();k++){
							if(mat[i][k]==p.charAt(index)){
								word_cor.add(new cord(i,k));
								index++;
							}
							else{
								word_cor.clear();
								break;
							}						
						}
						
					}
					else
					{
						word_cor.clear();
					}
					if(word_cor.size()==p.length()){
						System.out.print("\nLeft-Right are: \n" );
						for(int a=0;a<word_cor.size();a++){
							System.out.print("[" + word_cor.get(a).row + "," + word_cor.get(a).col + "] ");
						}
					}
					index=0;
				   }	
				}
			index=0;
			//top-bottom
			for(int i=0;i<n-p.length()+1;i++){
				   for(int j=0;j<n;j++) { 		
					   
					if(mat[i][j]==p.charAt(index)){
						index++;
						word_cor.add(new cord(i,j));
						for(int k=i+1;k<i+p.length();k++){
							if(mat[k][j]==p.charAt(index)){
								word_cor.add(new cord(k,j));
								index++;
							}
							else{
								word_cor.clear();
								break;
							}						
						}
						
					}
					else
					{
						word_cor.clear();
					}
					if(word_cor.size()==p.length()){
						System.out.print("\nTop to bottom: \n" );
						for(int a=0;a<word_cor.size();a++){
							System.out.print("[" + word_cor.get(a).row + "," + word_cor.get(a).col + "] ");
						}
					}
					index=0;
				   }	
				}
			
			index=0;
			//Diagnol
			for(int i=0;i<n-p.length()+1;i++){
				   for(int j=0;j<n-p.length()+1;j++) { 		
					   
					if(mat[i][j]==p.charAt(index)){
						index++;
						word_cor.add(new cord(i,j));
						for(int k=i+1,m=j+1;k<i+p.length() && m<j+p.length();k++,m++){
							if(mat[k][m]==p.charAt(index)){
								word_cor.add(new cord(k,m));
								index++;
							}
							else{
								word_cor.clear();
								break;
							}						
						}
						
					}
					else
					{
						word_cor.clear();
					}
					if(word_cor.size()==p.length()){
						System.out.print("\nDiagnol are: \n" );
						for(int a=0;a<word_cor.size();a++){
							System.out.print("[" + word_cor.get(a).row + "," + word_cor.get(a).col + "] ");
						}
					}
					index=0;
				   }	
				}
			
			
			index=0;
			//Diagnol bottom to top
			for(int i=n-1;i>p.length()-2;i--){
				   for(int j=0;j<n-p.length()+1;j++) { 		
					   
					if(mat[i][j]==p.charAt(index)){
						index++;
						word_cor.add(new cord(i,j));
						for(int k=i-1,m=j+1;k>i-p.length() && m<j+p.length();k--,m++){
							if(mat[k][m]==p.charAt(index)){
								word_cor.add(new cord(k,m));
								index++;
							}
							else{
								word_cor.clear();
								break;
							}						
						}
						
					}
					else
					{
						word_cor.clear();
					}
					if(word_cor.size()==p.length()){
						System.out.print("\nDiagnol botton-top are: \n" );
						for(int a=0;a<word_cor.size();a++){
							System.out.print("[" + word_cor.get(a).row + "," + word_cor.get(a).col + "] ");
						}
					}
					index=0;
				   }	
				}
			
		}
		
		}
}
