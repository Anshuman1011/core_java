package first_program;

public class arithemetic {
    public static void main(String[] args) {
        int a = 23;
        int b = 2;
        System.out.println((float)a/b);    //divide operator.  //value in decimal using float called typecasting
        System.out.println(a%b);    // module operator



      byte s = 123;
      short d = 2224;
      int f = s+d;
      System.out.println(f);   //short and byte alwasy during any operation gets converted to int type


      float n=13.3f;         //in case of float and double , it gets converted to double because of larger data type
      double m = 23432.32;

      double ans = n*m;
      System.out.println(ans);  


         int aa= 23;
         long bb = 23432;
            // between int and long , larger data type is given more precendent which is long 
        long as = aa * bb;
        System.out.println(as);
    }
}
