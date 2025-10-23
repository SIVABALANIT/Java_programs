import java.util.*;
class Seperate_word{
	public static void main(String []args){
	Scanner cs =new Scanner(System.in);
	String str=cs.nextLine();
	String c="";
	for(int i=0;i<str.length();i++){
	if(str.charAt(i)==' ')
	{System.out.println(c);
	c="";
	}
	else
	c+=str.charAt(i);
	}
	if (!c.isEmpty()) 
            System.out.println(c);
	}
	
}
