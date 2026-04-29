

import java.util.*;

import first_program.areaOfTriangle;

public class Acciojob_rhomboid {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int actualLoopPrint = (n*2)-1;
        int upperhalf =n;
 
        int cnt=1;
        int num =1;
        boolean flag = false;
        for(int i=1;i<=upperhalf;i++){
             for(int z=1;z<=upperhalf-i;z++){
                System.out.print(" ");
             }

             int tempstore = num;
             for(int k=1;k<=cnt;k++){
                if(tempstore == 0){
                    flag = true;
                    tempstore =2;
                }
                System.out.print(tempstore);
                if (flag == false)tempstore--;
                if (flag == true) tempstore++;
            }
             num+=1;
            cnt+=2;
            flag = false;
            System.out.println();
        }

        num-=2;
        cnt-=4;
        int lowerhalf = upperhalf +1;
        int biterator =1;
        for(int a=lowerhalf;a<=actualLoopPrint;a++){

            for(int b=1;b<=biterator;b++){
                System.out.print(" ");
            }
             int tempstore = num;
            for(int c=1;c<=cnt;c++){
                 if(tempstore == 0){
                    flag = true;
                    tempstore =2;
                }
                System.out.print(tempstore);
                if (flag == false)tempstore--;
                if (flag == true) tempstore++;
            }
            biterator++;
            num-=1;
            cnt-=2;
            flag = false;
            System.out.println();
        }
    
    }
}