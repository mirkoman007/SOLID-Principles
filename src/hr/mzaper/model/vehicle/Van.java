package hr.mzaper.model.vehicle;

public class Van implements Vehicle{

    int ticketPrice=80;

    @Override
    public int getTicketPrice() {
        return ticketPrice;
    }
}
