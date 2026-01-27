package fourth_corejava;

public class $6variableArgTask {

    public static int max(int ...a){   //maximum no (11,22,55) answer 55
        if(a.length == 0) return Integer.MIN_VALUE;
        int max = 0;
        for(int x : a){
            if(x > max) max = x;
        }
        return max;
    }

    public static int sum (int ...a){     //sum of no
        int sum = 0;  
        for(int x : a){
            sum+=x;
        }
        return sum;
    }
    
    public static double discount (double ...p){       //sum of no first and then checking condition
        if(p.length == 0) return 0;
        double sum  =0;
        for(double x : p){
            sum += x;
        }
        if(sum < 1000){
          return sum * 10/100;
        }
        return sum * 20/100;
    }

    public static void main(String[] args) {
        System.out.println(max(11,22,13,55));
        System.out.println(max());

        System.out.println(sum(10,20,30,40));
        System.out.println(sum());

        System.out.println(discount(100));
    }
}
