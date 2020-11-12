package basic;

interface ifA {
    String getNameA();
}

interface ifB {
    default String getNameB(){ //defautを付けるとオーバーライド不要
        return "ifA-B";
    };
}

class Ko6 implements ifA,ifB {
    public String getNameA() { //実装したA/B双方のオーバーライドが必要
        return "A";
    }

    public String getNameB(){ //publicにする必要がある
        return "B";
    }
}

class Ko7 implements ifA,ifB {
    public String getNameA() { //defaultが付いているgetNameBはオーバーライド不要
        return "A";
    }
}



public class InterfaceSample {
    public static void main (String[] args){
        
        Ko6 ko6 = new Ko6();
        System.out.println(ko6.getNameA());
        System.out.println(ko6.getNameB());

        Ko7 ko7 = new Ko7();
        System.out.println(ko6.getNameA());
        System.out.println(ko6.getNameB());       

    }
}
