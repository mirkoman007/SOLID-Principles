package hr.mzaper.model.worker;

import hr.mzaper.model.train.BigTrain;
import hr.mzaper.model.train.SmallTrain;
import hr.mzaper.model.train.Train;
import hr.mzaper.model.vehicle.*;

import java.util.ArrayList;

public class Worker {
    static final float percentage=0.1f;
    int salary=0;

    public int getSalary() {
        return salary;
    }

    public void parkVehicle(Vehicle vehicle, ArrayList<Train> trains) {

        if(vehicle.getClass().equals(Car.class) || vehicle.getClass().equals(Van.class)){

            for (Train t:trains) {
                if(t.getClass().getName().equals(SmallTrain.class.getName())){
                    if(t.addVehicle(vehicle)==true){
                        System.out.println(vehicle.getClass().getSimpleName()+" successfully parked on the train");
                        salary+=(vehicle.getTicketPrice()*percentage);
                    }else {
                        System.out.println("Error: There is no parking space on the train.");
                    }
                }
            }

        }
        else if(vehicle.getClass().equals(Bus.class) || vehicle.getClass().equals(Truck.class)){
            for (Train t:trains) {
                if(t.getClass().getName().equals(BigTrain.class.getName())){
                    if(t.addVehicle(vehicle)==true){
                        System.out.println(vehicle.getClass().getSimpleName()+" successfully parked on the train");
                        salary+=(vehicle.getTicketPrice()*percentage);
                    }else {
                        System.out.println("Error: There is no parking space on the train.");
                    }
                }
            }

        }


    }
}
