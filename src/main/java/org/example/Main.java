import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static ArrayList<Vehicle>  allVehicles = new ArrayList<>();
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Vehicles Project it is!");

        Vehicle myVehicle = new Vehicle();
        myVehicle.setOdometer(0);
        myVehicle.setGallonsOfGas(10.0);
        myVehicle.setMilesPerGallon(20);
        allVehicles.add(myVehicle);

        Vehicle yourVehicle = new Vehicle();
        yourVehicle.setOdometer(10000);
        yourVehicle.setGallonsOfGas(8.0);
        yourVehicle.setMilesPerGallon(25);
        allVehicles.add(yourVehicle);

        Vehicle otherVehicle = new Vehicle();
        otherVehicle.setMilesPerGallon(15);
        otherVehicle.setOdometer(20000);
        otherVehicle.setGallonsOfGas(12.0);
        allVehicles.add(otherVehicle);



        //System.out.println("odometer:"+odometer[0]+" gallons of gas:"+gallonsOfGas[0]);
        drive(100);
        drive(60);
    }

    private static void drive(int milesDriven) {
        for (Vehicle vehicle : allVehicles) {
            vehicle.go(milesDriven);
            System.out.println(vehicle +" odometer:" + vehicle.getOdometer() + " gallons of gas:" + vehicle.getGallonsOfGas());
        }
    }

}