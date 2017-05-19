import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class DuplicationRemoval {
	
	   public Integer[] removeDuplicates(int[] nums) {
	        Map<Integer, Integer> map =new HashMap<Integer,Integer>();
	        for (int i=0;i<nums.length;i++){
	            if(!map.containsKey(nums[i])){
	                 map.put(nums[i],0);
	            }
	           
	        }
	       Set<Integer> keys= map.keySet();
	      Integer[]outArray= keys.toArray(new Integer[keys.size()]);
	       
	     return outArray;
	        
	    }

}
