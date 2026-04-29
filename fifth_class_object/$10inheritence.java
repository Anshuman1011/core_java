package fifth_class_object;

class parentt{
    public parentt(){
        System.out.println("non param parent");
    }
    public parentt(int x){
        System.out.println("param parent : " + x);
    }
}

class childd extends parentt{
    public childd(){
        System.out.println("non param of child");
    }
    public childd(int y){
        System.out.println("param of child : " + y);
    }
    public childd(int a , int y){
        super(a);
        System.out.println("2 param of child : " + y);
    }
}

public class $10inheritence {
    public static void main(String[] args) { //calling param constructor of parent class using super keyword
        childd c = new childd(10 , 20);  //with help of child class constructor by calling via it

    }
}
