package fifth_class_object;

class sub {
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;

    public sub(String subId , String name , int maxMarks , int marksObtain){ //constructor
       this.subID = subId;
       this.name = name;
       this.maxMarks = marksObtain;
       this.marksObtain = marksObtain;
    }

    public String getsubID(){   //way to access private variabel of object via getmthod
        return subID;
    }
     public String name(){
        return name;
    }
     public int maxMarks(){
        return maxMarks;
    }
     public int marksObtain(){
        return marksObtain;
    }

    public String toString(){
        return subID + " " + name + " " + marksObtain;
    }
}

public class $6properties_constructor {
    public static void main(String[] args) {
        sub s[] = new sub[2];
        s[0] = new sub("a1", "rama", 100, 90);
        s[1] = new sub("b1", "shiva", 100, 75);

        for(sub so : s){
            System.out.println(so);
        }
        for(int i = 0;i <s.length;i++){
            System.out.println(s[i]);
        }
    }
}
