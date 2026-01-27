package fifth_class_object;

class car{
    private int car_no;
    private int car_name;

   public void setcar_no(int n){
    if(n > 0) car_no = n;
    else car_no =0;
   }

   public int getcar_no(){
    return car_no;
   }

}

public class $2encapsulation {
    public static void main(String[] args) {
        
        car c1 = new car();
        
        c1.setcar_no(13);
        System.out.println(c1.getcar_no());
    }
}
