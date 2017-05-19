import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class CountingDuplicates {


//
//	 public static int duplicateCount(String text) {
//		int duplicatesCount=0;
//		 char[] a=text.toLowerCase().toCharArray();
//		 HashMap<Character,Integer>map=new HashMap<Character, Integer>();
//		
//		 for(int i=0;i<a.length;i++)
//			 if(map.containsKey(a[i]))
//				 map.replace(a[i], map.get(a[i])+1);
//			 else
//				 map.put(a[i], 1);
//		 
//		  // Get a set of the entries
//	      Set set = map.entrySet();
//	      
//	      // Get an iterator
//	      Iterator i = set.iterator();
//	      
//	      // Display elements
//	      while(i.hasNext()) {
//	         Map.Entry<Character, Integer> me = (Map.Entry)i.next();
//	        if(me.getValue()>1) duplicatesCount++;
//	         
//	      }
//		 
//		  return duplicatesCount;
//		  }
//	 
	 
	 //another solution
	public static int duplicateCount(String text) {
		int counter=0;
		text=text.toLowerCase();
		while(text.length()>0){
			String firstChar=text.substring(0,1);
			text=text.substring(1);
			if(text.contains(firstChar)) counter++;
			text=text.replace(firstChar, "");
		}
		return counter;
		
	}

}
