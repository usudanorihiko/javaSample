package basic;

public class ScopeTest{

    String a; // 同一パッケージ内! ※同一クラスではないので注意!  
    private String b; // 同一クラス内
    
    void foge(){
        String c; //fogr(){}内

        if (true){
            String d; //if(){}内
        }
    }

    // アクセス修飾子
    //　public      全て
    //　protected   クラス/パッケージ/サブクラス
    //　指定なし     クラス/パッケージ
    //  private     クラス
    // 
    // 【解決Java】アクセス修飾子(protected、privateなど) | 侍エンジニア塾ブログ（Samurai Blog） - プログラミング入門者向けサイト https://www.sejuku.net/blog/22679
}