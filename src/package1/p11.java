package package1;

public class p11 {

    public static void main(String[] args) {
        p1 p1count = new p1();
        System.out.println(p1count.count);
//        System.out.println(p1count.privateCount);
        System.out.println(p1count.protectedCount);
        System.out.println(p1count.publicCount);
    }
}
