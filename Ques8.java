interface Vehicle{
    void drive();
}

interface ElectricVehicle extends Vehicle{
    void ChargeBattery();
}

class tesla implements Vehicle,ElectricVehicle{
    public void drive(){
        System.out.println("Tesla driving..");
    }
    public void ChargeBattery(){
        System.out.println("Tesla getting charged..");
    }
}
public class Ques8 {
    public static void main(String[] args){
     tesla t = new tesla();
     t.drive();
     t.ChargeBattery();
       }
       
    }

