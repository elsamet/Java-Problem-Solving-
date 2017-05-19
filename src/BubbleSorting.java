
public class BubbleSorting {
	/**
	 * @param a input array
	 * @param N input array length
	 * @return sorted array in ascending order
	 */
	
	//Time Complexity :O(n^2)
	
	public int[] sortArray(int a[],int N){
		
		for(int i=0;i<N;i++)
			for(int j=0;j<N-i-1;j++)
				if( a[j] > a[j+1])
			       swap(a,j,j+1);
		
		return a;
		
	}
	
	/**
	 * @param a input integer array
	 * @param leftIndex  
	 * @param rightIndex
	 */
	public void swap(int a[],int leftIndex,int rightIndex){
		int temp=a[leftIndex];
		a[leftIndex]=a[rightIndex];
		a[rightIndex]=temp;
	}

}
