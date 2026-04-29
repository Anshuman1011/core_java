package seventh_interfaces;

interface testt{
    final static int X =10;
    public abstract void meth1();
    public abstract void meth2();

    public static void meth3(){
        System.out.println("so interface method is having a body now ");
    }

    void meth4();
    public abstract void meth44(); //methods are by default public and abstract

    int A =234;  //identifiers should be in capital and are final , static 
    final static int B = 2342;

    public static void meth9(){ // method can have body if we use static 
      System.out.println("hello");
    }

    default void meth10(){ //default method created to not disturb child classes when later creating method
        System.out.println("yayaa");
    }
}

public class $4interface {
    public static void main(String[] args) {

        System.out.println(testt.X);
        testt.meth3();
        
    }
}
