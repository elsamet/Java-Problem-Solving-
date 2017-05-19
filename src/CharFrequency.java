import java.util.HashMap;
import java.util.Map;


public class CharFrequency {
	
	 public void printFreq(char[] str) {
	    Map<Character, Integer> freq = new HashMap<>();
	    for (int i = 0; i < str.length; i++) {
	        if (freq.containsKey(str[i])) {
	            freq.put(str[i], freq.get(str[i]) + 1);
	        } else {
	            freq.put(str[i], 1);
	        }
	    }
	    for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
	        System.out.println("[" + (char)(entry.getKey()) + "] = " + entry.getValue());
	    }
	}

}
