package fifth_class_object;

class rectang{
    private double length;
    private double breadth;

    public rectang(){
        length = 10;
        breadth = 10;
    }

    public rectang(double l , double b){
        length = l;
        breadth = b;
    }
    public rectang(double s){
        length = breadth = s;
    }

    public double area (){
        return length * breadth;
    }
}

public class $3constructor {
    public static void main(String[] args) {

        rectang r1 = new rectang();
        System.out.println(r1.area());
    }
}
