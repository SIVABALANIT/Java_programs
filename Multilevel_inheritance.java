class A{
    void siva(){
        System.out.println("hello Sivabalan");
    }
}
class B extends A{
    int Bala(){
        System.out.println("it is the B classs");
        return 0;
    }
}
class My extends B{
    void Learn(){
        System.out.println("it is learner class");
        //return true;
    }
}

public class Multilevel_inheritance {
    public static void main(String[] balan){
        My obj=new My();
        obj.siva();
        obj.Bala();
        obj.Learn();
    }
    
}
