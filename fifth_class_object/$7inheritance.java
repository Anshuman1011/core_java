package fifth_class_object;

 class circlle {
    public double radius;

    public double area(){
      return Math.PI * radius * radius;
    }
    public double perimeter(){
        return 2 * Math.PI*radius;
    }
    public double circumfrence(){
        return perimeter();
    }
    
}
 class  cylindeer extends circle {
   public double height;

   public double volume(){
    return area() * height;
   }
    
}

public class $7inheritance {
    public static void main(String[] args) {
        cylindeer c = new cylindeer();
        c.height = 10;
        c.radius = 10;
        System.out.println(c.volume());
    }
}
