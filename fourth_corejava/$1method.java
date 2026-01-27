package fourth_corejava;

public class $1method {
    public static int maxNo(int a , int b){
        if(a > b){
            return a;
        }
        else {
            return b;
        }            //creating a method and calling it simple 
    }
    public static void main(String[] args) {
        int a = 10 , b = 20, c;
        c = maxNo(a , b);
        System.out.println(c);
    }
}
 



// package fourth_corejava;

// public class method {
//     public  int maxNo(int a , int b){
//         if(a > b){
//             return a;              //creating a method without static , so need to create object
//         }                         // for method class as method is inside method class
//         else {                    // and then calling it
//             return b;         //CREATING A OBJECT OF THE CLASS AND THEN CALLING THAT METHOD
//         }
//     }
//     public static void main(String[] args) {
//         int a = 10 , b = 20, c;
//        method mp = new method();
//        System.out.println(mp.maxNo(a, b));
//     }
// }
