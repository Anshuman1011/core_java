package seventh_interfaces;

interface test{
    void met1();
    void met2();
}

class test2 implements test{
   public void met1(){
        System.out.println("Interface Method Overriden");
    }
   public void met2(){
        System.out.println("Interface Method2 Overriden");
    }
    public void met3(){
        System.out.println("this is child class own method");
    }
}

public class $1interface {
    public static void main(String[] args) {
        test t = new test2();
        t.met1();
        t.met2();
    }
}
