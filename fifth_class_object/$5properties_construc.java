package fifth_class_object;

class product{
    private String itemno;
    private String name;
    private int price;
    private int qty;

    public String getitemno(){ // get methods  --> propety methods
        return itemno;
    }
       public String getname(){
        return name;
    }
       public int getprice(){
        return price;
    }
       public int getqty(){
        return qty;
    }

    public void setprice(int p){  //set methods. --> propetym methods
        price = p;
    }
     public void setqty(int q){
        qty = q;
    }

    public product(String i){    //constructors called automatically when object created
      itemno = i;
    }

    public product(String i , String n){
      itemno = i;
      name = n;
    }

    public product(String i , String n ,int p ,int q){
      itemno = i;
      name = n;
      price =p;
      qty = q;
    }
}

public class $5properties_construc {
    public static void main(String[] args) {

    product p1 = new product("a1");
    System.out.println(p1.getitemno());

     product p2 = new product("b1" , "rama");
     System.out.println(p2.getitemno());
      System.out.println(p2.getname());

     product p3 = new product("c1" , "shiva" , 1000 , 9);
     System.out.println(p3.getitemno());
      System.out.println(p3.getname());
       System.out.println(p3.getprice());
      System.out.println(p3.getqty());
        
    }
}
