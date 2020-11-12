package basic;

class Circle {
    private static String name;

    public void setName(String name){
        //this.name=name;
        Circle.name=name;
    }

    public static void addLog(){
        
        Circle circle=new Circle();
        circle.setName("楕円");
        
        System.out.println(name);
    }
}


public class MixTest {
    public static void main(String[] args){
        Circle.addLog();
    }
}
