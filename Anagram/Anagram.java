package Anagram;
import java.util.Arrays;

public class Anagram {
	public boolean solve(char[] w1, char[] w2) {
	if(w1.length != w2.length)
		return false;
	
	//O(NlogN)
	Arrays.sort(w1);
	Arrays.sort(w2);
	
	//O(N)
	for(int i=0; i<w1.length; i++) {
		if(w1[i] != w2[i])
			return false;
		}
	return true;
	
	}
	//O(NlogN) + O(N) = O(NlogN)

}
