package fifth_class_object;
class carr{
    public void start(){System.out.println("car started");}
    public void acc(){System.out.println("car acc");}
    public void changegear(){System.out.println("gear changed");}
}

class luxurycar extends carr{
    public void changegear(){System.out.println("automatic gear changed");}
    public void openroof(){System.out.println("roof opened");}
}

public class $14overRiding {
    public static void main(String[] args) {
        carr c = new carr();
        c.start();
        c.acc();
        c.changegear();

        luxurycar lc = new luxurycar();
        lc.start();
        lc.acc();
        lc.changegear();
        lc.openroof();
        
    }
}
