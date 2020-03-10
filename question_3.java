/*
Interview Question #3

The problem is that we want to find duplicates in a T[] one-dimensional array of integers in O(N) running time where the integer values
are smaller than the length of the array!

*/

import java.util.*;  
public class Main
{
	public static void main(String[] args) {
	    
	    int[] arr={1,2,3,2,2,1,3};
	    ArrayList<Integer> res = new ArrayList<Integer>();
	    ArrayList<Integer> al =new ArrayList<Integer>();
	    for(int i : arr){
	        if(al.contains(i)){
	            res.add(i);
	        }
	        else{
	            al.add(i);
	        }
	    }
	    System.out.println(res.toString());
	
    }
}
