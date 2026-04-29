package eight_inner_classes;

abstract class mmy{
    public abstract void show();
}

class otr{
   public void display(){
    mmy m=new mmy() {
        public void show(){
            System.out.println("abstract method overriden");
        }
    };
        m.show();
    }
   }


public class $3annonymous_inner_class {
    public static void main(String[] args) {
        otr o = new otr();
        o.display();

        
    }
}
