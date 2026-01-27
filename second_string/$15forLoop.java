package second_string;

import java.util.Scanner;

public class $15forLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

     //   --------------------------------------------------     
        //  int store = 0;
        //  String s = "";
        //  while(n != 0)
        // {
        //  store = n %10;               //USING STRING reverse of a no
        //  s = s + store;
        //  n = n/10;
        // }
        // int answer = Integer.parseInt(s);
        //  System.out.println(answer);
    //   --------------------------------------------------
    
    //    int store = 0;
    //    int answer = 0;
    //    while(n != 0)         //using formula reverse of a no
    //    {
    //     store = n % 10;
    //     answer = answer * 10 + store;
    //     n = n / 10;
    //    }
    //    System.out.println(answer);

    //   --------------------------------------------------   

      int store = 0;
      int answer = 0;
      int tempNumbStore = n;
      while(n!= 0){
        store = n % 10;
        answer = answer * 10 + store;
        n = n/10;
      }
      if(answer == tempNumbStore) System.out.println("its a palindrome");
      else System.out.println("not a palindrome");

    //   --------------------------------------------------   

    }
}
