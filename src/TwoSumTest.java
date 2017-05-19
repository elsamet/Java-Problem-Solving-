
public class TwoSumTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TwoSum twoSum=new TwoSum();
		int[]nums=new int[]{3,5,4,10,11};
		int target=7;
		
			int array[]= twoSum.findSumIndecies(nums, target);
			 
			 for (int i=0;i<array.length;i++)
				 System.out.println(array[i]);
			
	}

}
