public class Main
{
	public static void main(String[] args) {
	    
		int arr[]={1,2,3,4,5,6,7,8};
		int len=arr.length;
		for(int i=0;i<len/2;i++){
		    int temp=arr[i];
		    arr[i]=arr[len-1-i];
		    arr[len-1-i]=temp;
		}
		for(int i=0;i<len;i++){
		    System.out.print(arr[i]+" ");
		}
		
	}
}
