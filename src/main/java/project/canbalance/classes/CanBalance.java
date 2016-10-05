package project.canbalance.classes;
import java.util.Arrays;

public class CanBalance {
	
	private boolean checkSums(int[] first, int[] last){
		  int sumFirst = 0;
		  int sumLast = 0;
		  
		  for(int i = 0; i < first.length; i++){
		    sumFirst += first[i];
		  }
		  
		  for(int j = 0; j < last.length; j++){
		    sumLast += last[j];
		  }
		  
		  return (sumFirst == sumLast);

	}


	public boolean canBalance(int[] nums) {
	  int lastIndex = nums.length -1;
	  boolean isSameSum = false;

	  for(int i = 0; i < lastIndex; i++){ 
	    isSameSum = checkSums(Arrays.copyOfRange(nums,0,i+1), Arrays.copyOfRange(nums,i+1,lastIndex+1));
	    if (isSameSum)
	      return isSameSum;
	  }
	  return isSameSum;
	}
		
	
}
