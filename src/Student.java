public class Student {
    String name;
    int mathsMarks; //yogitaNarvekar

    int storeNameInThis;

    public Student(String name, int marks){
        this.name = name;
        this.mathsMarks = marks;
    }
    public String getName(){
        return name;
    }
    public int getMarks(){
        return mathsMarks;
    }

    public static void main(String[] args) {
        Student ram = new Student("ram", 98);
        Student sam = new Student("sam", 48);
        Student yogita = new Student("yogita narvekar", 100);
        Student amitMungare = new Student("amit", 99);

        System.out.println("Student with name "+yogita.getName()+" got "+ yogita.getMarks() +" marks");
        System.out.println("Student with name "+amitMungare.getName()+" got "+ amitMungare.getMarks() +" marks");

    }

}
