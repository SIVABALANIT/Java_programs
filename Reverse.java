public class Reverse{
	public static void main(String[] args){
	int oddcount=0;
	int evencount=0;
	int arr[]={1,2,3,4,5};
	int s=arr.length;
	int oddsum=0;
	int evensum=0;
	for(int i=0;i<s;i++){
	   if(arr[i]%2==0){
	     evensum+=arr[i];
	     evencount++;
	     }
	   else{
	   oddcount++;
	   oddsum+=arr[i];
	  }
	}
	  System.out.println("oddcount:" +oddcount);
	  System.out.println("oddsum:"+oddsum);
	  System.out.println("evensum:"+evensum);
	  System.out.println("evencount:" +evencount);
	}
}
