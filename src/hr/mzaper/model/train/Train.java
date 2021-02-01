package hr.mzaper.model.train;

import hr.mzaper.model.vehicle.Vehicle;

public interface Train {

    public int getSpace();
    public boolean addVehicle(Vehicle vehicle);

}
