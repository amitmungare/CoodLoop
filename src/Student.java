//public class Student {
//    int id;
//    String name;
//    public static void main(String args[]){
//        Student s1=new Student();
//        s1.id = 111;
//        s1.name = "codeLoop";
//        System.out.println(s1.id);
//        System.out.println(s1.name);
//    }
//}


//class Student{
//    int id;
//    String name;
//}
//class TestStudent1 {
//    public static void main(String args[]) {
//        Student s1 = new Student();
//        System.out.println(s1.id);
//        System.out.println(s1.name);
//    }
//}

//class Student{
//    int id;
//    String name;
//}
//class TestStudent2{
//    public static void main(String args[]){
//        //Creating objects
//        Student s1=new Student();
//        Student s2=new Student();
//        //Initializing objects
//        s1.id=101;
//        s1.name="Sonoo";
//        s2.id=102;
//        s2.name="Amit";
//        //Printing data
//        System.out.println(s1.id+" "+s1.name);
//        System.out.println(s2.id+" "+s2.name);
//    }
//}

//class Student{
//    int rollno;
//    String name;
//    void insertRecord(int r, String n){
//        rollno=r;
//        name=n;
//    }
//    void displayInformation(){System.out.println(rollno+" "+name);}
//}
//class TestStudent4{
//    public static void main(String args[]){
//        Student s1=new Student();
//        Student s2=new Student();
//        s1.insertRecord(111,"Karan");
//        s2.insertRecord(222,"Aryan");
//        s1.displayInformation();
//        s2.displayInformation();
//    }
//}

class Student{

//    //user defined method
//    public static void findEvenOdd(int num) {
//    //method body
//        if(num%2==0) System.out.println(num+" is even");
//        else System.out.println(num+" is odd");
//    }

//    public static void main (String args[]) {
//        int num=10;
//        findEvenOdd(num);
//    }

//    public static void main(String[] args) {
//        show();
//    }
//    static void show() {
//        System.out.println("It is an example of static method.");
//    }

//        Student(int i){  //default constructor
//            System.out.println("student id= "+i);
//        }
//        public static void main(String args[]){
//            Student b=new Student(10);
//        }


    int id;
    String name;
    int age;
    //creating two arg constructor
    Student(int i,String n){
        id = i;
        name = n;
    }
    //creating three arg constructor
    Student(int i,String n,int a){
        id = i;
        name = n;
        age=a;
    }
    void display(){System.out.println(id+" "+name+" "+age);}

    public static void main(String args[]){
        Student s1 = new Student(111,"Karan");
        Student s2 = new Student(222,"Aryan",25);
        s1.display();
        s2.display();
    }


}