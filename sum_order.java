
public class sum_order {

	public static void main(String[] args){
		//print_num(5500,5560);
		print_num(110,113);
	}
	
	public static void print_num(int low,int high){
		if(low<high){
			for(int i=low;i<high;i++){
				if(match_format(i)){
					System.out.print(i + "\n");
				}
			}
		}
	}
	
	
	public static boolean match_format(int num){
		String str= Integer.toString(num);
		int temp=0;
	
		for(int i=0;i<str.length();i++){
			temp=temp^str.charAt(i);
			if(temp==0){
				return get_num(i,num);
			}
		}
		return false;
	}
	
	public static boolean get_num(int i, int num){
		int[] arr={0,0};
		String str= Integer.toString(num);
		StringBuilder str1=new StringBuilder();
		StringBuilder str2=new StringBuilder();
		StringBuilder op=new StringBuilder();
		
		int sum=0;
		int temp=0;
		for(int k=0;k<((i+1)/2);k++){
			//System.out.print(str.charAt(k));
			str1.append(Character.toString(str.charAt(k)));
		}
		for(int k=((i+1)/2);k<str.length();k++){
			//System.out.print(str.charAt(k));
			str2.append(Character.toString(str.charAt(k)));
		}
		
		if(!str1.equals(str2)){
			return false;
		}
		arr[0]=Integer.parseInt(str1.toString());
		arr[1]=Integer.parseInt(str1.toString());
		sum=arr[0]+arr[1];
		for(int k=0;k<Integer.toString(sum).length();k++){
			temp=temp^ (Integer.toString(sum).charAt(k));
			//temp=temp^ sum;
					
		}
		
		for(int j=i+1;j<str.length();j++){
			temp=temp^(str.charAt(j));
			if(temp==0){
				return true;
			}
		}
		return false;
	}
}
