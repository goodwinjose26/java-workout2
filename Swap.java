public class Swap {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("call by value");
        System.out.println("Before swapping a:" + x + "\tb:" + y);
        swapfunction(x, y);
        System.out.println("after swapping a=" + x + "\tb=" + y);
        System.out.println("\n");
        change a = new change(10);
        change b = new change(20);
        System.out.println("call by references");
        System.out.println("Before swapping a:" + a.a + "\tb:" + b.a);
        swapfunction2(a, b);
        System.out.println("after swapping a=" + a.a + "\tb=" + b.a);
    }
    public static void swapfunction(int s,int t)
    {
        int z=s;
        s=t;
        t=z;
    }
    public static void swapfunction2(change a,change b)
    {
        change c=new change(a.a);
        a.a=b.a;
        b.a=c.a;
    }

}
class change{
    public int a;
    public change(int a){
        this.a=a;
    }
}
