

public class RideHistory
{
    Location ridestartLocation;
    Location rideEndLocation;
    String rideDate;
    String driverName;
    String driverPhoneNo;
    String rideStartTime;
    String rideEndTime;
    String fare;
    Float rideDistance;

    public RideHistory(Location _ridestartLocation,Location _rideEndLocation,String _rideDate,String _driverName,
    String _driverPhoneNo,String _rideStartTime,String _rideEndTime,String _fare,Float _rideDistance)
    {
        ridestartLocation = _ridestartLocation;
        rideEndLocation = _rideEndLocation;
        rideDate = _rideDate;
        driverName = _driverName;
        driverPhoneNo = _driverPhoneNo;
        rideStartTime = _rideStartTime;
        rideEndTime = _rideEndTime;
        fare = _fare;
        rideDistance = _rideDistance;
    }
    public void PrintRideHistory()
    {
        //To Do
    }
    

}