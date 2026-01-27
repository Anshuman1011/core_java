package second_string;

import java.util.Scanner;

public class $16forLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String answer = "";
        int store = 0;

        while(num != 0){
            store = num % 10;         //first we reverse the number
            answer = answer  + store;
            num = num / 10;
        }
        System.out.println(answer);
         

       
         String str = "";
         char daba =' ';
        for(int i = answer.length()-1;i>=0;i--){
          daba = answer.charAt(i);
          if(daba == '9'){
            str = str + " " + "nine";
          }
          else if(daba == '8'){
              str = str + " " + "eight";
          }
           else if(daba == '7'){
              str = str + " " + "seven";
          }
           else if(daba == '6'){
              str = str + " " + "six";
          }
           else if(daba == '5'){
              str = str + " " + "five";
          }
           else if(daba == '4'){
              str = str + " " + "four";
          }
           else if(daba == '3'){
              str = str + " " + "three";
          }
           else if(daba == '2'){
              str = str + " " + "two";
          }
           else if(daba == '1'){
              str = str + " " + "one";
          }
           else if(daba == '0') 
              str = str + " " + "zero";
          }
          System.out.println(str);
        }
      
    }

