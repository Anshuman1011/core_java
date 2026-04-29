package sixth_abstract_;

 abstract class parenttt {  //parent abstract(no body) class
 
     public parenttt(){
        System.out.println("this is parent class");
     }

     abstract public void meth1();
}

class studenttt extends parenttt{   //child class inherting parent abstract class

    public studenttt(){
        System.out.println("this is student class contructor");
    }
    public void meth2(){
        System.out.println("this is student class method");
    }

    public void meth1(){  //overriding parent class abstract method 
        System.out.println("we are overiding parent class abstract method");
    }
}

public class $1abstract {
    public static void main(String[] args) {
       studenttt s = new studenttt();
       s.meth1();
        
        
    }
}
