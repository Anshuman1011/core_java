package sixth_abstract_;

 abstract class shape{         //abstract class
    abstract public void perimeter();
    abstract public void area();
 }

 class circle extends shape{  //child class inheriting shape
     int radius;

     public circle(int r){
        radius =r;
     }
     public void perimeter(){
       System.out.println(Math.PI* radius * radius);
     }
     public void area(){
        System.out.println(2 * Math.PI* radius);
     }

 }

 class rectange extends shape{  //child class inhereting parent class (shape)
     int length;
     int breadth;

     public rectange(int l , int b){
        length = l;
        breadth = b;
     }

      public void perimeter(){
       System.out.println(2 * (length + breadth));
     }
     public void area(){
        System.out.println(length * breadth);
     }
 }

public class $2abstract {
    public static void main(String[] args) {
        shape s = new rectange(2, 2);
        s.perimeter();
        s.area();

        shape s2 = new circle(2);
        s2.area();
        s2.perimeter();
        
    }
}
