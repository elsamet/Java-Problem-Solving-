


public class GapCounter {

	public int solution(int N) {
	    
	       String binary=getBinary(N);
	       
	       char[] values=binary.toCharArray();
	       int tempLength=0;
	       int max=0;
	       for(int i=0;i<values.length;i++){
	    	   if(values[i]=='0'){
	    		   tempLength++;
	    	   }else{
	    		   tempLength=0;
	    	   }
	    	   if(tempLength>max)
	    		   max=tempLength;
	       }
	return max;
	        
	    }
	    
	    public String getBinary(int N){
	        StringBuffer sbuf=new StringBuffer();
	        int reminder=0;
	        while(N>0){
	            reminder=N%2;
	            sbuf.append(reminder);
	            N=N/2;
	    }
	    return sbuf.reverse().toString();
	    
	}
}
