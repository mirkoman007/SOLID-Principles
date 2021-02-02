package hr.mzaper.model.vehicle;

import java.util.Random;

public class Van implements Vehicle{

    public Van() {
        gasPercentage=new Random().nextInt(101);
        batteryPercentage=new Random().nextInt(101);
    }

    int ticketPrice=80;
    int gasPercentage;
    int batteryPercentage;

    @Override
    public int getTicketPrice() {
        return ticketPrice;
    }

    @Override
    public int getGasPercentage() {
        return gasPercentage;
    }

    @Override
    public boolean refuelGas() {
        if(gasPercentage<100)
        {
            gasPercentage=100;
            return true;
        }
        else return false;
    }

    @Override
    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    @Override
    public boolean chargeBattery() {
        if(batteryPercentage<100)
        {
            batteryPercentage=100;
            return true;
        }
        else return false;
    }
}
