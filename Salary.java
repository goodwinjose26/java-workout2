

import java.util.*;
 class Faculty{
    int facultyid;
    float salary;
}
class FulltimeFaculty extends Faculty{
    float basic;
    float allowence;

    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter full time faculty id:");
        facultyid=sc.nextInt();
        System.out.println("enter full time faculty basic:");
        basic=sc.nextFloat();
        System.out.println("enter full time faculty allowance:");
        allowence=sc.nextFloat();

    }

    float salaryF(){
        float salary1;
        salary1=(basic+allowence);
        return salary1;
    }

    void dispalyf(){
System.out.println("full time faculty");
System.out.println("id:"+facultyid+"\n basic:"+basic+"\nallowance:"+allowence);
        System.out.println("full time salary:"+salaryF());
    }
}
class ParttimeFaculty extends Faculty{
    int hour;
    float rate;
    void readp()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter part time faculty id:");
        facultyid=sc.nextInt();
        System.out.println("enter part time faculty hour:");
        hour=sc.nextInt();
        System.out.println("enter part time faculty rate:");
        rate=sc.nextFloat();

    }
    float salaryP(){
        float salary2;
        salary2=(hour*rate);
        return salary2;
    }
    void displayp()
    {
        System.out.println("part time faculty");
        System.out.println("id:"+facultyid+"\n hour:"+hour+"\nrate:"+rate);
        System.out.println("part time salary:"+salaryP());
    }
}

public class Salary {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        FulltimeFaculty f1=new FulltimeFaculty();
        FulltimeFaculty f2=new FulltimeFaculty();
        ParttimeFaculty p1=new ParttimeFaculty();
        ParttimeFaculty p2=new ParttimeFaculty();
        f1.read();
        f2.read();
        p1.readp();
        p2.readp();
        f1.dispalyf();
        f2.dispalyf();
        p2.displayp();
        p2.displayp();
    }
}