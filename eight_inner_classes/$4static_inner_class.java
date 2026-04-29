package eight_inner_classes;

class outer2{
    static int x = 10;
    int y = 20;

    static class inner {
      static int z = 30;
        public void display(){
            System.out.println(x);
            System.out.println(z);
        }
    }
}

public class $4static_inner_class {
    public static void main(String[] args) {
        outer2.inner i= new outer2.inner();
        i.display();
        
    }
}
