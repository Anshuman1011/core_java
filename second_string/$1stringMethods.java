package second_string;

public class $1stringMethods {
    public static void main(String[] args) {
        String s = " hello worlds ";
        System.out.println(s.length());       //trim and length function
        System.out.println(s.trim().length());

        s = s.replace('l','k' );    //replace characters
        System.out.println(s); 

        System.out.println(s.substring(4));          //print from start index
        System.out.println(s.substring(0, 9));   //print from st index and till last index
    }
}
