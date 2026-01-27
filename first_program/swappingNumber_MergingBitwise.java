package first_program;

public class swappingNumber_MergingBitwise {
    public static void main(String[] args) {

         //SWAPPING TWO NUMBERS
        //   byte a = 4;
        //   byte b = 9;                 
        //   a =(byte) (a^b);
        //     b =(byte) (a^b);
        //       a =(byte) (a^b);
        //       System.out.println("value of a is " + a + " and of b is " + b);
// -----------------------------------------------------------------------------------------------------------------
// -----------------------------------------------------------------------------------------------------------------

              //MERGING TWO NUMBERS

         byte a = 9 , b =12;         // merging a and b but left shift b by 4 position so not to mix bits of both number.
             byte c =(byte) (b<<4);
             c = (byte) (a|c);

          System.out.println((c&0b11110000) >> 4);  //here we are right shifting by 4 , so that when print the value it comes 12 only,
                                                    // as if it were in left shift , think some another random value would come
       

          System.out.println(c&0b00001111);

          System.out.println(a | c);         
          
          
          
          
    }
}
