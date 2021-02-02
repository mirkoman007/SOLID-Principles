package hr.mzaper.model.train;

import hr.mzaper.model.vehicle.Vehicle;

import java.util.ArrayList;

public abstract class Train {

    int space;
    ArrayList<Vehicle> vehicles;

    public Train(int space) {
        this.space=space;
        vehicles = new ArrayList<>();
    }


    public int getSpace() {
        return space;
    }

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
