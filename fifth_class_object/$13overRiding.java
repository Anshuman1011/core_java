package fifth_class_object;
class tv{
    public void switchOn(){System.out.println("tv switched on");}
    public void switchoff(){System.out.println("tv swithced off");}
}
class smartTv extends tv{
    public void switchOn(){System.out.println("smarttv switched on");}
    public void switchoff(){System.out.println("smarttv swithced off");}
    public void browsing(){System.out.println("browsing on smart tv");}
}

public class $13overRiding {
    public static void main(String[] args) {
        tv t = new tv();
        t.switchOn();
        t.switchoff();

        smartTv st = new smartTv();
        st.switchOn();
        st.switchoff();
        st.browsing();

        tv tt = new smartTv();
        tt.switchOn();
        tt.switchoff();
        // tt.browsing();
    }
}
