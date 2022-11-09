public class NoInstance {
    public static int count=0;
    NoInstance () {
        count++;
    }
    void show(){
        System.out.println("Active object:"+this);
    }
    public static void main(String[] args) throws InterruptedException
    {
        NoInstance t1,t2,t3;
        t1=new NoInstance();
        t2=new NoInstance();
        t3=new NoInstance();
        int a,d,c=count;
        System.out.println("Number of instances created:"+count);
        t1.show();
        t2.show();
        t3=t1;
        System.gc();
        Runtime.getRuntime().gc();
        a=count;
        System.out.println("Number of instances active:"+count);
        d=c-a;
        System.out.println("Number of instances destroyed:"+d);
    }

    @Override
    protected void finalize() throws Throwable {
//        super.finalize();
        count--;
//        System.out.println("garbage collector called");
        System.out.println("garbage collector called "+this);

    }
}
