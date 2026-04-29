package fifth_class_object;
class parent{
    public parent(){
        System.out.println("parent class");
    }
}
class child extends parent{
    public child(){
        System.out.println("child class");
    }
}
 class grandchild extends child {
  public grandchild(){
    System.out.println("grandchild class");
  } 
}

public class $9inheritence {
    public static void main(String[] args) {
        grandchild gc = new grandchild();
    }
}
