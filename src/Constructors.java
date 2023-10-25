public class Constructors {

    static int a;
    public Constructors(){
        a=10;
        System.out.println("i am a Constructors");
    }

    public Constructors(String name, int age){
        System.out.println(name+" "+age);
    }

    public static void print(){

        System.out.println("i am a method");
    }
    public static void main(String[] args) {
//        Constructors con = new Constructors();
//        System.out.println(con.a);


        Constructors con = new Constructors("amit", 20);

    }

}
