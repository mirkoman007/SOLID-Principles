package hr.mzaper;

import hr.mzaper.model.train.BigTrain;
import hr.mzaper.model.train.SmallTrain;
import hr.mzaper.model.train.Train;
import hr.mzaper.model.vehicle.*;
import hr.mzaper.model.worker.Worker;

import java.util.ArrayList;

public class Solid {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Vehicle> queueVehicles = new ArrayList<>();
        ArrayList<Train> trains=new ArrayList<>();

        GenerateVehiclesInQueue(queueVehicles);


        int suma = 0;
        for(Vehicle v:queueVehicles) suma += v.getTicketPrice();
        System.out.println("Income from ticket sales "+suma+" kn");


        trains.add(new SmallTrain());
        trains.add(new BigTrain());

        Worker w=new Worker();

        for (int i = 0; i < 14; i++) {
            w.parkVehicle(queueVehicles.get(0),trains);
            queueVehicles.remove(0);
        }


        System.out.println("Worker's salary "+w.getSalary()+" kn");

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
