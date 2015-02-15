
public class Combinations {

	public static void main(String[] args){
		char[] arr={'a','b','c','d'};
		int[] temp={0,0,0,0};
		combination(arr,0,arr.length-1,temp);
	}
	
	public static void combination(char[] arr,int k,int n,int[] temp){
		if(k==n){
		  temp[k]=0;
		  print(arr,temp,n);
		  temp[k]=1;
		  print(arr,temp,n);
		}
		if(k<=n){
			temp[k]=0;
			combination(arr,k+1,n,temp);
			temp[k]=1;
			combination(arr,k+1,n,temp);	
		}		
	}
	
	public static void print(char[] arr, int[] temp,int n){
		int sum=0;
		for(int i=0;i<=n;i++){
			if(temp[i]==1){
				System.out.print(arr[i]);
				sum++;
			}
		}
		System.out.print(" \n");
		if(sum==0){
			System.out.print("NULL SET \n");			
		}
	}
}
