class Demo{
    int a;
    int b;

    public Demo(int a, int b) {
        this.a=a;
        this.b=b;
    }

}

public class DemoConstructor {
    public static void main(String[] args) {
        Demo d1=new Demo(3, 5);
        System.out.println(d1.a+" "+d1.b);
    }
}
