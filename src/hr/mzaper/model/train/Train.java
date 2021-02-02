package hr.mzaper.model.train;

import hr.mzaper.model.vehicle.Vehicle;

public interface Train {

    int getSpace();
    boolean addVehicle(Vehicle vehicle);

}
