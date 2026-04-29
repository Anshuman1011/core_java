package fifth_class_object;
 class  account {
   private int accno;
   private String name;
   private String address;
   private int phoneNo;
   private String date;
   private int balance;

   public int getaccno(){ //get methods to access these private variables 
    return accno;
   }
   public String getname(){
    return name;
   }
   public String getaddress(){
    return address;
   }
   public int getphoneNo(){
    return phoneNo;
   }
   public String getdate(){
    return date;
   }
   public int getbalance(){
    return balance;
   }

   public void setaddress(String address){ //set methods to change value of these private variable
    this.address = address;
   }
   public void setbalance(int balance){
    this.balance = balance;
   }

   public account(){     //constructors

   }

   public account(int accno , String name , String address , int phoneNo , String date , int balance)
   {
     this.accno = accno;
     this.name = name;
     this.address = address;     //constructor to set values when object is being created
     this.phoneNo = phoneNo;
     this.date = date;
     this.balance = balance;
   }

   public void close(){
    balance = 0;
   }
    
}
 class savingacc extends account
 {
   public void deposit(int deposit){
     setbalance(getbalance() + deposit);
   }
   public void withdraw(int withdraw){
     setbalance(getbalance() - withdraw);
   }
    
 }

 class loanAcc extends account
 {
  public void payemi(int emi){
    setbalance(getbalance() - emi);
  }
 }

public class $8inheritance {
    public static void main(String[] args) {
     account a = new account(123 ,"anshu" , "deep nagr" , 9915680 ,"29 jan ,2026" ,10000);
        // a.close();
        System.out.println(a.getbalance());

        savingacc sv = new savingacc();
        sv.deposit(999);
        System.out.println(sv.getbalance());

        sv.withdraw(998);
        System.out.println("withdraw balace " + sv.getbalance());

        loanAcc la = new loanAcc();
        la.payemi(1);
        System.out.println(la.getbalance());
    }
}
