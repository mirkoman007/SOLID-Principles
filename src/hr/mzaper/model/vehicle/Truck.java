package hr.mzaper.model.vehicle;

public class Truck implements Vehicle{

    int ticketPrice=90;

    @Override
    public int getTicketPrice() {
        return ticketPrice;
    }
}
