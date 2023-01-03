// See https://aka.ms/new-console-template for more information
public abstract class Booking
{
    public abstract void ticketBooking();

}



public class AirBooking:Booking
{

    public override void ticketBooking()
    {
        Console.WriteLine("Booking Air  Ticket");
    }

}

public class BusBooking:Booking
{

    public override void ticketBooking()
    {
        Console.WriteLine("Booking Bus Ticket");
    }

}

public class Agent
{
    private Booking BookingType;
    private string AgentName;
    public Agent(string AgentName)
    {
        this.AgentName = AgentName;
        
    }

    public void Book(ref Booking book)
    {
        this.BookingType = book;
        book.ticketBooking();
    }

}

public class Program
{
    public static void Main(string[] Args)
    {
        Agent agent = new Agent("ABC Travels");
        string BookingType;
        BookingType=Console.ReadLine();
        switch (BookingType)
        {
            case "Air Booking":
                AirBooking airBooking = new AirBooking();
                agent.Book(airBooking);
                break;
            case "Bus Booking":
                BusBooking busBooking = new BusBooking();
                agent.Book(busBooking);
                break;
        }
        
    }
}
