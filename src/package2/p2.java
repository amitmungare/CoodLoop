package package2;

import package1.p1;

public class p2 extends p1{

    public static void main(String[] args) {
        p1 p1count = new p1();
//        System.out.println(p1count.count);
        System.out.println(p1count.protectedCount);
        System.out.println(p1count.publicCount);
        System.out.println(p1count.myName());
    }
}
