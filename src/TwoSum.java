import java.util.HashMap;
import java.util.Map;


public class TwoSum {
	
/**
 * @author MahmoudRamadan
 */

/**
 * @param nums     input array of integers
 * @param target   the target integer
 * @return indices indices of  two numbers which their sum equal to target 
 */
	//Time complexity : O(n)
	//Space complexity :O(n)
	public int[] findSumIndecies(int[] nums,int target){
		
		//hint: x,target-x sum equals target
		int complement=0;
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++){
			 complement=target-nums[i];
		     if(map.containsKey(complement)){
				 return new int[]{map.get(complement),i};
			 }
				map.put( nums[i],i);
		}
		
		throw  new IllegalArgumentException("no two sum solution") ;
		
	}

		

	
}
