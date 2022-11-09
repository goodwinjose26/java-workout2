class Medicine{
    void displayLabel() {

        System.out.println("Company:Lab induss Ltd");
        System.out.println("Address:Kanjikode");
    }
}
class Tablet extends Medicine {
    void displayLabel() {
        super.displayLabel();
        System.out.println("store in a cool dry place");
    }
}
class Syrup extends Medicine{

    void displayLabel(){
        super.displayLabel();

        System.out.println("store protected fom sunlight");
    }
}
class ointment extends Medicine{
    @Override
    void displayLabel() {
        super.displayLabel();
        System.out.println("for external use only");
    }
}
public class TestMedicine {
    public static void main(String[] args) {
        Medicine m[] = new Medicine[10];
        int min=1;
        int max=3;
        double i=Math.random()*(max-min+1)+min;
        int j=(int)i;
        System.out.println(j);
        switch (j){
            case 1: m[0] = new Medicine();
                m[1] = new Tablet();
                m[0].displayLabel();
                m[1].displayLabel();
                break;
            case 2: m[2] = new Medicine();
                m[3] = new Syrup();
                m[2].displayLabel();
                m[3].displayLabel();
                break;
            case 3: m[4] = new Medicine();
                m[5] = new ointment();
                m[4].displayLabel();
                m[5].displayLabel();
                break;
            default: System.out.println("Invalid Choice");
        }
    }
}
