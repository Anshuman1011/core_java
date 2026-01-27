package fourth_corejava;

public class $5variableArg {
    public static void show (int ...a)            //passing var argument
    {
        for(int x : a){
            System.out.println(x);
        }
    }

    public static void nameshow(int number , String ...a){       // passing a number and var argument
        for(int i = 0;i<a.length;i++){
          System.out.println(number + "." + a[i]);
          number+=11;

        }
    }
    public static void main(String[] args) {
        show(2 ,343,23423,11);
        nameshow(11 ,"ram" , "sham" , "mahadev");
    }
}
