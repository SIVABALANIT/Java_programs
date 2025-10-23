class A{
     void display(int a, int b){
        int c;
        c=a+b;
        System.out.println("return of a"+c);
     }
}
class Good extends A
{
    //we call only constructor to constructor  or method to method /it method to constructor is not possible
    Good(){
        super.display(2,4);
        //super(3,4);
    }
        //void method(){
          //  System.out.println("hello");
  //  }
}
public class Test {
    public static void main(String[] args){
        Good a =new Good();
    
    }
}
