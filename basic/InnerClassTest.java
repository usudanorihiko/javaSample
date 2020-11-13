package basic;

class Outer{
    Outer(){
        System.out.println("OuterClass");
    }
    
    class MemberInner { //クラスのメンバーとして定義されたメンバーインナークラス
        void Print(){
            System.out.println("MemberInner");
        }
    }

    void main(){

        class LocalInner { //メソッド内で定義されたローカルインナークラス
            void Print(){
                System.out.println("LocalInner");
            }
        }

        LocalInner localInner = new LocalInner(); //メソッド内から呼び出しする
        localInner.Print();
    }


}

public class InnerClassTest {
    public static void main(String[] args){
        Outer outer = new Outer();
        Outer.MemberInner memberinner= outer.new MemberInner(); //メンバーインナークラスの呼び出しはチョイ複雑
        memberinner.Print();

        outer.main();
    }

}
