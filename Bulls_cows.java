//The cows and bulls game, Player A chooses a word and player B guesses a word. You say bulls when a character in the player 
//B's guess match with a character in player A's word and also it is in the corect position as in A's word. 
//You say cows, when a character in the player B's word match the character in player A, but it is not in the correct position.
//The characters are case insensitive. Given two words player A's and player B's,Write a function that 
//return the number of bulls and no of cows. For example, 
//A - Picture B- Epic, bulls -0, cows - 4 
//A - forum B - four, bulls - 3 cows - 1

public class Bulls_cows {
	public static void main(String[] args){
		 String str1="forum";
		 String str2="FOUR";
		 bulls_cows(str1,str2);
		}

		public static void bulls_cows(String str1, String str2){
		int len;
		int cows=0, bulls=0;
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if(str1.length()<str2.length()){
		  len=str1.length();
		}
		else
		{
		len=str2.length();
		}

		for(int i=0;i<len;i++){
		 if(str1.charAt(i)==str2.charAt(i)){
		   bulls++;
		 }
		 else{
		   cows++;
		 }
		}
		
		System.out.print("Bulls: " + bulls);
		System.out.print("\nCows :" + cows);

		}

}
