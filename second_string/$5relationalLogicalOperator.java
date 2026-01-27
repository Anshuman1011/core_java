package second_string;

public class $5relationalLogicalOperator {
    public static void main(String[] args) {
        int a = 4 , b = 8 , c = 12; // >,<, ! these are all relational opeators while && , ! , | are logical opeators
        System.out.println(a<b | a>b); 



        //greatest of three no's
        int x = 10 , y = 15 , z=20;
        if(x> y && x> z)
        {
            System.out.println("x is the greatest");
        }
        else
        {
            if(y>z && y>x)
            {
                System.out.println("y is the greatest");
            }
            else
            {
                System.out.println("z is the greatest");
            }
        }


    }  

}
