package second_string;

public class $2stringMethods {
    public static void main(String[] args) {
        String str = new String("panamajungle");
        str = str.toUpperCase();
        System.out.println(str);     //uppercase conversion 

        String str2 = new String("PARTYHOGIZORDAR");
        str2 = str2.toLowerCase();
        System.out.println(str2);      //lowercase conversion


        String str3 = "www.google.com";
        System.out.println(str3.startsWith("ww"));  //startsWith and endsWith operation
        System.out.println(str3.endsWith("om"));

        String str4 = "whatthefuck";       //character at what index
        System.out.println(str4.charAt(1)); 

        System.out.println(str4.indexOf("t"));  //t starting index , here its 3

        System.out.println(str4.lastIndexOf("t")); //t last index  , here its 4

        for(int i =0;i<str4.length();i++){  // loop help printing all character of string
            System.out.print(str4.charAt(i));
        }

      System.out.println(); //for gap in output

        String str5 = "helloji";
        String str6 = "helloji";    //checks the content of both string 
        System.out.println(str5.equals(str6));

        String str7 = "HELLOJI";  //also check the content of both string ignoring case senitive
        System.out.println(str6.equalsIgnoreCase(str7));

       String str8 = "cyakrea";
       String str9 ="ayakrea";
       System.out.println("here we are comparing in lexographically order "+str8.compareTo(str9));

       int i = 65;     //converting no to string
       System.out.println(String.valueOf(i));

       String str10 = "i am gonna do some fucking shit rn";
       System.out.println(str10.contains("ffucking"));

    } 
}
