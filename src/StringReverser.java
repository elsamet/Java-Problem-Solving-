
public class StringReverser {
	
	
//	public String reverseString(String inputStr){
//		String reverseStr="";
//		char[]processingArray=new char[inputStr.length()];
//		char[]reversingArray=new char[inputStr.length()];
//		
//		for (int i = 0; i < inputStr.length(); i++) {
//			processingArray[i]=inputStr.charAt(i);
//		}
//		
//		//System.out.println(processingArray.length);
//		
//		for(int i=0,j=processingArray.length; j>0;  j--){
//			
//			reversingArray[i]=processingArray[j-1];
//			i++;
//			//System.out.println(processingArray[j-1]);
//		}
//		reverseStr=String.valueOf(reversingArray);
//		return reverseStr;
//	}
	
	public String reverseString(String inputString){
		String reversedString="";
		char [] reversedchars = new char[inputString.length()];
		
		for(int i=0;i<inputString.length();i++)
			reversedchars[i]=inputString.charAt(i);
		
		
		for(int i=0,j=reversedchars.length-1;i<reversedchars.length/2;i++,j--){
			swap(reversedchars,i,j);
			
		}
		reversedString=reversedString.valueOf(reversedchars);
		return reversedString;
		
	}
	
	public void swap(char[]reversedChars,int char1Index, int char2Index){
		char temp;
		temp=reversedChars[char1Index];
		reversedChars[char1Index]=reversedChars[char2Index];
		reversedChars[char2Index]=temp;
		
	}

}
