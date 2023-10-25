public class Main {

    static int f=10;

    static void myMethod(String fname) {

        System.out.println(f);
        System.out.println(fname + " Refsnes");
    }




    public static void main(String[] args) {

        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");
        System.out.println(f);

        int a =16;
        int b=20;
        int c=40;

        add(a,b); //calling a method
        add(a,c);

        int d = add(2,5,8);
        System.out.println("d= "+d);

        print("Yogita");
        print();

        String w = print("amit", "raju");
        System.out.println(print("yogita", "rani"));
        System.out.println(w);
        System.out.println(a);
    }

    private static String print(String a, String b) {
        String s = a +" and "+b+" are going to school";
        return s;
    }

    public static int add(int p, int q, int r){
        int a = p+q+r;
        int f=10;

        return a;
    }

    public static void print(){
        System.out.println(f);
        System.out.println("hey");
    }

    public static void print(String s){
        System.out.println("hello "+s);
    }
    public static void print(String s, String r, int k){
        System.out.println("hello "+s);
    }

    public static void add(int x, int y){
        int z=x+y;
        System.out.println("x+y= "+ z);
    }

}