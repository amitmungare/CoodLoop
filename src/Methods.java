public class Methods {

    public static void main(String[] args) {
//        add(10,12,54);

        System.out.println("Pre defined max "+ Math.max(10,20));

        System.out.println("user defined max "+ max(40,20));
        System.out.println("user defined max1 "+ max(200,20));

    }

    public static int max(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }

    public static void addTwoNumbers12(int a, int b){
        System.out.println("add 2 -> "+a+b);
    }
//    public static void add(int a, String b){
//        System.out.println("add string -> "+a + b);
//    }
//
//    public static void add(int a, int b, int d){
//        int c = a+b+d;
//        System.out.println("add 3 -> "+c);
//    }
}
