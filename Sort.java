public class Sort{
	public static void main(String[] args){
	int arr[]={2,3,4,5,6};
	boolean sort=true;
	for(int n=0;n<arr.length-1;n++){
	if(arr[n]>arr[n+1]){
	sort=false;
	break;
	}
	}
	System.out.println(sort);
	}
}
