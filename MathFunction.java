public class MathFunction {
    void multiply(int a,int b)
    {
        int m1=a*b;
        System.out.println("multiplication of integers:"+a+"*"+b+"="+m1);
    }
    void multiply(float a1,float b1)
    {
        float m2=a1*b1;
        System.out.println("multiplication of float number:"+a1+"*"+b1+"="+m2);
    }
    void multiply(int a2,float b2)
    {
        float m3=a2*b2;
        System.out.println("multiplication of float and integer number"+a2+"*"+b2+"="+m3);
    }
public static void main(String args[])
{

    MathFunction ob1=new MathFunction();
    ob1.multiply(10,20);
    MathFunction ob2=new MathFunction();
    ob2.multiply(2.5f,2);
    MathFunction ob3=new MathFunction();
    ob3.multiply(20,2.5f);


}
}
