package second_string;

public class $4stringProject {
   public static void main(String[] args) {
    
        String s = "what the hell is going on here";  //counting the no of gaps in a string
        int count = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == ' ') count++;
        }
        System.out.println(count);

        String s2 = " hell loo  ";   //trim the spaces in a string
        System.out.println(s2);
        System.out.println(s2.trim());
        System.out.println(s2.replaceAll("\\s", ""));

        String s3 = "a!b$c*5#sa@n";
        System.out.println(s3.replaceAll("[^ a-zA-Z0-9]" , ""));

   } 
}
