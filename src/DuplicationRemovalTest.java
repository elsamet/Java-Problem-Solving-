
public class DuplicationRemovalTest {

	public static void main(String[] args) {
		DuplicationRemoval removal=new DuplicationRemoval();
		int nums[]={1,1,3,3,3,4,3,4};
		
		
		Integer []array=removal.removeDuplicates(nums);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
