package hr.mzaper.model.vehicle;

public interface Vehicle {

    int getTicketPrice();

    int getGasPercentage();
    boolean refuelGas();

    int getBatteryPercentage();
    boolean chargeBattery();
}
