/*
Interview Question #4:

Our task is to design an algorithm that is capable of selecting k items from an array! 
The problem is that the n size of the array is unknown (or infinitely large)!

Solution: we can solve this problem with the so-called reservoir sampling algorithm! Check it out!

*/
import java.util.*;  
public class Main
{
    public static int[] generateRandom(int[]arr,int len,int k){
        int i=0;
        int reservoir[]=new int[k];
        for(;i<k;i++){
            reservoir[i]=arr[i];
        }
        Random r = new Random(); 
        int j;
        for(;i<len;i++){
            j=r.nextInt(i+1);
            if(j<k){
                reservoir[j]=arr[i];
            }
           
        }
        return reservoir;
    }
	public static void main(String[] args) {
	  
	  int[] arr ={1,2,3,4,5,6,7,8};
	  int len = arr.length;
	  int k=3;
	  
	  int[] kRandom=generateRandom(arr,len,k);
	  
	  System.out.println(Arrays.toString(kRandom));
	  
    }
}
