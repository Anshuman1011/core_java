package seventh_interfaces;

class phone{
    public void call(){System.out.println("phone cal");}
    public void sms(){System.out.println("sms of phone");}
}

interface Icamera{
    void click();
    void record();
}
interface Imusicplay{
    void play();
    void stop();
}

class smartphone extends phone implements Icamera,Imusicplay{
    public void videocall(){System.out.println("smartphone videocall");}

    public void click(){System.out.println("smartphone clicks");}
    public void record(){System.out.println("smartphone records");}
    
    public void play(){System.out.println("smartphone play");}
    public void stop(){System.out.println("smartphone stop");}
}

public class $2interface {
    public static void main(String[] args) {
        smartphone s = new smartphone();
        s.videocall();
        s.click();
        s.record();
        s.play();
        s.stop();
        

        Icamera c = s;
        c.click();
        c.record();

        Imusicplay mp =s;
        mp.play();
        mp.stop();
     
    }
}
