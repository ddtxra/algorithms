package ddt.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Anagrams {

	public static Set<String> getAnagrams(List<String> words) {
		
		//Does not contain duplicate elements
		Set<String> anagrams = new TreeSet<String>();

		for (String word : words) {
			char content[] = word.toCharArray();
			Arrays.sort(content);
			anagrams.add(new String(content));
		}
		
		for(String anagram : anagrams){
			System.out.println(anagram);
		}
		
		
		return anagrams;
		
	}

}
