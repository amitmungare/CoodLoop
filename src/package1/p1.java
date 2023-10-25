package package1;

import java.util.ArrayList;

public class p1 {

    static int count = 100;
    private static int privateCount=200;

    protected static int protectedCount = 300;

    public static int publicCount = 400;

    public static String myName(){
        return "amit";
    }

    public static void main(String[] args) {

        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);

        ArrayList<Integer> b=a;

        a.add(4);
        b.add(5);
        System.out.println(a);
        System.out.println(b);

//        System.out.println(count);
//        System.out.println(privateCount);
//        System.out.println(publicCount);
    }
}
