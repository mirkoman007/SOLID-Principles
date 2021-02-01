package hr.mzaper.model.vehicle;

public class Bus implements Vehicle{

    int ticketPrice=70;

    @Override
    public int getTicketPrice() {
        return ticketPrice;
    }
}
