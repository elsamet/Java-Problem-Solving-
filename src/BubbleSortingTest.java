
public class BubbleSortingTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		int a[]={1,5,7,3,2};
		int N= a.length;
		
		BubbleSorting bubbleSorting=new BubbleSorting();
		int[] out=bubbleSorting.sortArray(a, N);
		
		for (int i = 0; i < out.length; i++) {
			System.out.print("\t"+out[i]);
			
		}

	}

}
