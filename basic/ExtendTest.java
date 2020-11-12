package basic;

class Oya {
    String getOyaName(){
        return "親";
    }
}

class Ko extends Oya {
    String getKoName(){
        return "子";
    }
}

public class ExtendTest {
    public static void main(String[] args){
        Ko child = new Ko();
        System.out.println(child.getOyaName());
        System.out.println(child.getKoName());
    }
}