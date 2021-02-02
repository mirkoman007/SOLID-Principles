package hr.mzaper.model.worker;

import hr.mzaper.model.train.BigTrain;
import hr.mzaper.model.train.SmallTrain;
import hr.mzaper.model.train.Train;
import hr.mzaper.model.vehicle.*;

import java.util.ArrayList;

public abstract class Employee {
    public Employee(float salaryPercentage) {
        this.salaryPercentage = salaryPercentage;
    }

    float salaryPercentage;
    float salary=0;

    public float getSalary() {
        return Math.round(salary * 100.0f) / 100.0f;
    }



    public void parkVehicle(Vehicle vehicle, ArrayList<Train> trains) {

        if(vehicle.getClass().equals(Car.class) || vehicle.getClass().equals(Van.class)){

            for (Train t:trains) {
                if(t.getClass().getName().equals(SmallTrain.class.getName())){
                    if(t.addVehicle(vehicle)){
                        System.out.println(vehicle.getClass().getSimpleName()+" successfully parked on the train");
                        salary+=(vehicle.getTicketPrice()* salaryPercentage);
                    }else {
                        System.out.println("Error: There is no parking space on the train.");
                    }
                }
            }

        }
        else if(vehicle.getClass().equals(Bus.class) || vehicle.getClass().equals(Truck.class)){
            for (Train t:trains) {
                if(t.getClass().getName().equals(BigTrain.class.getName())){
                    if(t.addVehicle(vehicle)){
                        System.out.println(vehicle.getClass().getSimpleName()+" successfully parked on the train");
                        salary+=(vehicle.getTicketPrice()* salaryPercentage);
                    }else {
                        System.out.println("Error: There is no parking space on the train.");
                    }
                }
            }

        }


    }

    public void checkGas(Vehicle v) {

        if(v.getGasPercentage()<10){
            System.out.println("The "+v.getClass().getSimpleName()+" has less than 10% gas");
            System.out.println("Refueling "+v.getClass().getSimpleName()+" in progress....");
            System.out.println(v.getClass().getSimpleName()+" refueled");
            v.refuelGas();
        }
        else
        {
            System.out.println("The "+v.getClass().getSimpleName()+" has "+v.getGasPercentage()+"% gas");
        }
    }

    public void checkBattery(Vehicle v) {
        if(v.getBatteryPercentage()<10){
            System.out.println("The "+v.getClass().getSimpleName()+" has less than 10% battery");
            System.out.println("Charging "+v.getClass().getSimpleName()+" battery in progress....");
            System.out.println(v.getClass().getSimpleName()+" battery charged");
            v.chargeBattery();
        }
        else
        {
            System.out.println("The "+v.getClass().getSimpleName()+" has "+v.getBatteryPercentage()+"% battery");
        }
    }
}
