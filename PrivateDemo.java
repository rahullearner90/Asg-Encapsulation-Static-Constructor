public class PrivateDemo {
    private int balace;

    public int getBalace() {
        return balace;
    }

    public void setBalace(int balace) {
        this.balace = balace;
    }

    public static void main(String[] args) {
        PrivateDemo p1=new PrivateDemo();
        p1.setBalace(5000);
        int a=p1.getBalace();
        System.out.println(a);
    }
}
