package seventh_interfaces;

interface member{        //interface
    void callback();
}
class customer implements member{     //child class implementing interface 
    String name;
    customer(String n){
        name = n;
    }  
    public void callback() {
        System.out.println("ok i have read message : " + name);
    }
}

class store{
    member []mem = new member[100];    //array data type interface
    int cnt = 0;
    void register(member m){
     mem[cnt++] = m;
    }
    void invitesale(){
        for(int i=0;i<cnt;i++){
            mem[i].callback();
        }
    }
}
public class $3callback_method {
    public static void main(String[] args) {
        store s = new store();
        customer c1 = new customer("john");
        customer c2 = new customer("bella");
        s.register(c1);
        s.register(c2);
        s.invitesale();
    }
}
