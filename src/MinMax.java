
public class MinMax {

	   public static int[] minMax(int[] arr) {
	       int min=0,max=0;
	       int sortedArr[] = sortArray(arr);
	       min=sortedArr[0];
	       max=sortedArr[sortedArr.length-1];
		   return new int []{min,max};
	    }
	   
	   public static int [] sortArray(int[] a){
		   int N=a.length;
		   for (int i = 0; i < N; i++) 
			   for (int j = 0; j < N-i-1; j++) 
				   if(a[j]>a[j+1])
					   swap(a,j,j+1);
	
		   return a;
	   }
	   
	   public static void swap(int a[],int lVal,int rVal){
		    int temp=a[lVal];
		    a[lVal]=a[rVal];
		    a[rVal]=temp;
	   }

}
