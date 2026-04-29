package eight_inner_classes;

class hondacity{
    static long price = 10;      //static variable
    int x ,y;

    static double onRoadPrice(String city){    //static method
   
        switch (city) {
                case "delhi":
                return price * (price * 0.10);

                case "mumbai":
                return price * price * 0.9;
        
                default:
                return price;
        }
    }
}

public class $5static_class {

 
    public static void main(String[] args) {
       System.out.println(hondacity.price); //calling by simply class name 
        System.out.println(hondacity.onRoadPrice("delhi"));

        hondacity hc1 = new hondacity();
        System.out.println(hc1.price);    //calling by creating a object 
        System.out.println(hc1.onRoadPrice("mumbai"));
      
    }
  
}
