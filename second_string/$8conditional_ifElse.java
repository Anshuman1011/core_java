package second_string;

import java.util.Scanner;

public class $8conditional_ifElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);     
        System.out.println("enter the address");
         String str = sc.nextLine();


         int index = str.lastIndexOf(".");
         String ext = str.substring(index+1, str.length());
         if(ext.equals("com"))
         {
            System.out.println("commercial");
         }
        else if(ext.equals("network"))
         {
            System.out.println("network");
         }
         else
         {
            System.out.println("organization");
         }
         

         int index2 = str.indexOf(":");
         String protocol = str.substring(0,index2);
          if(protocol.equals("http"))
         {
            System.out.println("hypertext tranfer protocol ");
         }
         else if(protocol.equals("ftp"))
         {
            System.out.println("file transfer protocol");
         }

 



        //  ------------------------------------------------------------------------
        // IF-ELSE

        // System.out.println("enter the num");
        // int num = sc.nextInt();

        
        // if(num == 1) 
        // { 
        //     System.out.println("Monday");
        // }

        // else if(num ==2) 
        // { 
        //     System.out.println("tuesday");
        // } 
        // else if(num ==3)  
        // { 
        //     System.out.println("wednesday");
        // } 
        // else if(num ==4) 
        // { 
        //     System.out.println("thursday");
        // } 
        // else if(num == 5)
        // { 
        //     System.out.println("friday");
        // } 
        // else if(num ==6) 
        // { 
        //     System.out.println("saturday");
        // } 
        // else if(num == 7)
        // { 
        //     System.out.println("sunday");
        // } 
        // else{
        //     System.out.println("");
        // }

    }
}
