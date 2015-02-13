//Given a array 
//{{ 4,7,3,6,7}} 
//
//construct a triangle like 
//{{81}} 
//{{40,41}} 
//{{21,19,22}} 
//{{11,10,9,13}} 
//{{ 4,7,3,6,7}}


public class format {

	public static void main(String[] args){
		int [] arr={4,7,3,6,7};
		 format(arr);
		}

		public static void format(int[] arr){
		int[][] mat = new int[arr.length][arr.length];
		int index=arr.length;
		for(int i=0;i<arr.length;i++){
		  for(int j=0;j<arr.length;j++){
		      if(i==0){
			  mat[i][j]=arr[j];
			  //index--;
			}	
			else{
				if(j<=index-1){
					mat[i][j]=mat[i-1][j]+mat[i-1][j+1];
				}
		
			}
		   }
		  index--;
		}

		
		for(int i=arr.length-1;i>=0;i--){
			System.out.print("{{ ");
		   for(int j=0;j<arr.length;j++){
			
			if(mat[i][j]!=0){
				System.out.print(mat[i][j] + " ");
			}
		   }
		System.out.print("}}\n");
		}

		}

}
