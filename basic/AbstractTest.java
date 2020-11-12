package basic;

abstract class Ab{ //abstract をつけることで、抽象クラスとなり、インスタンス化できない
    abstract String getName(); //abstractをつけたメソッドが必要

    void setName(){
        //adbsractをつけないメソッドも大丈夫。オーバーライド不要
        
    }
}

class Ko5 extends Ab {
    String getName(){ //abstractされているメソッドはオーバーライドする必要がある
        return "子供5号";
    }
}


public class AbstractTest {
    
}
