import java.util.*;
public class Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={-1,-1,-10,6,-10};
		
		int max=0,prev_max=0;
		int check_mark = 0;
		boolean  in_negate=false;
		int start_index=0,end_index=0;
		int best_score=0;
		ArrayList output_arr=new ArrayList();
		ArrayList temp_arr=new ArrayList();
		
       for(int i=0;i<arr.length-1;i++){
    	   max+=arr[i];
    	   temp_arr.add(arr[i]);
    	   for(int j=i+1;j<arr.length;j++){
    		   prev_max=max;
    		   max+=arr[j];
    		   if(j!=i+1){
    			   if(max>prev_max && max>best_score){     					
	    				if(in_negate){
	    					for(int t=start_index;t<end_index;t++){
	    	    				   temp_arr.add(arr[t]);
	    	    			   }
	    					temp_arr.add(arr[j]);
	    					start_index=0;
	    					end_index=0;
	    					in_negate=false;
	    				}
	    				else{
	    					temp_arr.add(arr[j]);
	    				}
	    			
    			   }
    			   else{
    				   if(start_index==0 &&end_index==0){
	    					start_index=j;
	    					end_index=j+1;
	    					in_negate=true;
	    				}
	    				else
	    				{
	    					end_index=j;
	    				}
    			   }
    			   if(max>best_score){
    					best_score=max;
    			   }
    			   else if(prev_max>best_score){
    					best_score=prev_max;
    					in_negate=false;
    			   }
    		   }
    		   else{
    		   temp_arr.add(arr[j]);
    		   if(max>best_score){
					best_score=max;
			   }
			   else if(prev_max>best_score){
					best_score=prev_max;
					
			   }
    		   }
    	   }
    	   if(check_mark<best_score){
    		   output_arr=(ArrayList) temp_arr.clone();
    		   check_mark=best_score;
    	   }
    	   temp_arr.clear();
    	   max=0;
    	   
       }
       System.out.print(output_arr);
	}

}
