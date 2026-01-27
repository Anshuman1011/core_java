package fifth_class_object;

 class circle    
   {
        public double radius;

        public double area(){
          return Math.PI * radius * radius;
        }
        public  double perimeter(){
            return 2 * Math.PI * radius;
        }
        public double circumference(){
            return perimeter();
        }
    }

    class rectangle
    {
        public double length;
        public double breadth;

        public double area (){
            return length * breadth;
        }
        public double perimeter(){
            return 2 * (length + breadth);
        }
        public boolean isSquare(){
            return length == breadth;
        }
    }
    
    class cylinder
    {
        public double radius;
        public double height;

        public double lidarea(){
          return Math.PI * radius * radius;
        }
        public double totalsurfacearea(){
            return 2 * lidarea() + circumference() * height;
        }
          public double circumference(){
            return 2 * Math.PI * radius;
        }
        public double volume(){
            return lidarea() * height;
        }

    }

    class student 
    {
        public int rollno;
        public String name;
        public String course;
        int m1 , m2 , m3;

        public int total(){
            return m1 + m2 + m3;
        }
        public int average(){
            return total() / 3;
        }
        public char grade(){
           if(average() > 60) return 'A';
           return 'B';
        }
        public String details(){
            return "roll no " + rollno + "\n" + "name " + name +  "\n" + "course " + course +"\n";
        }
    }

public class $1class_obj_define {

    public static void main(String[] args) {
        circle c1 = new circle();          //first object  -> class CIRCLE
        c1.radius = 7;
       System.out.println(c1.area());
       System.out.println(c1.perimeter());
       System.out.println(c1.circumference());

       System.out.println("second object values");

       circle c2 = new circle();            //second object -> class CIRCLE
       c2.radius = 10;
       System.out.println(c2.area());
       System.out.println(c2.perimeter());
       System.out.println(c2.circumference());

       System.out.println("first object for rectangle");

       rectangle r1 = new rectangle(); // first object -> RECTANGLE 
       r1.length = 10;
       r1.breadth = 10;
       System.out.println(r1.area());
       System.out.println(r1.perimeter());
       System.out.println(r1.isSquare());

         System.out.println("first object for cylinder");

       cylinder cy = new cylinder();
       cy.radius = 7;
       cy.height = 10;
       System.out.println(cy.lidarea());
        System.out.println(cy.totalsurfacearea());
         System.out.println(cy.circumference());
         System.out.println(cy.volume());


          System.out.println("first object for student");

          student s1 = new student();
          s1.rollno = 1;
          s1.name = "rama";
          s1.course = "cse";
          s1.m1 = 80;
          s1.m2 = 20;
          s1.m3 = 50;

          System.out.println(s1.total());
          System.out.println(s1.average());
          System.out.println(s1.grade());
          System.out.println(s1.details());
    }
}
