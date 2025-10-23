public class Sortarr{
	public static void main(String[] siva){
		int arr[]={2,45,6,4,8,3};
		for(int i=0;i<7;i++){
		   for(int j=0;j<arr.length-1;j++){
		   if(arr[j]>arr[j+1]){
		   int temp=arr[j];
		   arr[j]=arr[j+1];
		   arr[j+1]=temp;
		  }
		   }
		}
		for(int z=0;z<arr.length;z++)
		   System.out.println(arr[z]);
	}
}
