package fourth_corejava;

public class $4methodOverloading {

    public static double area(double l , double b){    //area of rectangle
        return l * b;
    }
      public static double area(double r){     //area of trinalge
        return 3.14 * r *r ;
    }
      public static double area(double a , double b , double h){     //area of trapzium
        double area = (1.0/2 * (a+b) * h);
        return area;
    }
    public static void main(String[] args) {
        System.out.println(area(24243L , 241L));
        System.out.println(area(322L));
        System.out.println(area(12L , 12L ,12L));
    }
}
