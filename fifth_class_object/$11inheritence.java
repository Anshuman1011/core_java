package fifth_class_object;

class rectan{
    int length;
    int breadth;
    int x =1000;
     
    public rectan(int length , int breadth){
        this.length = length;
        this.breadth = breadth;
    }
}

class cub extends rectan{
    int height;
    int x =2000;
     
    cub(int l , int b , int height){
        super(l, b);
        this.height = height;
    }

    public void display(){
        System.out.println(super.x);
        System.out.println(this.x);
    }
}

public class $11inheritence {
    public static void main(String[] args) {

        cub c = new cub(10, 20, 30);
        c.display();
        System.out.println(c.length);

        
    }
}
