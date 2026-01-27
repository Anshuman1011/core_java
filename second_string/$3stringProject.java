package second_string;

public class $3stringProject {
    public static void main(String[] args) {
        //in this code , we have to check if this string has gmail and find the username and domain of it
        String str = "programmer@gmail.com";
        int index = str.indexOf("@");
        System.out.println("username : " + str.substring(0, index));  //username
        System.out.println("domain name : " + str.substring(index , str.length()));  //domain
 
        System.out.println(str.contains("gmail")); // if mail is gmail

    }
}
