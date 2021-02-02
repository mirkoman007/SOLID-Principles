package hr.mzaper.model.vehicle;

import java.util.Random;

public abstract class Vehicle{

    public Vehicle(int ticketPrice) {
        this.ticketPrice=ticketPrice;
        gasPercentage=new Random().nextInt(101);
        batteryPercentage=new Random().nextInt(101);
    }

    int ticketPrice;
    int gasPercentage;
    int batteryPercentage;

    public int getTicketPrice() {
        return ticketPrice;
    }

    public int getGasPercentage() {
        return gasPercentage;
    }

    public boolean refuelGas() {
        if(gasPercentage<100)
        {
            gasPercentage=100;
            return true;
        }
        else return false;
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public boolean chargeBattery() {
        if(batteryPercentage<100)
        {
            batteryPercentage=100;
            return true;
        }
        else return false;
    }
}
