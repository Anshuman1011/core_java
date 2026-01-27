package fifth_class_object;

class cylind{
    private double radius;
    private double height;

    public void setradius(int r){          //get set method for radius
       radius = r;
    }
    public double getradius(){
        return radius;
    }
    
    public void setheight(int h){     ///get set method for height 
       height = h;
    }
    public double getheight(){
        return height;
    }
 
    public cylind(){         //constructors here non-parametrized constructor , parametrized constructor
        radius =1;
        height =1;
    }

     public cylind(int r){
        radius =r;
        height =1;
    }

     public cylind(int r , int h){
        radius =r;
        height =h;
    }

    public double area(){           // method creating for class cylind
        return 2 * Math.PI * radius * height;
    }

}

public class $4properties_constructor {
    public static void main(String[] args) {
        cylind c1 = new cylind();
        System.out.println(c1.area());

        cylind c2 = new cylind(10);
        System.out.println(c2.area());

        cylind c3 = new cylind(10 , 10);  // till here inserting value via constructors
        System.out.println(c3.area());

        cylind c4 = new cylind();    //inserting value via set methods as variable are private
        c4.setheight(10);
        c4.setradius(10);
        System.out.println(c4.area());

    }
}
