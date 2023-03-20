abstract class UserBasicInfo
{
    String name;
    Integer phoneNumber;
    String sex;
    Integer rating;
    Integer totalUserRated;
    private Location currentLocation;

    public UserBasicInfo(String _name,Integer _phoneNumber,String _sex)
    {
        name = _name;
        phoneNumber = _phoneNumber;
        sex = _sex;
        //Setting Initial rating
        rating = 0;
        totalUserRated = 0;
    }

        
    //Start the service which updates the location frequently
    //This can be called on driver's device per few 30 seconds to update the location 
    public void UpdateLocation(Location updatedLocation)
    {
        currentLocation = updatedLocation;
    }

    public Location getCurrentLocation()
    {
         return currentLocation;
    }

    public void UpdateRating(Integer currentRating)
    {
        totalUserRated++;
        rating = currentRating + rating;

    }

    public String getName()
    {
        return name;
    }
    public String getSex()
    {
        return sex;
    }

    public Integer getPhonenumber()
    {
        return phoneNumber;
    }
    public Integer getRating()
    {
        return rating/totalUserRated;
    }




}