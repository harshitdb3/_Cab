import java.util.ArrayList;

public class Rider extends UserBasicInfo
{
    private ArrayList<RideHistory> rideHistory;


    public Rider(String _name,Integer _phoneNumber,String _sex)
    {
        super(_name,_phoneNumber,_sex);

    }

    public void UpdateRideHistory(RideHistory ride)
    {
        rideHistory.add(ride);
    }

    
}
