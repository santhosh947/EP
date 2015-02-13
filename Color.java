//Colorful Number: 
//A number can be broken into different sub-sequence parts. Suppose, a number 3245 can be broken into parts like 3 2 4 5 32 24 45 324 245. 
//And this number is a colorful number, since product of every digit of a sub-sequence are different. 
//That is, 3 2 4 5 (3*2)=6 (2*4)=8 (4*5)=20 (3*2*4)= 24 (2*4*5)= 40 
//But 326 is not a colorful number as it generates 3 2 6 (3*2)=6 (2*6)=12. 
//You have to write a function that tells if the given number is a colorful number or not.


import java.util.ArrayList;


public class Color {

	public static void main(String[] args) {
		System.out.print(isColorful(1) + "\n");
		System.out.println("\n" + isColorful(3245) +"\n");
		System.out.println("\n"+ isColorful(326)+"\n");
		System.out.print("\n"+ isColorful(3456789)+"\n"); 
	}

	private static boolean isColorful(int i) {
		int num=String.valueOf(i).length();
		int[] digits=new int[num];
		digits=Convert_to_digits(i);
		if(digits.length ==0){
			return false;
		}
		if (digits.length ==1){
			return false;
		}
		ArrayList<Integer> Prod = new ArrayList<Integer>();
		for(int k=0;k<digits.length;k++){
			if(digits[k] ==0 || digits[k]==1){
				return false;
			}
			if(Prod.contains(digits[k])){
				return false;
			}
			Prod.add(digits[k]); 	
			System.out.print(digits[k]);
		}
		int temp=1;
		
		for (int s=0;s<digits.length-1;s++){
			temp=digits[s];
			for(int t=s+1;t<digits.length;t++){
				temp=digits[t]*temp;
				if(Prod.contains(temp)){
					return false;
				}
				Prod.add(temp);
			}
		}
		
		return true;
	}

	public static int[] Convert_to_digits(int i){
		int num=String.valueOf(i).length();
		int[] digits=new int[num];
		int index=num-1;
		while(i>0){
			digits[index] = i%10;
			i=i/10;
				index-=1;
		}		
		return digits;
	}
}
