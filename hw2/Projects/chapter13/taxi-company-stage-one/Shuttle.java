import java.util.List;
import java.util.LinkedList;
    
/**
 * A shuttle is able to carry multiple passengers.
 * 
 * @author David J. Barnes and Michael Kolling
 * @version 2002.06.20
 */
public class Shuttle extends Vehicle
{
    // The list of destinations for the shuttle.
    private List destinations;
    // The list of passengers on the shuttle.
    private List passengers;

    /**
     * Constructor for objects of class Shuttle
     * @param company The taxi company. Must not be null.
     * @param location The vehicle's starting point. Must not be null.
     * @throws NullPointerException If company or location is null.
     */
    public Shuttle(TaxiCompany company, Location location)
    {
        super(company, location);
        destinations = new LinkedList();
        passengers = new LinkedList();
    }

    /**
     * Carry out a shuttle's actions.
     */
    public void act()
    {
    }

    /**
     * @return Whether or not this vehicle is free.
     */
    public boolean isFree()
    {
        return true;
    }
    
    /**
     * Receive a pickup location.
     * @location The pickup location.
     */
    public void setPickupLocation(Location location)
    {
        destinations.add(location);
        chooseTargetLocation();
    }
    
    /**
     * Receive a passenger.
     * Add their destination to the list.
     * @param passenger The passenger.
     */
    public void pickup(Passenger passenger)
    {
        passengers.add(passenger);
        destinations.add(passenger.getDestination());
        chooseTargetLocation();
    }

    /**
     * Decide where to go next, based on the list of
     * possible destinations.
     */
    private void chooseTargetLocation()
    {
    }

    /**
     * Offload a passenger whose destination is the
     * current location.
     */
    public void offloadPassenger()
    {
    }
}