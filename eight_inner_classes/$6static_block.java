package eight_inner_classes;

class caar{
    static long price;
    static{
        price = 500000;
        System.out.println("price initialized");
    }
}

public class $6static_block {

    static {     //whichever class load first , its static block would execture first  
        System.out.println("block inside filename class"); //here order would be class $6static_block , then class caar , then sout message hi
    }
    public static void main(String[] args) {
        caar cc =new caar();
        System.out.println("hello");
    }
}
