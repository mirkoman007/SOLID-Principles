package hr.mzaper.model.train;

import hr.mzaper.model.vehicle.Vehicle;

import java.util.ArrayList;

public class SmallTrain implements Train {

    int space;
    ArrayList<Vehicle> vehicles;

    public SmallTrain() {
        space=8;
        vehicles = new ArrayList<>();
    }


    @Override
    public int getSpace() {
        return space;
    }

    @Override
    public boolean addVehicle(Vehicle vehicle) {
        if(space>0)
        {
            vehicles.add(vehicle);
            space--;
            return true;
        }
        else return false;
    }
}
