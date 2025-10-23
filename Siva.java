public class Siva{
public static void main(String[] args){
int a =5;
//int c =a<<2;
//int d =a>>2;
int abs=(a^(a>>31))-(a>>31);
//System.out.println(c);
System.out.println(abs);
}
}
