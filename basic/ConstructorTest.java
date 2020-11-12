package basic;

class Seimei {
    String name;

    public Seimei(){ //オーバーロード
        this.name="山田太郎";
    }
    public Seimei(String name){ //オーバーロード
        this.name= name;
    }
    public Seimei(int num){ //型違いで別コンストラクタ呼び出し
        this.name= "数字太郎";
    }
}

public class ConstructorTest {
    public static void main(String[] args){
        Seimei seimei = new Seimei();
        System.out.println(seimei.name);
    }
}