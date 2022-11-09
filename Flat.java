import java.util.*;

class oneBHK{
    private double roomArea;
    private double hallArea;
    public double price;

    oneBHK(){
        roomArea=0;
        hallArea=0;
        price=0;
    }

    oneBHK(double roomArea, double hallArea, double price){
        this.roomArea=roomArea;
        this.hallArea=hallArea;
        this.price=price;
    }

    void show(){
        System.out.println("\nRoom area: "+roomArea+"\nHall area: "+hallArea+"\nprice: "+price);
    }
}

class TwoBHK extends oneBHK{
    private double room2Area;

    TwoBHK(double roomArea, double hallArea, double price, double room2Area){
        super(roomArea, hallArea, price);
        this.room2Area = room2Area;
    }

    void show(){
        super.show();
        System.out.println("Room 2 area: "+room2Area);
    }
}

public class Flat{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        TwoBHK obj1 = new TwoBHK(20,15,25000,25);
        TwoBHK obj2 = new TwoBHK(25,18,30000,30);
        TwoBHK obj3 = new TwoBHK(15,10,10000,15);
        obj1.show();
        obj2.show();
        obj3.show();
        double total=obj1.price+obj2.price+obj3.price;
        System.out.println("Total amount of 3 flats:"+total);
    }
}