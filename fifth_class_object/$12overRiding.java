package fifth_class_object;
class papa{
    public void display(){
        System.out.println("this is p class");
    }
}
class bacha extends papa{
    public void display(){   //method overriding --> parent class method when overriden by child class method with same signature
        System.out.println("this is s class");
    }
}

public class $12overRiding {
    public static void main(String[] args) {
        papa p = new papa();
        p.display();

        bacha b = new bacha();
        b.display();

        papa po = new bacha();  //dynamic method dispatching , parent class ref holding child class obj and on calling overiden method , child class method would be called 
        po.display();
    }
    
}
