package hr.mzaper;

import hr.mzaper.model.train.BigTrain;
import hr.mzaper.model.train.SmallTrain;
import hr.mzaper.model.train.Train;
import hr.mzaper.model.vehicle.*;
import hr.mzaper.model.worker.BasicEmployee;
import hr.mzaper.model.worker.BonusEmployee;
import hr.mzaper.model.worker.Employee;

import java.util.ArrayList;

public class Solid {

    public static void main(String[] args) {

        ArrayList<Vehicle> queueVehicles = new ArrayList<>();
        ArrayList<Train> trains=new ArrayList<>();

        GenerateVehiclesInQueue(queueVehicles);


        int suma = 0;
        for(Vehicle v:queueVehicles) suma += v.getTicketPrice();
        System.out.println("Income from ticket sales "+suma+" kn\n");


        trains.add(new SmallTrain());
        trains.add(new BigTrain());


        Employee basicEmployee=new BasicEmployee();

        for (int i = 0; i < 5; i++) {
            basicEmployee.checkGas(queueVehicles.get(0));
            basicEmployee.checkBattery(queueVehicles.get(0));

            basicEmployee.parkVehicle(queueVehicles.get(0),trains);
            System.out.println();

            queueVehicles.remove(0);
        }
        System.out.println(basicEmployee.getClass().getSimpleName()+"'s salary "+basicEmployee.getSalary()+" kn\n");

        System.out.println("=================================================================");


        Employee bonusEmployee=new BonusEmployee();

        for (int i = 0; i < queueVehicles.size(); i++) {
            bonusEmployee.checkGas(queueVehicles.get(0));
            bonusEmployee.checkBattery(queueVehicles.get(0));

            bonusEmployee.parkVehicle(queueVehicles.get(0),trains);
            System.out.println();

            queueVehicles.remove(0);
        }
        System.out.println(bonusEmployee.getClass().getSimpleName()+"'s salary "+bonusEmployee.getSalary()+" kn\n");




    }

    private static void GenerateVehiclesInQueue(ArrayList<Vehicle> queueVehicles) {
        for (int i = 0; i < 5; i++) {
            queueVehicles.add(new Car());
        }
        for (int i = 0; i < 3; i++) {
            queueVehicles.add(new Van());
        }

        for (int i = 0; i < 4; i++) {
            queueVehicles.add(new Bus());
        }
        for (int i = 0; i < 2; i++) {
            queueVehicles.add(new Truck());
        }
    }
}
