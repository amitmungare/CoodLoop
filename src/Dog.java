import package1.p1;

public class Dog {

    String name;
    String breed;
    int age;
    String color;

    public Dog(String name, String breed, int age, String color){
        this.name = name;
        this.breed=breed;
        this.age = age;
        this.color = color;
    }

    public String getName(){return name;}
    public String getBreed(){return breed;}
    public int getAge(){return age;}
    public String getColor(){return color;}


    public static void main(String[] args) {

        //object
        Dog sharu = new Dog("sharu", "abc", 10, "white");
        String myDogName = sharu.getName();
//        System.out.println(myDogName);
//        System.out.println(sharu.getBreed());
//        System.out.println(sharu.getAge());
//        System.out.println(sharu.getColor());

        System.out.println("-------------------------------------------");

        Dog tuffy = new Dog("tuffy", "xyz", 2, "pink");
//        System.out.println(tuffy.getName());
//        System.out.println(tuffy.getBreed());
//        System.out.println(tuffy.getAge());
//        System.out.println(tuffy.getColor());

        p1 p1count = new p1();
        System.out.println(p1count.publicCount);

    }

}
