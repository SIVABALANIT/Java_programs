import java.util.Stack;
public class Ds {
	public static void main (String [] args){
		Stack<String> stk=new Stack<>();
		System.out.println(stk.isEmpty());
		System.out.println(stk.capacity());
		stk.push("siva");
		stk.push("bala");
		stk.push("gureu");
		
		System.out.println(stk);
		System.out.println(stk.pop());
		System.out.println(stk);
		 }
}
