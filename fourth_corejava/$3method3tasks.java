package fourth_corejava;

import java.util.Scanner;

public class $3method3tasks {
    public static boolean checkprime(int primeno){   // method to check if number is prime or not
        if(primeno < 2){
            return false;
        }
        for(int i = 2; i * i <= primeno ;i++){
            if(primeno % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int gcd (int a , int b){        //method to check gretest coomon divisor ed 15 and 35 answer = 5
       while(a !=  b){
        if(a > b){
            a = a-b;
        }
        else{
            b = b -a;
        }
       }
       return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no to check for prime ");
        int primeno = sc.nextInt();
        boolean ifprime = checkprime(primeno);
        System.out.println(ifprime);



        System.out.println(gcd(12 , 4));
    }
}
