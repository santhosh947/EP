//Goldbach's conjecture : Every even integer greater than 2 can be expressed as the sum of two primes. 
//Write a function which takes a number as input, verify if is an even number greater than 2 and also print atleast one pair of prime numbers.

import java.awt.List;
import java.io.*;
import java.util.ArrayList;
public class goldbach2 {

	public static void main(String[] args){
		Goldbach(12);
		}

		public static void Goldbach(int num){
			if(num > 2 && num%2==0){
		 	   Print_Prime(num);
			}
			else{
			    System.out.print("\n The given number is not a even number 		greater than 2");
			}
		}

		public static void Print_Prime(int num){
		
			ArrayList<Integer> prime=new ArrayList<Integer>();		
			
			for(int i=1;i<num;i++){
			   if(is_prime(i)){
				prime.add(i);
			    }	  
			}
		
			for(int j=0;j<prime.size()-1;j++){
			    for(int k=j+1;k<prime.size();k++){	
			    	if((prime.get(j) + prime.get(k))==num){
						System.out.println(prime.get(j) + "," + prime.get(k));
					}
			     }
			}
		}

		public static boolean is_prime(int num){
		if(num ==1){
		 return true;
		}
		if(num==2){
			return false;
		}
		for(int i=2;i<num;i++){
		if(num%i==0){
		   return false;
		}
		}
		return true;
		}
}
