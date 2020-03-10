
/*
Interview Question #2:

Construct an algorithm to check whether two words (or phrases) are anagrams or not!

"An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once"

*/

import java.util.*;  
public class Main
{
	public static void main(String[] args) {
	
	String[] s1 = {"a","b","c","d"};
	String[] s2 = {"c","b","a","d"};
	    
	HashMap<String,Integer> hm = new HashMap<String,Integer>();
	
	if(s1.length!=s2.length){
	        System.out.println("It is Not An Anagram !");
	        return;
	    }
	    
	for(String s : s1){
	    if(hm.get(s)==null){
	        hm.put(s,1);
	    }
	    else{
	        hm.put(s,hm.get(s)+1);
	    }
	}
	
	for(String s : s2){
	    if(hm.get(s)==null || hm.get(s)<=0){
	        System.out.println("It is Not An Anagram !");
	    }
	    else{
	        hm.put(s,hm.get(s)-1);
	    }
	}
	System.out.println("It is An Anagram !");
	
	
		
	}
}
