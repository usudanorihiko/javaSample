package basic;

class Oya3 {
    String getName(){
        return "親";
    }
}

class Ko3 extends Oya3 {
    @Override //アノテーション(任意)
    String getName(){
        return "子";
    }
}

public class OverRideTest {

    public static void main(String[] args){
        Ko3 ko3 = new Ko3();
        System.out.println(ko3.getName());    
    }
}
