class Student{
    private String name;
    private int age;

    // zero or no parameteriz constructor
    public Student() {
        System.out.println("no parameteriz constructor");
    }

    public Student(String name){
        this.name=name;
    }

    public Student(int age){
        this.age=age;
    }

    public Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    void disp(){
        System.out.println(this.name+" "+this.age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    

}

public class ConstructorOlvng {
    public static void main(String[] args) {
        // no parameter constructor
        Student s1=new Student();
        s1.setName("Rahul");
        s1.setAge(24);
        s1.disp();

        // One String Parameter constructor
        Student s2=new Student("Guddu");
        s2.disp();

        // One Integer Parameter constructor
        Student s3=new Student(25);
        s3.disp();

        // Two Parameter Constructor 
        Student s4=new Student("Tony Stark", 30);
        s4.disp();


    }
    
}
