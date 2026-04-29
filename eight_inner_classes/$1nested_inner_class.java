package eight_inner_classes;

class outer{
    int x = 20;

    class inner{
        int y = 10;
        public void innerdisplay(){
            System.out.println(x);
            System.out.println(y);
        }
    }

    public void outerdisplay(){
        inner i = new inner();
        i.innerdisplay();
        System.out.println(i.y);
    }

}

public class $1nested_inner_class {
    public static void main(String[] args) {
        outer o = new outer();
        o.outerdisplay();

        outer.inner oi = new outer().new inner();
        oi.innerdisplay();
    }
}
