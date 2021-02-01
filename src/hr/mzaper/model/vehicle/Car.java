package hr.mzaper.model.vehicle;

public class Car implements Vehicle{

    int ticketPrice=50;

    @Override
    public int getTicketPrice() {
        return ticketPrice;
    }
}
