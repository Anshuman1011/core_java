package eight_inner_classes;

class outerrr{

    public void display(){
        class innerrr{
            public void show(){
                System.out.println("hello");
            }
        }

        innerrr i = new innerrr();
        i.show();
    }
}

public class $2local_inner_class {
    public static void main(String[] args) {
        outerrr o = new outerrr();
        o.display();
    }
}
