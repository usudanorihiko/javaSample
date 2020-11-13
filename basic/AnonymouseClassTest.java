package basic;
//参考　Javaの匿名クラスの考え方について - Qiita https://qiita.com/mk777/items/2cc9edee56dc5b733ee9

interface Foo {　// 匿名クラスを利用するには、クラスかI/Fの継承が必要
    void methodA();
}

public class AnonymouseClassTest {
    public static void main(String[] args){
        
        //匿名クラス　インスタンス変数代入パターン
        Foo foo = new Foo() { // Foo(); ではなく　Foo(){...}; であることが特徴
            public void methodA(){ 
                System.out.println("methodA-1");
            }
        }; //;を忘れがち

        foo.methodA();

        //匿名クラス 代入不要パターン
        new Foo() {
            public void methodA(){
                System.out.println("methodA-2");
            }
        }.methodA(); //書き方注意
    }
}
