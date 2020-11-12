package basic;

class Oya2 {
    String miyoji;
    String namae;

    Oya2(String miyoji){ //コンストラクタ
        this.miyoji=miyoji;
    }

    void setOyaNamae(String name){
        this.namae = name;
    }
}

class Ko2 extends Oya2 {
    
    Ko2(String name){
        super(name); //親コンストラクタの呼び出し
    }

    public void setKoNamae(String name){
        super.setOyaNamae(name);// 親メソッドの呼び出し
    }
}

public class ExtendSuperTest {
    public static void main(String[] args){

        Ko2 ko2=new Ko2("山田");
        System.out.println(ko2.miyoji);
        
        ko2.setKoNamae("太郎");
        System.out.println(ko2.namae);
    }
}
