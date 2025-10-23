interface Siva{
	void detail();
}
class Gold implements Siva{
	public void detail()
	{
	System.out.println("hellow");
	}
}
public class Interface{
	public static void main(String[] args){
		Siva obj=new Gold();
		obj.detail();
	}
}
