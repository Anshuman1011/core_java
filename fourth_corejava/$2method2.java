package fourth_corejava;

public class $2method2 {

    // public static void update(int[]arr , int idx , int val){
    //     arr[idx] = val;
    // }

    public static void update2(String s){
          s = s + "yyyy";
    }
    public static void main(String[] args) {     //how objects(Array , string) are passed
        // int[]arr = {1,2,3,4,5};
        // update(arr , 0, 125);
        // System.out.println(arr[0]);

        String name = "victor";
        update2(name);
        System.out.println(name);
    }
}
