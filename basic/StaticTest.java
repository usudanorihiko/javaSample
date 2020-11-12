package basic;

class Util {
    static int times = 10;

    public static void tenTimes(int count){
        System.out.println(count*times);
    }
}

public class StaticTest {
    public static void main(String[] args){
        Util.tenTimes(3);
    }
    
}
